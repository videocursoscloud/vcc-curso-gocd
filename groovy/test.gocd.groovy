import cd.go.contrib.plugins.configrepo.groovy.dsl.*

GoCD.script {
  pipelines {
    pipeline('build') {
      group = 'go-cd'
      lockBehavior = 'lockOnFailure'
      trackingTool {
        link = 'https://github.com/ketan/gocd-groovy-dsl-config-plugin/issues/${ID}'
        regex = ~/##(\d+)/
      }

      environmentVariables = [
        'pipeline-var': 'pipeline-value'
      ]

      materials {
        git('my-repo') {
          url = 'https://github.com/ketan/gocd-groovy-dsl-config-plugin'
          branch = 'master'
          blacklist = ['README.md', "examples/**/*"]
        }
      }

      stages {
        stage('test') {
          environmentVariables = [
            'stage-var': 'stage-value'
          ]
          jobs {
            job('build') {
              tasks {
                bash {
                  commandString = "git clean -fdx"
                }

                bash {
                  commandString = './gradlew clean assemble test'
                }
              }
            }
          }
        }
      }
    }
  }
}
