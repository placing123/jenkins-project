job('maven_dsl'){
description("This is simple first codepipeline maven project")

scm{
     git("https://github.com/placing123/jenkins-project.git" ,'main')

}
triggers{
        scm('* * * * *')

}
steps{
     maven('clean package','single-module/pom.xml')

}
publishers{
           archiveArtifacts '**/*.jar'

}

}
