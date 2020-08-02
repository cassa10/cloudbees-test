pipeline {
    agent any;
	stages {
		stage('Build') {
			steps {
				sh 'echo building...'
				sh 'echo DONE!'
			}
		}
		stage('Deploy'){
			agent any;
			steps{
				sh 'echo deploying...'
				sh 'echo DONE!'
			}
		}
	}
}

