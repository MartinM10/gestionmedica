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
	<h2>Tu listado de lecturas</h2>
	<table id="tabla">
		<tr>
			<th>ID</th>
			<th>FECHA</th>
			<th>LONGITUD</th>
			<th>LATITUD</th>
			<th>PESO</th>
			<th>PRESIÓN MÍNIMA</th>
			<th>PRESIÓN MÁXIMA</th>
			<th>NÚMERO DE PASOS</th>
		</tr>
  		<c:forEach var="lectura" items="${lecturas}">
		<tr>
			<td>${lectura.id}</td>
			<td>
				<fmt:formatDate pattern="dd/MM/yyyy" value="${lectura.fechaCreacion}" />
			</td>
			<td>${lectura.longitud}</td>
			<td>${lectura.latitud}</td>
			<td>${lectura.peso}</td>
			<td>${lectura.presionMin}</td>
			<td>${lectura.presionMax}</td>
			<td>${lectura.pasos}</td>
		</tr>
		</c:forEach>
	</table>
	<%@include file="footer.jsp" %>	
</body>
</html>