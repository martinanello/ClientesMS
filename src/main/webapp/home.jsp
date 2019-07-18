<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Clientes</title>
</head>
<body>

	<form action="creacliente" method="post">
		<label>Id: </label>
		<input type="text" name="id"> <br>
		<label>Nombre: </label>
		<input type="text" name="nombre"> <br>
		<label>Apellido: </label>
		<input type="text" name="apellido"> <br>
		<label>Edad: </label>
		<input type="text" name="edad"> <br>
		<label>Nacimiento (MM-dd-yyyy): </label>
		<input type="datetime" name="fechaNacimiento"> <br><br>
		<input type="submit" value="Crear Cliente">
	</form>
	
	<form action="kpideclientes" method="get">
		<br><br><br>
		<input type="submit" value="Kpi Clientes">
	</form>
	
	<form action="listclientes" method="get">
		<br><br><br>
		<input type="submit" value="Listar Clientes">
	</form>
	
</body>
</html>