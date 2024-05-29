// File: DeployToAWS.groovy

def call(String awsCredentials, String awsRegion, String clusterName) {
    // Just return the parameters, the script block will be handled in the main Jenkinsfile
    return [awsCredentials: awsCredentials, awsRegion: awsRegion, clusterName: clusterName]
}
