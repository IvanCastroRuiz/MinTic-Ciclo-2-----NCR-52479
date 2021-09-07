
package controlador;


import java.sql.*;

public class GestorBaseDatos {
    
    public String[] crearConexion() throws ClassNotFoundException, SQLException{
         //String[] datos = new String[4];
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aerolinea","root","");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM `pasajero` WHERE ID = '72009461'");

          while(rs.next()){
              System.out.println(rs.getString("ID")
                      +" "+rs.getString("nombre")
                      +" "+rs.getString("edad"));
                      
                      String id = rs.getString("ID");
                      String nombre = rs.getString("nombre");
                      String edad = rs.getString("edad");
                      
                      String[] datos = {id,nombre,edad};
                      return datos;
         }
          conn.close();
          return null;
    }
    
    
}
