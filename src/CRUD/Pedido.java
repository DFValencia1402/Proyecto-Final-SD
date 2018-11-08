
package CRUD;

import Pedidos.*;
import Diseños.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DFVAL
 */
public class Pedido extends PedidoPOA{

    Conexion objConec = new Conexion();
    public boolean insertarPedidos(int idpedidos, int idcliente, String nombre, String direccion, String telefono, String estado) {
      boolean resultado = false;
        try {
            String sql = "insert into pedidos (id_pedidos,id_clientes,nombre,direccion,telefono,estado) values ('"+idpedidos+"','"+idcliente+"','"+nombre+"','"+direccion+"','"+telefono+"','"+estado+"')";
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
    public boolean actualizarPediso(int idPedidos, int idClientes, String nombre, String direccion, String telefono, String estado) {
      boolean resultado = false;
        try {
            String sql = "UPDATE pedidos SET id_cliente = '"+idClientes+"', nombre = '"+nombre+"', direccion = '"+direccion+"' , telefono = '"+telefono+"' , estado = '"+estado+"' where id_pedidos = '"+idPedidos+"' ";
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
           JOptionPane.showMessageDialog(null, "Error al actualizar. "+e);
        }  
        
        return resultado;
      
    }

    @Override
    public boolean eliminarPedidos(int idPedidos) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM pedidos WHERE id_pedidos = " + idPedidos;
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
    public String consultarPedidos(int idPedidos) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from pedidos where id_pedidos = " + idPedidos;
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
    
     public ResultSet cargarPedidos(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "Select id_pedidos, id_clientes, nombre, direccion, telefono, estado from pedidos";
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

    @Override
    public boolean insertarPedidos(int idCliente, String nombre, String direccion, String telefono, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
