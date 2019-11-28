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
        sh '/home/sanilkumar_onlinework/servers/apache-maven-3.6.2/bin/mvn spring-boot:run'
      }
    }
  }
}