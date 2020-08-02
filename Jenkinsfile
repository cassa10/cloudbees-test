pipeline {
  agent any
  stages {
    stage('Buzz buzz') {
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

  }
}
