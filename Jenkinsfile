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
                      docker.image('openjdk').withRun().inside("-v /home/jenkins/:/") { c ->
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