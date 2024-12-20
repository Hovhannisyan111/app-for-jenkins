library identifier: 'shared-library@main', retriever: modernSCM([
    $class: 'GitSCMSource',
    remote: '.' // Use the current repository as the source
])

pipeline {
    agent any
    stages {
        stage('Initialize') {
            steps {
                script {
                    myUtil.sayHello('Amigo')
                }
            }
        }
        stage('Shared Library Pipeline') {
            steps {
                script {
                    examplePipeline()
                }
            }
        }
        stage('Custom Step') {
            steps {
                script {
                    def reversed = org.example.Helper.reverse('Amigo')
                    echo "Reversed name: ${reversed}"
                }
            }
        }
    }
}

