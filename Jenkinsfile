pipeline {
	agent {
		docker {
			image 'nginx'
			label "web"
			args "-v ~/jenkins_home/workspace/job1/app-for-jenkins:/usr/share/nginx/html"
			args "-p 80:80"
		}
	}

	stages {
		stage("Add text") {
			steps {
				sh"""
				echo "Start"
				ls -la
				echo "Build by Jenkins build: $BUILD_ID" >> index.html
				cat index.html
				echo "Finish"
				"""
			}
		}
	}
}
