
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// Clase para conectar a la base de datos.
public class Conector {
    
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String usuario="root";
    private static final String contraseña="";
    private static final String url="jdbc:mysql://localhost:3306/proyecto";
    Statement st;
    ResultSet rs;
    String mensaje="";
    
    // Metodo constructor para conectar a la BD.
    public Conector(){
         conn=null;
       try{
           
           Class.forName(driver);
           conn=DriverManager.getConnection(url,usuario,contraseña);
           st=conn.createStatement();
           if (conn!=null) {
            System.out.println("Conexion establecida");

           }
           
       }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Conexion establecida "+ ex);

       }
    }
    
 public ResultSet consultaBD(String query){
     ResultSet rs=null;
        try {
            rs=st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
 }
 
  public void modificaBD(String query){
        try {
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
  

    
    
}
