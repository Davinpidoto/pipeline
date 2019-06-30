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
                      docker.image('gradle:5.4.1-jdk8').withRun().inside("-v /home/jenkins/:/") { c ->
                              sh 'echo jave -version'
                          }
                    } finally {
//                        junit '**/build/test-results/test/*.xml'
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