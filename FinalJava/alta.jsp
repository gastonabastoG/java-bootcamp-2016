
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="object.BDAdapter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<LINK href="ejemplo.css" rel="stylesheet" type="text/css">

<title>Alta de Libros</title>
</head>
<body>

<form action="altaback.jsp">

<h1>Ingrese los datos del libro:</h1>

<p>Autor:<INPUT NAME="txtAutor" TYPE=TEXT SIZE=32 ></p>
<p>Titulo:<INPUT NAME="txtTitulo" TYPE=TEXT SIZE=32></p>

<INPUT TYPE="Submit" Name="btnAlta" VALUE="Dar de Alta" class="button-style">

</form>

<p><A HREF="menu.jsp" TARGET="principal">Volver al Inicio</A></p>

</body>
</html>
