<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="head.jsp" %>	
</head>
<body>
	<%@include file="header.jsp" %>	
	<h2>Listado de usuarios registrados</h2>
	<table id="tabla">
		<tr>
			<th>DNI</th>
			<th>NOMBRE</th>
			<th>APELLIDO1</th>
			<th>APELLIDO2</th>
			<th>SEXO</th>
			<th>FECHA DE NACIMIENTO</th>
			<th>ALTURA</th>
			<th>OBSERVACIONES</th>
		</tr>
  		<c:forEach var="usuario" items="${usuarios}">
		<tr>
		  	<td><a href="/gestionmedica/lecturas/${usuario.dni}/usuario">${usuario.dni}</a></td>
			<td>${usuario.nombre}</td>
			<td>${usuario.apellido1}</td>
			<td>${usuario.apellido2}</td>
			<td>${usuario.sexo}</td>
			<td>
				<fmt:formatDate pattern="dd/MM/yyyy" value="${usuario.fechaNacimiento}" />
			</td>
			<td>${usuario.altura}</td>
			<td>${usuario.observaciones}</td>
		</tr>
		</c:forEach>
	</table>
	<%@include file="footer.jsp" %>	
</body>
</html>