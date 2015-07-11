<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/metroapp.css"/>">
	<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Ubuntu' rel='stylesheet' type='text/css'>
	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/metroapp.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/google-map.js"/>"></script>
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

					<h1><strong>MetroApp</strong></h1>
					<br>
					<div id="googleMap" class="mapa"></div>
					<br>
					<button onclick="alerta()" type="button" class="btn btn-danger">Ubicación manual</button>
					<button data-toggle="modal" data-target="#myModal" onclick="getLocation()" type="button" class="btn btn-danger">Ubicación automática</button>
					<p id="demo"></p>

					<form id="datos" action="/rutas">
						<input hidden="hidden" id="latitud1" name="latitud1" type="text"/>
						<input hidden="hidden" id="longitud1" name="longitud1" type="text"/>
						<input hidden="hidden" id="latitud2" name="latitud2" type="text"/>
						<input hidden="hidden" id="longitud2" name="longitud2" type="text"/>
					</form>

				</div>
			</div>
		</div>
	</div>

	<table class="table table-bordered" style="text-align: center;">
		<tr  style="background-color: lawngreen ;">
			<th style="text-align: center;">Linea</th>
			<th style="text-align: center;">Origen</th>
			<th style="text-align: center;">Destino</th>
		</tr>
			<c:forEach items="${rutas}" var="ruta">
			<tr>
				<td>${ruta.linea.nombre}</td>
				<td>${ruta.estacionInicial.nombre}</td>
				<td>${ruta.estacionFinal.nombre}</td>
			</tr>
			</c:forEach>
	</table>
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