def call() {
     stage('Package Application') {
          def jdkTool = tool 'jdk17'
          withEnv(["JAVA_HOME=${jdkTool}"]) {
          sh 'mvn clean package'
         }
     }
}
