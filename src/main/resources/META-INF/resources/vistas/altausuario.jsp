<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<%@include file="head.jsp" %>
</head>
<body>
	<%@include file="header.jsp" %>
	
	
	<form action = "listado-usuarios" method = "POST">
        DNI: <input type = "text" name = "dni">
         <br />
         Nombre: <input type = "text" name = "nombre" />
         <br>
         Apellido 1: <input type = "text" name = "apellido1">
         <br />
         Apellido 2: <input type = "text" name = "apellido2">
         <br />
         Sexo: <input type = "text" name = "sexo">
         <br />
         Fecha Nacimiento: <input type = "text" name = "fechaNacimiento">
         <br />
         Altura: <input type = "text" name = "altura">
         <br />
         Observaciones: <input type = "text" name = "obserc">
         <br />
         <input type = "submit" value = "Submit" />
      </form>

	<%@include file="footer.jsp" %>
</body>
</html>