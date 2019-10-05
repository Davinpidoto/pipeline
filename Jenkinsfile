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
                        sh 'docker-compose run --rm app /project/gradlew -p /project clean test'
                    }
                    finally {
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