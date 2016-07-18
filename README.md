# LombokExperimentations
Project for doing Lombok learn / experiments / testing

alias dlf='java -jar ~/bin/lombok.jar delombok -p'

function dlp {
	java -jar ~/bin/lombok.jar delombok $1 -d $2
}

dlp src out


To make Lombok to work in intellij, install Lombok plugin and enable Annotation preprocessing.

Steps to enable Annotation Preprocessing in intellij
Preferences -> Build, Execution, Deployment -> Compiler -> Annotation Processors -> Enable annotation processing
