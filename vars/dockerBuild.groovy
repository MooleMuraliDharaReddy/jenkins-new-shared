def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     docker build -t ${ecr_repoName}:${BUILD_ID} .
     docker tag ${ecr_repoName}:${BUILD_ID} ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:${BUILD_ID}
    """
}
