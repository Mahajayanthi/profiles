pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
                script {
                    // Check if directory exists before removing it
                    if (fileExists('profiles')) {
                        bat "rmdir /s /q profiles"
                    }
                    
                    bat "git clone https://github.com/Mahajayanthi/profiles.git"
                    bat "mvn clean -f profiles"
                }
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f profiles"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f profiles"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f profiles"
            }
        }
    }
}
