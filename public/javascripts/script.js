var cont=0;
function testeProblema() {
	var problema = document.getElementById("problema");
	var valor = ""+problema.value;
	if (valor != "A" 
		&& valor != "a"
		&& valor != "B"
		&& valor != "b" 
		&& cont == 0) {
		
		cont++;
		alert("Informe um problema válido!");
		window.location.reload();
	} 
}

	