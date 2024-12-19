pipeline {
    agent any
    parameters {
        string(name: 'BRANCH_NAME', defaultValue: '', description: 'Branch Name from Webhook')
    }
    stages {
        stage('Process Webhook') {
            steps {
		echo "Hello Gugush"
                echo "Build triggered for branch: ${params.BRANCH_NAME}"
            }
        }
    }
}
