
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="object.Libro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<LINK href="ejemplo.css" rel="stylesheet" type="text/css">

<title>Hola, <%= session.getAttribute( "Usuario" ) %></title>
</head>
<body>

<form>

<h1>Elija una opcion:</h1>

<p><A HREF="alta.jsp" TARGET="principal">Dar de Alta un Libro</A></p>

<p><A HREF="baja.jsp" TARGET="principal">Dar de Baja un Libro</A></p>

<p><A HREF="modificar.jsp" TARGET="principal">Modificar un Libro</A></p>

<p><A HREF="listado.jsp" TARGET="principal">Ver todos los Libros</A></p>

<p><A HREF="busqueda.jsp" TARGET="principal">Buscar un Libro</A></p>

</form>

</body>
</html>
