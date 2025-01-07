def call() {
      stage('Package') {
           
              sh 'mvn clean package'
          
      }
}
