def call() {
    stage('Compile') {
      steps {
          sh 'mvn compile'
       }
  }
}
