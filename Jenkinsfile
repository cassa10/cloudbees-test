pipeline {
  agent { label 'maven-jdk8' }
  stages {
    stage('Build') {
      steps {
          sh 'echo Building...'
          sh 'chmod +x build.sh'
          sh './build.sh'
          sh 'echo Done'
      }
    }

    stage('Tests') {
      parallel {
        stage('Test E2E') {
          steps {
            sh 'echo E2E Tests'
            sh 'chmod +x runTests.sh'
            sh './runTests.sh 10'
            sh 'sleep 10'
            sh 'echo Test 100% success!'
          }
        }

        stage('Test Front') {
          steps {
            sh 'echo Frontend Tests'
            sh 'chmod +x runTests.sh'
            sh './runTests.sh 25'
            sh 'sleep 6'
            sh 'echo Test 100% success!'
          }
        }

      }
    }

	
	stage('Archive artifacts'){
	  steps {
          archiveArtifacts 'demo-cloudbees/target/*.jar'
          archiveArtifacts 'demo-cloudbees/target/surefire-reports/*.xml'
      }
	}

  }
}