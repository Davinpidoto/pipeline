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
                  docker.image('mysql:5').withRun('-e "MYSQL_ROOT_PASSWORD=password" -p 3306:3306') { c ->
                          sh 'while ! mysqladmin ping -h0.0.0.0 --silent; do sleep 1; done'
                          sh 'make check'
                          sh './gradlew clean test --no-daemon'
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