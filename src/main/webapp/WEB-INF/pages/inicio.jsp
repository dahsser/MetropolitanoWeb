<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/metroapp.css">
	<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Ubuntu' rel='stylesheet' type='text/css'>
	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false"></script>
	<script type="text/javascript" src="js/metroapp.js"></script>
	<script type="text/javascript" src="js/google-map.js"></script>
	<!--

	-->
</head>
<body>
	<header>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12">
					<ul class="nav nav-tabs color1">
						<li class="active"><a href="">Inicio</a></li>
						<li><a href="metro.jsp">Rutas frecuentes</a></li>
						<li><a href="vista4.jsp">Ajustes</a></li>
					</ul>
						
				</div>
			</div>
		</div>
	</header>

	<div class="container-fluid principal">	
		<div class="main row ">
			<div class="col-xs-12 col-sm-12 col-md-12">
				<div class="centro">

					<form class="form-inline">
						<div class="form-group">
							<input  id="direccion" name="direccion" type = "text"  class = "form-control" placeholder="A donde ir">
						</div>
						<input  class = "btn btn-default"  type ="button" onclick="consultar()" value="Consultar"> 
					</form>
					<div class="mapa">
						<iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d15609.729636017966!2d-77.0506784!3d-12.013724!3m2!1i1024!2i768!4f13.1!5e0!3m2!1ses-419!2spe!4v1435414427231" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
					</div>
					
					<button type="button" class="btn btn-danger">Ubicación manual</button>
					<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#myModal">Ubicación automática</button>
				</div>
			</div>
		</div>
	</div>
	<c:forEach items="${rutas}" var="ruta">
		<h4>Nombre:</h4>	 ${ruta.linea.nombre}
		Origen: ${ruta.estacionInicial.nombre}
		Destino:${ruta.estacionFinal.nombre}
		<br/>
	</c:forEach>
<div id="myModal" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Modal title</h4>
      </div>
      <div class="modal-body">
        <p>One fine body&hellip;</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!-- Botón de apertura -->
 
<!-- Ventana Modal -->

	<script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    
</body>
</html>