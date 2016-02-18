
<%@page import="java.util.*,java.io.*,java.lang.*,java.sql.*,object.BDAdapter,object.Libro"%>

  <%
  		String ID = request.getParameter("txtID");
  
  		int cant = 0;

        BDAdapter bd = new BDAdapter();
        
        ArrayList<Libro> libros = new ArrayList<Libro>();
    	
    	libros = bd.ListarTodosLosLibros();
    	
    	Libro l = new Libro();
    	
    	for ( int i = 0; i < libros.size() ; i++ )
		{
			
			l = libros.get(i);
			
			if ( l.getId() == Integer.parseInt( ID ) )
			{

		       	bd.EliminarLibro( Integer.parseInt( ID ) );
        		
		       	cant = cant + 1;
		       	
			}
			
		}
        	
    	if ( cant == 0 )
    	{
        	%>
        	
        	<meta http-equiv="Refresh" content="5;url=menu.jsp">
			<body>
			
        	<h1>Libro no Eliminado con exito, Espere a que se lo redireccione</h1>
        	
        	</body>
        	
        	<%
    	}else
    	{
			%>
        	
        	<meta http-equiv="Refresh" content="5;url=menu.jsp">
			<body>
			
        	<h1>Libro Eliminado con exito, Espere a que se lo redireccione</h1>
        	
        	</body>
        	
        	<%
    	}
        
        
  %>