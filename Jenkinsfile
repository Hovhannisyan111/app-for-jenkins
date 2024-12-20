library identifier: 'shared-library', retriever: modernSCM([
    $class: 'GitSCMSource',
    remote: '.' // Use the current repository as the source
])

pipeline {
    agent any
    stages {
        stage('Initialize') {
            steps {
                echo "Initializing pipeline..."
                myUtil.sayHello('Amigo') // Call the utility function from the shared library
            }
        }
        stage('Shared Library Pipeline') {
            steps {
                examplePipeline() // Call the pipeline defined in the shared library
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
