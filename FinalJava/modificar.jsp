
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.io.*,java.lang.*,java.sql.*,object.BDAdapter,object.Libro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<LINK href="ejemplo.css" rel="stylesheet" type="text/css">

<title>Modificar datos de un Libro</title>
</head>
<body>

<form action="modificarback.jsp">

<h1>Listado de Libros:</h1>

<% 

	BDAdapter bd = new BDAdapter();
	
	ArrayList<Libro> libros = new ArrayList<Libro>();
	
	libros = bd.ListarTodosLosLibros();

	Libro l = new Libro();
	%>
		
		<table border="1">
	  <tr>
	    <th width="25%">ID</th>
	    <th width="25%">Titulo</th>
	    <th width="25%">Autor</th>
	  </tr>

	<%
		
		for ( int i = 0; i < libros.size() ; i++ )
		{
			
			l = libros.get(i);
			
	%>
		
		
	  <tr>
	    <td width="25%"><%= String.valueOf( l.getId()) %></td>
	    <td width="25%"><%= l.getTitulo() %></td>
	    <td width="25%"><%= l.getAutor() %></td>
	  </tr>
	

	<%

		}

	%>
	
	</table>

<h1>Ingrese el ID del libro:</h1>

<p>ID:<INPUT NAME="txtID" TYPE=TEXT SIZE=32 ></p>

<p>Titulo:<INPUT NAME="txtTitulo" TYPE=TEXT SIZE=32 ></p>

<p>Autor:<INPUT NAME="txtAutor" TYPE=TEXT SIZE=32 ></p>

<INPUT TYPE="Submit" Name="btnModificar" VALUE="Modificar" class="button-style">

</form>

<p><A HREF="menu.jsp" TARGET="principal">Volver al Inicio</A></p>

</body>
</html>