pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                script {
                    try {
                      docker.image('mysql:5.7').withRun('-e MYSQL_ROOT_PASSWORD=password -p 3306:3306') { c ->
                              sh './gradlew clean test --no-daemon'
                          }
                    } finally {
                        junit '**/build/test-results/test/*.xml'
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}