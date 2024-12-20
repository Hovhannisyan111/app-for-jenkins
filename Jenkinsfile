library identifier: 'shared-library', retriever: modernSCM([
    $class: 'GitSCMSource',
    remote: '.' // Use the current repository as the source
])

pipeline {
    agent any
    stages {
        stage('Initialize') {
            steps {
                script {
                    // Call the utility function from the shared library
                    myUtil.sayHello('Amigo')
                }
            }
        }
        stage('Shared Library Pipeline') {
            steps {
                script {
                    // Call the pipeline logic defined in the shared library
                    examplePipeline()
                }
            }
        }
        stage('Custom Step') {
            steps {
                script {
                    // Call the helper class method from the shared library
                    def reversed = org.example.Helper.reverse('Amigo')
                    echo "Reversed name: ${reversed}"
                }
            }
        }
    }
}

