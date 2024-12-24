@Library('shared-library') _

pipeline {
	agent any

	stages{
		stage("Initialize") {
			steps {
				script {
					ls
					myPipe("Hello, Amigo!")
					def greeting = MyHelper.generateGreeting('Amigo')
					echo greeting
				}
			}
		}
	}
}
