@Library('my-shared-lib') _  // Load the shared library

import org.example.Utils

pipeline {
    agent any

    stages {
        stage('Greet') {
            steps {
                script {
                    greet('Alice')  // Call global method from vars/greet.groovy

                    def utils = new Utils(this)
                    utils.sayBye('Alice')  // Call method from src/org/example/Utils.groovy
                }
            }
        }
    }
}
