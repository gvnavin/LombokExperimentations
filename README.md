# LombokExperimentations
Project for doing Lombok learn / experiments / testing

alias dlf='java -jar ~/bin/lombok.jar delombok -p'

function dlp {
	java -jar ~/bin/lombok.jar delombok $1 -d $2
}

dlp src out
