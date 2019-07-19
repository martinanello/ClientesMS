<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Clientes</title>
<link href="/css/style.css" rel="stylesheet">
</head>
<body>
<div align="center">

	<h2>Spring Boot demo - ClientesMS</h2>
	
	<div class="w3">
		<form action="creacliente" method="post">
			<br>
			<label>Id: </label>
			<input type="text" name="id"><br>
			<label>Nombre: </label>
			<input type="text" name="nombre"><br>
			<label>Apellido: </label>
			<input type="text" name="apellido"><br>
			<label>Edad: </label>
			<input type="text" name="edad"><br>
			<label>Nacimiento (MM-dd-yyyy): </label>
			<input type="datetime" name="fechaNacimiento">
			<br><br>
			<input type="submit" value="Crear Cliente" class="button">
			<br><br>
		</form>
	</div>
	
	<div class="w3">	
		<form action="kpideclientes" method="get">
			<br>
			<input type="submit" value="Kpi Clientes" class="button">
			<br><br>
		</form>
	</div>
	
	<div class="w3">	
		<form action="listclientes" method="get">
			<br>
			<input type="submit" value="Listar Clientes" class="button">
			<br><br>
		</form>
	</div>	
</div>
</body>
</html>