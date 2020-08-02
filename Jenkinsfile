pipeline {
  agent any
  stages {
    stage('Multiple Build') {
      parallel {
        stage('Build 1') {
          agent any
          steps {
            sh 'echo Building 1 ...'
          }
        }

        stage('Build 2') {
          agent any
          steps {
            sh 'echo "Building 2 ..."'
          }
        }

      }
    }
	stage('Tests') {
		steps{
			sh 'echo testing...'
			sh 'sleep 3'
			sh 'echo Test 100% success!'
		}
	}
	stage('Deploy') {
		steps{
			
			sh 'echo deploying...'
			sh 'sleep 5'
			sh 'echo done!'
		}
	}
  }
}
