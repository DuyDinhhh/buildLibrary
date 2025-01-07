def call() {
      stage('Package') {
            steps {
              sh 'mvn clean package'
          }
      }
}
