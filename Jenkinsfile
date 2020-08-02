pipeline {
  agent any
  stages {
    stage('Multiple Build') {
      parallel {
        stage('Build 1') {
          agent any
          steps {
            sh 'echo Building 1 ...'
            sh 'sleep 8'
            sh 'echo DONE'
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
        sh 'echo testing...'
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