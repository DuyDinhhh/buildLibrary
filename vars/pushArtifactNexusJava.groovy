def call(Map config) {
    stage('Push to Nexus') {
     
            script {
                def artifactPath = "target/${config.NEXUS_ARTIFACT_ID}-0.0.1.jar"
                def artifactVersion = "${config.ARTIFACT_VERS}-${env.DEPLOY_TAG}"
                nexusArtifactUploader(
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    nexusUrl: config.NEXUS_URL,
                    groupId: config.NEXUS_GROUP,
                    version: artifactVersion,
                    repository: config.NEXUS_REPOSITORY,
                    credentialsId: config.NEXUS_CREDENTIALS_ID,
                    artifacts: [
                        [
                            artifactId: config.NEXUS_ARTIFACT_ID,
                            classifier: '',
                            file: artifactPath,
                            type: 'jar'
                        ]
                    ]
                )
            }
        
    }
}
