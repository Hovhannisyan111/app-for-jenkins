@Library("shared-library") _
pipeline {	
	agent any
	
	environment {
		config.name = "Arman"
	}

	stages {
		stage("Hello") {
			steps {
				helloWorld()
			}
		}
	}
}
