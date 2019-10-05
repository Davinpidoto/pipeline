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
                            sh 'docker-compose run app bash ls /project'
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