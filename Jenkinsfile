@Library('shared-library') _

pipeline {
	agent any

	stages{
		stage("Initialize") {
			steps {
				script {
					myPipe("Hello, Amigo!")
					def greeting = MyHelper.generateGreeting('Amigo')
					echo greeting
				}
			}
		}
	}
}
