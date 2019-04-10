node('master') {
    
    stage('CleanTestArchive') {
            dir('/var/lib/jenkins/workspace/gradle_test_pipeline/web-hello-world') {
            sh './gradlew clean test'
            junit testResults: '/var/lib/jenkins/workspace/gradle_test_pipeline/web-hello-world/src/test/java/testreport.xml', allowEmptyResults: true
            archiveArtifacts artifacts: 'src/test/java/testreport.xml', fingerprint: true
            }
    }

    stage('ArchiveWar') {
        dir('/var/lib/jenkins/workspace/gradle_test_pipeline/web-hello-world') {
        sh './gradlew clean war'
        archiveArtifacts artifacts: 'build/libs/web-hello-world.war', fingerprint: true
        } 
    }
}
