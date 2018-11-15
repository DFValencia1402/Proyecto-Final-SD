
package CRUD;

import Productos.*;
import Diseños.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author DFVAL
 */
public class Productos extends ProductoPOA{
    
    Conexion objConec = new Conexion();
    @Override
    public boolean insertarProductos(int Codigo, String fechaingreso, String tipo, String cantidad, String valor) {
      boolean resultado = false;
        try {
            String sql = "insert into producto (codigo,fechaingreso,tipo,cantidad,valor) values ('"+Codigo+"','"+fechaingreso+"','"+tipo+"','"+cantidad+"','"+valor+"')";
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
    public boolean actualizarProductos(int Codigo, String fechaingreso, String tipo, String cantidad, String valor) {
      boolean resultado = false;
        try {
            String sql = "UPDATE producto SET fechaingreso = '"+fechaingreso+"', tipo = '"+tipo+"', cantidad = '"+cantidad+"' , valor = '"+valor+"' where codigo = '"+Codigo+"' ";
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
    public boolean eliminarProductos(int Codigo) {
      boolean resultado = false;
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + Codigo;
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
    public String consultarProductos(int Codigo) {
      String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from producto where codigo = " + Codigo;
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
     public ResultSet cargarProductos(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "Select codigo, fechaingreso, tipo, cantidad, valor from producto";
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
