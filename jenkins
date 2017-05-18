pipeline {
    agent any

    stages {
        stage('compile') {
            steps{
            	 sh './mvnw compile'
            }
        }
        stage('Unit Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('build') {
            steps {
                sh './mvnw package'
            }
        }
    }
}