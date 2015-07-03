function alerta(){
    alert("GIGI");
}
function verificar(patron,elemento){
	if (!patron.test(elemento.value)) {
		elemento.value='';
		elemento.focus();
		return 0;
	}
}
function initialize() {
  var mapProp = {
    center:new google.maps.LatLng(-12.015495699999999, -77.0500489),
    zoom:14,
    mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  var map=new google.maps.Map(document.getElementById("googleMap"), mapProp);
}
google.maps.event.addDomListener(window, 'load', initialize);


/*Geo*/

var x = document.getElementById("demo");

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else { 
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
    x.innerHTML = "Latitude: " + position.coords.latitude + 
    "<br>Longitude: " + position.coords.longitude;	
}

// End geo