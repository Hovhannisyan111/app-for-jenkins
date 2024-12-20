def call(Map config = [:]) {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    echo "Building project..."
                    sh './gradlew build' // Replace with your build command
                }
            }
            stage('Test') {
                steps {
                    echo "Running tests..."
                    sh './gradlew test' // Replace with your test command
                }
            }
        }
    }
}
