pipeline {
  agent any
  stages {
    stage('npm-install') {
      steps {
        sh 'sudo npm install'
      }
    }

    stage('build') {
      steps {
        sh 'mvn spring-boot:run'
      }
    }

  }
}