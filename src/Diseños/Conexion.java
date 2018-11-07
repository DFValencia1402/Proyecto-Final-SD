package Diseños;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DFVAL
 */
public class Conexion {
    
    public Connection conex;
    
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/bdsalsamentaria","root","");
            System.out.println("Conexion establecida.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conex;
    }
    
}
