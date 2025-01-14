def call() {
     stage('Build Application') {
          def jdkTool = tool 'jdk17'
          withEnv(["JAVA_HOME=${jdkTool}"]) {
               sh 'mvn compile'
              }
     }
}
