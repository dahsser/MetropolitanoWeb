<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=es&callback=iniciar"></script>

					<script>
					function iniciar() {
					var mapOptions = {
					center: new google.maps.LatLng(25.80, -80.30),
					zoom: 10,
					mapTypeId: google.maps.MapTypeId.ROADMAP};
					var map = new google.maps.Map(document.getElementById("map"),mapOptions);}
</script>