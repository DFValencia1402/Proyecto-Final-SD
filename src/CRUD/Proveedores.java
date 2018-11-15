
package CRUD;

import Proveedor.*;
import Diseños.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author DFVAL
 */
public class Proveedores extends ProveedorsPOA{

    Conexion objConec = new Conexion();
    @Override
    public boolean insertarProveedor(int Nit, String nombre, String apellidos, String direccion, String telefono) {
      boolean resultado = false;
        try {
            String sql = "insert into proveedor (nit,nombre,apellido,direccion,telefono) values ('"+Nit+"','"+nombre+"','"+apellidos+"','"+direccion+"','"+telefono+"')";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            int val = st.executeUpdate(sql);
            if(val>0){
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
    public boolean actualizarProveedor(int Nit, String nombre, String apellidos, String direccion, String telefono) {
      boolean resultado = false;
        try {
            String sql = "UPDATE proveedor SET nombre = '"+nombre+"', apellido = '"+apellidos+"', direccion = '"+direccion+"', telefono = '"+telefono+"' where nit = '"+Nit+"' ";
            //Se realiza la conexión con la base de datos
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            int val = st.executeUpdate(sql);
            if(val>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConec.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al actualizar. "+e);
        }  
        
        return resultado;
    }

    @Override
    public boolean eliminarProveedor(int Nit) {
      boolean resultado = false;
        try {
            String sql = "DELETE FROM proveedor WHERE nit = " + Nit;
            //Se realiza la conexión con la base de datos
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConec.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al eliminar. "+e.getMessage());
        }        
        return resultado;
    }

    @Override
    public String consultarProveedor(int Nit) {
      String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from proveedor where nit = " + Nit;
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
    public ResultSet cargarProveedores(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "Select nit, nombre, apellido, direccion, telefono from proveedor";
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
