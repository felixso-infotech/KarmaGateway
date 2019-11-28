pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '~/servers/apache-maven-3.6.2/bin/mvn spring-boot:run'
      }
    }
  }
}