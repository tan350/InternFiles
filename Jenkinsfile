pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build Application'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Test Application'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploy application'
            }
        }
        
    }
    post{
        always{
            emailext body: 'Summary', subject: 'Pipeline Status', to: 'tasharma@Bebotechnologies.com'
        }
    }
}
