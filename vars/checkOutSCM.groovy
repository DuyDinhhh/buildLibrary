def call () {
    stage('Checkout Code') {
        deleteDir()
        checkout scm
    }
}
