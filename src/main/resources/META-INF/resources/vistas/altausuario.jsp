<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="head.jsp" %>
</head>
<body>
	<%@include file="header.jsp" %>
	
	
	<form:form modelAttribute="usuarioForm" action = "/gestionmedica/alta-usuario" method = "POST" >
        DNI: <input type = "text" name = "dni" value="123123123Q">
         <br />
         Nombre: <form:input type = "text" path = "nombre" value="nombre user" />
         <br>
         Apellido 1: <form:input type = "text" path = "apellido1" value="apell1"/>
         <br />
         Apellido 2: <form:input type = "text" path = "apellido2" value="apell2"/>
         <br />
         Sexo: <form:input type = "text" path = "sexo" value="HOMBRE"/>
         <br />
         Fecha Nacimiento: <form:input type = "date" path = "fechaNacimiento"/>
         <br />
         Altura: <form:input type = "text" path = "altura" value="175"/>
         <br />
         Observaciones: <form:input type = "text" path = "observaciones" value="ninguna"/>
         <br />
         <input type = "submit" value = "Submit" />
      </form:form>

	<%@include file="footer.jsp" %>
</body>
</html>