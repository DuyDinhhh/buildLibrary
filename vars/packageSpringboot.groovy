def call() {
     def jdkTool = tool 'jdk17'
     stage('Package') {
          withEnv(["JAVA_HOME=${jdkTool}"]) {
          sh 'mvn clean package'
         }
     }
}
