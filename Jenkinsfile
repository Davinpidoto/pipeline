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
                    withEnv(["WORK=${WORKSPACE}"]) {
                        try {
                            sh 'echo ${WORKSPACE}'
                            sh 'docker-compose up -d'
                            sh '/project/gradlew test'
                            sh 'docker-compose down'
                        }
                        finally {
                            junit '**/build/test-results/test/*.xml'
                        }
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