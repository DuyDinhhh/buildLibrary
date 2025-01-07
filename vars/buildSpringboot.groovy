def call() {
    stage('Compile') {
       sh 'mvn compile'
  }
}
