<@%page contentType ="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Bus</title>
	<meta name="viewport" content="width=device-width,user-scable=no,initial-escale=1.0,maximun-scale=1.0,minimun-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/metroapp.css">
</head>
<body>
	<header>
    <div class="container-fluid">
      <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12">
          <p class="text-center">
            <ul class="nav nav-tabs">
                      <li role="presentation" ><a href="inicio.jsp">Inicio</a></li>
                      <li role="presentation" class="active"><a href="#">Rutas frecuentes</a></li>
                      <li role="presentation"><a href="vista4.jsp">Ajustes</a></li>
                    </ul>
                     </p>
        </div>
      </div>
    </div>
		
	</header>
	<div class="container">
	  <div class="row">
	  	    <div class="col-xs-12 col-sm-12 col-md-12">
	  	    	<br>
		      <div class="panel panel-danger">
                  <div class="panel-heading">
                     <h3 class="panel-title">Desde donde estoy hasta:</h3>
                   </div>
                   <div class="panel-body">
                        <ul>
                          <li><span class="glyphicon glyphicon-home"></span><a href="#"> Home</a></li> <hr />
                          <li><span class="glyphicon glyphicon-lock"></span><a href="#"> to Work</a></li><hr />
                          <li><a href="location.jsp">+  Agregar lugar</a></li>
                        </ul>
                   </div>
              </div>
		</div>
	  </div>
	  <div class="row"><br>
		<div class="col-xs-12 col-sm-12 col-md-12">
           <div class="panel panel-default">
                <div class="panel-heading">Búsquedas recientes
                </div>
                   <div class="panel-body">
                   Panel content
                   </div>
           </div>
        </div>
    </div>
	</div>
 <script type="text/javascript" src="js/jquery.min.js"></script>
 <script type="text/javascript" src="js/bootstrap.min.js"></script>
 <script type="text/javascript" src="js/metroapp.js"></script>
</body>
</html>