def call(String branch, String credentialsId, String url) {
    stage('Clone the repository') {
        steps {
            script {
                git branch: branch, credentialsId: credentialsId, url: url
            }
        }
    }
}
