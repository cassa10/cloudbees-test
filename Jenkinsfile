pipeline {
  agent any
  stages {
    stage('Multiple Build') {
      parallel {
        stage('Build 1') {
          agent any
          steps {
            sh 'echo Building 1 ...'
            sh './jenkins/build.sh'
            sh 'ls -la'
          }
        }

        stage('Build 2') {
          agent any
          steps {
            sh 'echo "Building 2 ..."'
            sh 'sleep 22'
            sh 'echo DONE'
          }
        }

      }
    }

    stage('Tests') {
      steps {
		sh 'chmod +x runTests.sh'
        sh './runTests.sh'
        sh 'sleep 3'
        sh 'echo Test 100% success!'
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo deploying...'
        sh 'sleep 5'
        sh 'echo done!'
      }
    }

  }
}