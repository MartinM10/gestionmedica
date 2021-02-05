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
	
		<fieldset>
  			<legend>Alta de usuario</legend>
	
	
	
	     <div>
	     	<label for="dni">DNI:</label>
	     	<input type = "text" name = "dni">
	     </div>	
	     
	     <div>
	     	<label for="nombre">Nombre:</label>
	     	<form:input type = "text" path = "nombre" value="nombre user" />
	     </div>	
	     
	     <div>
	     	<label for="apell1">Apellido1:</label>
	     	<form:input type = "text" path = "apellido1" value="apell1"/>
	     </div>	
	     
	     <div>
	     	<label for="apell2">Apellido2:</label>
	     	<form:input type = "text" path = "apellido2" value="apell2"/>
	     </div>
	     
	     <div>
	     	<label for="sexo">Sexo:</label>
	     	<form:select  path="sexo">
    			<form:option value="HOMBRE"> Hombre</form:option>
    			<form:option value="MUJER"> Mujer</form:option>
    	 	</form:select>
	     </div>
  		 <!--  Sexo: <form:input type = "text" path = "sexo" value="HOMBRE"/>-->

		 <div>
	     	<label for="fNac">Fecha Nacimiento:</label>
	     	<form:input type = "date" path = "fechaNacimiento"/>
	     </div>
		
		<div>
	     	<label for="altura">Altura:</label>
	     	<form:input type = "text" path = "altura" value="175"/>
	     </div>
	     
	     <div>
	     	<label for="observaciones">Observaciones:</label>
	     	<form:input type = "text" path = "observaciones" value="ninguna"/>
	     </div>
         
         <input type = "submit" value = "Submit" />
         </fieldset>
      </form:form>

	<%@include file="footer.jsp" %>
</body>
</html>