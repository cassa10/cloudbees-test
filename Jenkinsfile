pipeline {
  agent any
  stages {
    stage('Build') {
	  agent maven;
      steps {
		dir(){
          sh 'echo Building...'
          sh 'chmod +x build.sh'
          sh './build.sh'
          sh 'echo Done'
		}
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

    stage('Deploy on port 8080') {
	  agent maven;
      steps {
        sh 'echo deploying...'
        sh 'java -jar demo-cloudbees/target/demo-cloudbees-0.0.1-SNAPSHOT.jar'
        sh 'echo done!'
      }
    }

	stage('Archive artifacts'){
	  steps{
	    sh 'Archiving artefacts ...'
		sh 'Archiving jar'
		archiveArtifacts(artifacts: 'demo-cloudbees/target/*.jar', fingerprint: true)
		sh 'Archiving tests reports'
		archiveArtifacts(artifacts: 'demo-cloudbees/target/surefire-reports/*.xml', fingerprint: true)
		sh 'Done!'
      }
	}

  }
}