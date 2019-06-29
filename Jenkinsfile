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
                      docker.image('mysql:5').withRun('-e "MYSQL_ROOT_PASSWORD=password" -p 3306:3306') { c ->
                              sh 'while ! mysqladmin ping -h0.0.0.0 --silent; do sleep 1; done'
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