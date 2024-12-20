@Library('my-shared-library@master') _

// Define your pipeline
pipeline {
    agent any

    // Pipeline-level options
    options {
        skipDefaultCheckout() // Skip automatic source code checkout
        timestamps()          // Add timestamps to the log
    }

    environment {
        APP_ENV = 'production'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout source code
                    checkout scm
                }
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // Call a shared library function
                    myLibrary.buildProject()
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Call a shared library function for testing
                    myLibrary.runTests()
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deploy using a shared library function
                    myLibrary.deployApplication(env.APP_ENV)
                }
            }
        }
    }

    post {
        always {
            script {
                // Use shared library for sending notifications
                myLibrary.notify('Pipeline completed!')
            }
        }
    }
}
