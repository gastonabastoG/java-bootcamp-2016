<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%
   String error=request.getParameter("error");
   if(error==null || error=="null"){
	   error="";
	  }
   %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Bienvenido a la Biblioteca</title>

<LINK href="ejemplo.css" rel="stylesheet" type="text/css">

<script>
    function trim(s) 
    {
        return s.replace( /^\s*/, "" ).replace( /\s*$/, "" );
    }

    function validate()
    {
        if(trim(document.frmLogin.sUserName.value)=="")
        {
          alert("Login empty");
          document.frmLogin.sUserName.focus();
          return false;
        }
        else if(trim(document.frmLogin.sPwd.value)=="")
        {
          alert("password empty");
          document.frmLogin.sPwd.focus();
          return false;
        }
    }
</script>


</head>
<body>
<div><%=error%></div>

<form action="indexback.jsp" onSubmit="return validate();" method="post">

<h1>Login de Usuario:</h1>

<p>Usuario:<INPUT NAME="txtUsuario" TYPE=TEXT SIZE=32 ></p>

<p>Clave:<INPUT NAME="txtClave" TYPE=PASSWORD SIZE=32 ></p>

<INPUT TYPE="Submit" Name="btnLogin" VALUE="Login" class="button-style">

</form>

</body>
</html>