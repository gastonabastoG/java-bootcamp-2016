
<%@page import="java.util.*,java.io.*,java.lang.*,java.sql.*,object.BDAdapter"%>

  <%
  
  		String autor = request.getParameter("txtAutor");
        String titulo = request.getParameter("txtTitulo"); 

        BDAdapter bd = new BDAdapter();
  		
      	bd.CrearLibro(titulo, autor);
        	
        	
        	%>
        	
        	<meta http-equiv="Refresh" content="5;url=menu.jsp">
			<body>
			
        	<h1>Libro creado con exito, Espere a que se lo redireccione</h1>
        	
        	</body>
        	


 

