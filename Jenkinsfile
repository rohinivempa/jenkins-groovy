@Library('my-shared-lib') _  // Load the shared library


pipeline {
    agent any

    stages {
        stage('Greet') {
            steps {
                script {
                    greet('Alice')  // Call global method from vars/greet.groovy
                }
            }
        }
    }
}
