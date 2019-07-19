<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Clientes</title>
<link href="/css/style.css" rel="stylesheet">
</head>
<body>

	<div align="center">
		<br>
		<table>
			<tr>
	            <th>Id</th>
	            <th>Nombre</th>     
	            <th>Apellido</th>
	            <th>Edad</th>
	            <th>Nacimiento</th>
	            <th>Probable muerte</th>
	    	</tr>
			<c:forEach items="${listaClientes}" var="cliente"> 
      		<tr>
      			<td>${cliente.id}</td>
        		<td>${cliente.nombre}</td>
        		<td>${cliente.apellido}</td>
        		<td>${cliente.edad}</td>
        		<td>${cliente.fechaNacimiento}</td>
        		<td>${cliente.probableMuerte}</td>
        	</tr>
    		</c:forEach>
    	</table>
	</div>
	
	<form action="/">
		<div align="center">
			<br><br><br>
			<input type="submit" value="Volver" class="button">
		</div>
	</form>
	
</body>
</html>