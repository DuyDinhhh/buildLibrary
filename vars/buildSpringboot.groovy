def call() {
     def jdkTool = tool 'jdk17'
     stage('Compile'){
          withEnv(["JAVA_HOME=${jdkTool}"]) {
               sh 'mvn compile'
         }
     }
}
