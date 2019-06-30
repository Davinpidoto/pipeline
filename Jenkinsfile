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
                        docker.image('mysql:5.7').withRun('-e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=pipeline') { c ->
                            docker.image('mysql:5.7').inside("--link ${c.id}:db") {
                            }
                            docker.image('openjdk').inside("--link ${c.id}:db") {
                                sh '/project/gradlew test'
                            }
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