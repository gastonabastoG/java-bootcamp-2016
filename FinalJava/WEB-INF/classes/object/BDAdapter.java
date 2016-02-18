package object;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

public class BDAdapter {
	
	// servidor
    public String url = "jdbc:mysql://localhost:3307/tonchovet?autoReconnect=true";
    public String user = "tonchovet";
    public String password = "alberto7";
    
    // local
    //public String url = "jdbc:mysql://localhost:3306/libreria";
    //public String user = "root";
    //public String password = "root";
	
public void EliminarLibro( int id ){
		
		Connection con = null;
		PreparedStatement pst = null;

        try {
        
        Class.forName("com.mysql.jdbc.Driver");
        	
        con = DriverManager.getConnection(url, user, password);
        
        pst = con.prepareStatement("DELETE FROM libros WHERE id = ?");
        pst.setInt(1, id);
        pst.executeUpdate();
        
        
        }catch (SQLException ex) {
        	
            Logger lgr = Logger.getLogger(BDAdapter.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            

        } catch(Exception e){
        	
            System.out.println(e);
            
            
        }finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
                
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(BDAdapter.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
               
            }
        }

	}


//////////////////////////////////////////////////////////////////////////////////////////////

	public void ModificarLibro( int id, String titulo, String autor ){
		
		Connection con = null;
		PreparedStatement pst = null;
        
        try {
        	
        Class.forName("com.mysql.jdbc.Driver");
        	
        con = DriverManager.getConnection(url, user, password);
        
        pst = con.prepareStatement("UPDATE libros SET titulo = ?, autor = ? WHERE id = ?");
        pst.setString(1, titulo);
        pst.setString(2, autor);
        pst.setInt(3, id);
        pst.executeUpdate();
        
        }catch (SQLException ex) {
            Logger lgr = Logger.getLogger(BDAdapter.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
          
        } catch(Exception e){
        	
            System.out.println(e);
          
        }finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(BDAdapter.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }		    
      
	}
        
	
//////////////////////////////////////////////////////////////////////////////////////////////
    
		public void CrearLibro( String titulo, String autor ){
			
			Connection con = null;
			PreparedStatement pst = null;
	        
	        
	        try {
	        
	        Class.forName("com.mysql.jdbc.Driver");
	        	
	        con = DriverManager.getConnection(url, user, password);
	        
	        pst = con.prepareStatement("INSERT INTO libros ( titulo, autor ) VALUES(?,?)");
	        pst.setString(1, titulo);
	        pst.setString(2, autor);
            pst.executeUpdate();
	        
	        }catch (SQLException ex) {
	            Logger lgr = Logger.getLogger(BDAdapter.class.getName());
	            lgr.log(Level.SEVERE, ex.getMessage(), ex);
	           
	        } catch(Exception e){
	        	
	            System.out.println(e);
	    
	        }finally {

	            try {
	                if (pst != null) {
	                    pst.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	                Logger lgr = Logger.getLogger(BDAdapter.class.getName());
	                lgr.log(Level.SEVERE, ex.getMessage(), ex);
	            }
	        }		    
	      
		}
	
//////////////////////////////////////////////////////////////////////////////
		
		public ArrayList<Libro> ListarTodosLosLibros() {

	        Connection con = null;
			Statement st = null;
	        ResultSet rs = null;
	        
	        ArrayList<Libro> libros = new ArrayList<Libro>();
	        
	        try {
	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	        	
	            con = DriverManager.getConnection(url, user, password);
	        	st = con.createStatement();
	            rs = st.executeQuery("SELECT * from libros");

	            while (rs.next()) {
	            	
	            	Libro lib = new Libro();
	            	
	            	lib.setId(rs.getInt(1));
	            	lib.setTitulo(rs.getString(2));
	            	lib.setAutor(rs.getString(3));
	            	
	                libros.add(lib);

	            }

	        } catch (SQLException ex) {
	            Logger lgr = Logger.getLogger(BDAdapter.class.getName());
	            lgr.log(Level.SEVERE, ex.getMessage(), ex);

	        } catch(Exception e){
	        	
	            System.out.println(e);
	            
	        }finally {
	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	                if (st != null) {
	                    st.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	                Logger lgr = Logger.getLogger(BDAdapter.class.getName());
	                lgr.log(Level.WARNING, ex.getMessage(), ex);
	            }
	        }
	        
	        return libros;
		}
		
/////////////////////////////////////////////////////////////////////////////
		
		
		public ArrayList<Libro> BuscarLibro( String cadena ) {

			Connection con = null;
			PreparedStatement pst = null;
	        ResultSet rs = null;
	        
	        ArrayList<Libro> libros = new ArrayList<Libro>();
	        
	        try {
	        	
	        	
	        	Class.forName("com.mysql.jdbc.Driver");
	        	
	            con = DriverManager.getConnection(url, user, password);
	        	pst = con.prepareStatement("SELECT * from libros WHERE titulo LIKE ? OR autor LIKE ?");
	        	
	        	cadena = "%" + cadena + "%";
	        	
	        	pst.setString( 1, cadena );
	        	pst.setString( 2, cadena );
	            rs = pst.executeQuery();
	         
	            while (rs.next()) {
	            	
	            	Libro lib = new Libro();
	            	
	            	lib.setId(rs.getInt(1));
	            	lib.setTitulo(rs.getString(2));
	            	lib.setAutor(rs.getString(3));
	            	
	                libros.add(lib);

	            }

	        } catch (SQLException ex) {
	            Logger lgr = Logger.getLogger(BDAdapter.class.getName());
	            lgr.log(Level.SEVERE, ex.getMessage(), ex);

	        } catch(Exception e){
	        	
	            System.out.println(e);
	            
	        }finally {
	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	                if (pst != null) {
	                    pst.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	                Logger lgr = Logger.getLogger(BDAdapter.class.getName());
	                lgr.log(Level.WARNING, ex.getMessage(), ex);
	            }
	        }
	        
	        return libros;
		}
}
