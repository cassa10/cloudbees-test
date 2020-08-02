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

  }
}
