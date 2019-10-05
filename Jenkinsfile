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
                            sh 'docker-compose run /project/gradlew test'
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