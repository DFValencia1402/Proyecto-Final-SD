package CRUD;

import Empleados.*;
import Diseños.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DFVAL
 */
public class Empleados extends EmpleadoPOA{
    Conexion objConec = new Conexion();
    @Override
    public boolean insertarEmpleado(int cedula, String nombre, String apellido, String telefono, String genero, String cargo) {
        boolean resultado = false;
        try {
            String sql = "insert into empleado (cc,nombre,apellido,telefono,genero,cargo) values ('"+cedula+"','"+nombre+"','"+apellido+"','"+telefono+"','"+genero+"','"+cargo+"')";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones
            objConec.conex.close();
            st.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el código o el usuario ya se encuentran registrados. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado; 
    }

    @Override
    public boolean actualizarEmpleado(int cedula, String nombre, String apellido, String telefono, String genero, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarEmpleado(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarEmpleado(int cedula) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from empleado where cedula = " + cedula;
            //Se realiza la conexión con la base de datos
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            
            while (rs.next()) {                
                resultado += rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return resultado;
    }
    

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public ResultSet cargarEmpleado(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "Select cc, nombre, apellido, telefono, genero, cargo from empleado";
            //Se realiza la conexión con la base de datos
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            resultado = st.executeQuery(sqlConsultar);
           
            //Cerrar las conexiones.
            //st.close();
            //objConect.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
       return resultado;
    }
    
    
    
    
}
