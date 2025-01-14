def call() {
    stage('Upload Artifact to Nexus'){
        script {
                def artifactPath = "target/${env.NEXUS_ARTIFACT_ID}-0.0.1.jar"
                def artifactVersion = "${env.ARTIFACT_VERS}-${env.DEPLOY_TAG}"
                nexusArtifactUploader(
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    nexusUrl: env.NEXUS_URL,
                    groupId: env.NEXUS_GROUP,
                    version: artifactVersion,
                    repository: env.NEXUS_REPOSITORY,
                    credentialsId: env.NEXUS_CREDENTIALS_ID,
                    artifacts: [
                        [artifactId: env.NEXUS_ARTIFACT_ID,
                         classifier: '',
                         file: artifactPath,
                         type: 'jar']
                    ])
        }
    }
}
