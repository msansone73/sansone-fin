pipeline {
    agent any
    tools { 
        maven 'M3' 
    }
    
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                //git 'https://github.com/msansone73/sansone-fin.git'
                git branch: 'DEV',
                    url: 'https://github.com/msansone73/sansone-fin.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

            }

        }
        stage('Test') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn test"

            }

        }        
    }
}