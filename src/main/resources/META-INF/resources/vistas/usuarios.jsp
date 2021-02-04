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
	<h2>Listado de Almacenes</h2>
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
  		<c:forEach var="lectura" items="${lecturas}">
		<tr>
			<td>${lectura.dni}</td>
			<td>${lectura.nombre}</td>
			<td>${lectura.apellido1}</td>
			<td>${lectura.apellido2}</td>
			<td>${lectura.sexo}</td>
			<td>
				<fmt:formatDate pattern="dd/MM/yyyy" value="${lectura.fechaNacimiento}" />
			</td>
			<td>${lectura.altura}</td>
			<td>${lectura.observaciones}</td>
		</tr>
		</c:forEach>
	</table>
	<%@include file="footer.jsp" %>	
</body>
</html>