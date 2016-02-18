<%@page import="java.util.*,java.io.*,java.lang.*,java.sql.*,object.BDAdapter,object.Libro"%>

  <%
  		String ID = request.getParameter("txtID");
		String autor = request.getParameter("txtAutor");
  		String titulo = request.getParameter("txtTitulo"); 
  		
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

				bd.ModificarLibro( Integer.parseInt( ID ), titulo, autor );
        		
		       	cant = cant + 1;
		       	
			}
			
		}
        	
    	if ( cant == 0 )
    	{
        	%>
        	
        	<meta http-equiv="Refresh" content="5;url=menu.jsp">
			<body>
			
        	<h1>Libro no Modificado con exito, Espere a que se lo redireccione</h1>
        	
        	</body>
        	
        	<%
    	}else
    	{
			%>
        	
        	<meta http-equiv="Refresh" content="5;url=menu.jsp">
			<body>
			
        	<h1>Libro Modificado con exito, Espere a que se lo redireccione</h1>
        	
        	</body>
        	
        	<%
    	}
        	
        	%>