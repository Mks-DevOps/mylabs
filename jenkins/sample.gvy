# jenkins uses groovy scripting
//jenkins pipeline as code commenting , /* code */ multiline commenting
/*pipeline {
    agent {
        labels 'jenkins-master' // inside nodes get lables or we can simple use agent any - then jenkins will choose any node while executing a script
    }
    
}*/
//agent any keyword defines project will run on any node
pipeline {
    agent any
    stages {
        stage ('stage1-compile'){
            steps { // all the steps under compile stage comes here like: general, source code management , build triggers, build events and build steps

            }
            post {
                // post build actions
            }
        }
        stage ('stage2-codereview') {
            steps {
               // all the steps for codereview 
            }
            post {

            }
        }
        stage ('stage3-unit-test') {
            steps {
               // all the steps for unit-test
            }
            post {
                
            }
        }
        stage ('stage4-code-coverage') {
            steps {
               // all the steps for coder-coverage
            }
            post {
                
            }
        }
        stage ('stage5-package') {
            steps {
               // all the steps for coder-coverage
            }
            post {
                
            }
        }
    }
}

