<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<% 

	String usuario = request.getParameter("txtUsuario");
	String clave = request.getParameter("txtClave");
	
	session.setAttribute( "Usuario", usuario );
	session.setAttribute( "Clave", clave );
	
	if ( usuario.equals("alberto") && clave.equals("alberto") )
	{
		%>
		
		<jsp:forward page="menu.jsp" />
		
		<%
	}else
	{
		%>
    	
    	<meta http-equiv="Refresh" content="5;url=index.jsp">
		<body>
		
    	<h1>Usuario y/o contraseņa incorrecto</h1>
    	
    	</body>
    	
    	<%
	}
	
	%>

</html>