pipeline {
    agent any
    tools { 
        maven 'M3' 
    }
    
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'DEV',
                    url: 'https://github.com/msansone73/sansone-fin.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true -Dspring.profiles.active=dev clean package "

            }

        }
        stage('Test') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn  -Dspring.profiles.active=dev test"

            }

        }        
    }
}