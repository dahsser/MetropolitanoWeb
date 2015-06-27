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
google.maps.event.addListener(map, "rightclick", function(event) {
    var lat = event.latLng.lat();
    var lng = event.latLng.lng();
    // populate yor box/field with lat, lng
    alert("Lat=" + lat + "; Lng=" + lng);
});
google.maps.event.addListener(map, 'click', function(event) {

    marker = new google.maps.Marker({position: event.latLng, map: map});

});