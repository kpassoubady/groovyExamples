pipeline {
    agent {
        label 'master'
    }
    stages {
        stage('FunBox Fortune') {
            agent {
                docker { image 'wernight/funbox' }
            }
            steps {
                ansiColor('xterm') {
                    sh 'fortune'
                }
            }
        }
        stage('WhaleSay Mooo') {
            agent {
                docker { image 'docker/whalesay' }
            }
            steps {
                ansiColor('xterm') {
                  sh 'cowsay moooo'
                }
            }
        }
    }
}
