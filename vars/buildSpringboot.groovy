def call() {
     stage('Compile'){
     def jdkTool = tool 'jdk17'
     withEnv(["JAVA_HOME=${jdkTool}"]) {
          sh 'mvn compile'
         }
     }
}
