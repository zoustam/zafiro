pipeline {
    agent any
    
    triggers {
        pollSCM('0 5 * * * ? ')
    }

    stages {
        stage('compile') {
            steps{
            	 sh 'chmod +x mvnw'
            	 sh './mvnw compile'
            }
        }
        stage('Unit Test') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw test'
            }
        }
        stage('build') {
            steps {
           		sh 'chmod +x mvnw'
                sh './mvnw package'
            }
        }
    }
}