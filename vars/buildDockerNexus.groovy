def call(){
   stage('Build Docker Image') {
       def artifactVersion = "${env.ARTIFACT_VERS}-${env.DEPLOY_TAG}"
       sh "docker build -t ${env.NEXUS_URL_DOCKER}/docker-releases/${env.NEXUS_ARTIFACT_ID}:${artifactVersion} ."
   }
}
