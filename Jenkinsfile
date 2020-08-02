pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo Building...'
        sh 'sleep 5'
        sh 'echo Done'
        sh 'ls -la'
      }
    }

    stage('Tests') {
      parallel {
        stage('Test Back') {
          steps {
            sh 'echo Backend Tests'
            sh 'chmod +x runTests.sh'
            sh './runTests.sh'
            sh 'sleep 3'
            sh 'echo Test 100% success!'
          }
        }

        stage('Test Front') {
          steps {
            sh 'echo Frontend Tests'
            sh 'chmod +x runTests.sh'
            sh './runTests.sh'
            sh 'sleep 6'
            sh 'echo Test 100% success!'
          }
        }

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