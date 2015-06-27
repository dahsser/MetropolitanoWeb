function consultar(){
	   	var destino=document.getElementById('direccion');
	   	var patrondestino=/^[A-Za-z][a-z ]{1,50}$/;
	   	verificar(patrondestino,destino);
        console.log('Cumple')
}
function verificar(patron,elemento){
		if (!patron.test(elemento.value)) {
			elemento.value='';
			elemento.focus();
			return 0;
		}
}