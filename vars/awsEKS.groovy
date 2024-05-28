def call(credentialsId) {
  withAWS(credentials: credentialsId, region: 'us-east-1') {
    // Connect to the EKS cluster
    sh ''' 
    aws eks update-kubeconfig --name dev-cluster --region us-east-1
    kubectl get pods
    '''
  }
}
