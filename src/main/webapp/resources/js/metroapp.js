var myCenter=new google.maps.LatLng(-11.981711, -77.058742);
var latLon = [];
var mapOptions = {
    center: myCenter,
    zoom: 14,
    disableDefaultUI: true,
    mapTypeId: google.maps.MapTypeId.ROADMAP
};
function verificar(patron,elemento){
	if (!patron.test(elemento.value)) {
		elemento.value='';
		elemento.focus();
		return 0;
	}
}
var i=0;
function initialize() {
    var map = new google.maps.Map(document.getElementById("googleMap"), mapOptions);

    google.maps.event.addListener(map, 'click', function(event) {
        i++;
        /*Captura de coordenadas*/
        alert("Latitude: " + event.latLng.lat() + "\r\nLongitude: " + event.latLng.lng());
        if(i==1){
            document.getElementById('latitud1').value=event.latLng.lat();
            document.getElementById('longitud1').value=event.latLng.lng();
        }
        if(i==2){
            document.getElementById('latitud2').value=event.latLng.lat();
            document.getElementById('longitud2').value=event.latLng.lng();
            document.getElementById('datos').submit();
        }
        var marker = new google.maps.Marker({
            position: event.latLng,
            map: map,
        });
        /*Logica RARA PARA DESAPARECER MARCADORES
        if(latLon[0]!=null && i==1){
            latLon[1]=marker;
        }else{
            if(i==1) {
                latLon[0] = marker;
            }else{
                if(i==2){
                    latLon[1] = marker;
                }
            }
        }
        if(i>2){
            i=0;
            latLon[0].setMap(null);
            latLon[1].setMap(null);
            latLon[0]=null;
            latLon[1]=null;
        }
        Logica RARA PARA DESAPARECER MARCADORES*/
    });


    /***/

}
google.maps.event.addDomListener(window, 'load', initialize);



/*Geolocalizacion*/

function getLocation() {
    var x = document.getElementById("demo");
    if (navigator.geolocation) {
        latLon[0] = x;
        alert("Seleccione su posicion final");
        navigator.geolocation.getCurrentPosition(showPosition, showError);
    } else {
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
    var x = document.getElementById("demo");
    i++;
    document.getElementById('latitud1').value=position.coords.latitude;
    document.getElementById('longitud1').value=position.coords.longitude;
    x.innerHTML = "Latitud: " + position.coords.latitude +
        "<br>Longitud: " + position.coords.longitude;

}

function showError(error) {
    var x = document.getElementById("demo");
    switch(error.code) {
        case error.PERMISSION_DENIED:
            x.innerHTML = "User denied the request for Geolocation."
            break;
        case error.POSITION_UNAVAILABLE:
            x.innerHTML = "Location information is unavailable."
            break;
        case error.TIMEOUT:
            x.innerHTML = "The request to get user location timed out."
            break;
        case error.UNKNOWN_ERROR:
            x.innerHTML = "An unknown error occurred."
            break;
    }
}
function Dist(latitud1, longitud1, latitud2, longitu2)
{
    rad = function(x) {return x*Math.PI/180;}

    var R     = 6378.137;                          //Radio de la tierra en km
    var dLat  = rad( latitud2 - lat1 );
    var dLong = rad( lon2 - lon1 );

    var a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(rad(lat1)) * Math.cos(rad(lat2)) * Math.sin(dLong/2) * Math.sin(dLong/2);
    var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
    var d = R * c;

    return d.toFixed(3);                      //Retorna tres decimales
}

// End geo