/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseños;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import CRUD.*;
    import java.sql.ResultSet;
    import java.sql.SQLException;
/**
 *
 * @author DFVAL
 */
public class Producto extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form Producto
     */
    private DefaultTableModel modelo;
    public Producto() {
        initComponents();
        this.setLocationRelativeTo(null);   
        this.setSize(780, 580);
        
    }
    
    //Agragamos las columnas a nuestra Tabla
    private void mostrarColumna(){
        modelo = (DefaultTableModel) tblProductos.getModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("TIPO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("VALOR");
    }
   
    private void cargarRegistro(){
        
        Productos objProducto = new Productos();
        
        modelo = (DefaultTableModel) tblProductos.getModel();
        
        ResultSet resultado = objProducto.cargarProductos();
        
        try {
            Object datos[] = new Object[5];
            while (resultado.next()) {
                for (int i = 0; i < 5; i++) {
                    datos[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtval = new javax.swing.JTextField();
        txtcod = new javax.swing.JTextField();
        txtfechaingreso = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnBuscarProductos = new javax.swing.JButton();
        btneliminarproductos = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnlimpiardatos = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCTOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 30, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("VALOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 270, 60, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("CODIGO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 120, 73, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("FECHA INGRESO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 150, 130, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("TIPO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 200, 52, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("CANTIDAD");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 230, 90, 17);

        txtval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalKeyTyped(evt);
            }
        });
        getContentPane().add(txtval);
        txtval.setBounds(170, 270, 160, 30);

        txtcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodKeyTyped(evt);
            }
        });
        getContentPane().add(txtcod);
        txtcod.setBounds(170, 110, 160, 30);
        getContentPane().add(txtfechaingreso);
        txtfechaingreso.setBounds(170, 150, 160, 30);

        txttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoActionPerformed(evt);
            }
        });
        getContentPane().add(txttipo);
        txttipo.setBounds(170, 190, 160, 30);
        getContentPane().add(txtcant);
        txtcant.setBounds(170, 230, 160, 30);

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar);
        btnregistrar.setBounds(370, 140, 110, 30);

        btnBuscarProductos.setText("BUSCAR");
        btnBuscarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarProductos);
        btnBuscarProductos.setBounds(510, 140, 120, 30);

        btneliminarproductos.setText("ELIMINAR");
        btneliminarproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarproductosMouseClicked(evt);
            }
        });
        btneliminarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarproductosActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminarproductos);
        btneliminarproductos.setBounds(520, 200, 110, 30);

        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(250, 490, 80, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("MENU PRINCIPAL");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 490, 130, 30);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 320, 690, 140);

        btnlimpiardatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnlimpiardatos.setText("LIMPIAR DATOS");
        btnlimpiardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiardatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiardatos);
        btnlimpiardatos.setBounds(420, 270, 130, 30);

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(650, 140, 110, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("LIMPIAR TABLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(590, 270, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/org-fondo-madera-negro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        MENU MN = new MENU();
           MN .setVisible(true);
           dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
       //***programacion para el boton Guardar.
       
       //Validaciòn.
        if (txtcod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un Codigo");
            txtcod.requestFocus();
            return;
        }
        if (txtfechaingreso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese una Fecha");
            txtfechaingreso.requestFocus();
            return;
        }
        if (txttipo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un Tipo");
            txttipo.requestFocus();
            return;
        }
        if (txtcant.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese una Cantidad");
            txtcant.requestFocus();
            return;
        }
        if (txtval.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un Valor");
            txtval.requestFocus();
            return;
        }
        
        
        //Instanciaciòn de la clase Empleados para obtener todos los metodos, atributos
        
        Productos objProducto = new Productos();
        
        //Obtenemos todos los datos digitados por el Usuario.
        
        int codigo =  Integer.parseInt(txtcod.getText());
        String fechaimgreso = txtfechaingreso.getText();
        String tipo = txttipo.getText();
        String cantidad = txtcant.getText();
        String valor = txtval.getText();
        
        
        try {
            boolean resultado = objProducto.insertarProductos(codigo, fechaimgreso, tipo, cantidad, valor);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Los datos se han registrado satisfactoriamente");
                txtcod.setText("");
                txtfechaingreso.setText("");
                txttipo.setText("");
                txtcant.setText("");
                txtval.setText("");
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, el registro no se realizò correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrio algo inesperado, por favor vuelva a intentarlo");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnlimpiardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiardatosActionPerformed
        txtcod.setText("");
        txtfechaingreso.setText("");
        txttipo.setText("");
        txtcant.setText("");
        txtval.setText("");
    }//GEN-LAST:event_btnlimpiardatosActionPerformed

    private void btneliminarproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarproductosMouseClicked
        int eli=tblProductos.getSelectedRowCount();
       if(eli>=0){
           model.removeRow(eli);
       }else{
           JOptionPane.showMessageDialog(null,"No Hay Datos Que Eliminar");
       }
    }//GEN-LAST:event_btneliminarproductosMouseClicked

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
      //********************Programaciòn para el Boton actualizar************
        
        //Validar si el usuario no ha presionado el Boton de buscar.
        
        if (tblProductos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, presione el boton de buscar");
            return;
        }
        
        if (tblProductos.getSelectedRow() == -1 ) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        if (txtcod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un Codigo!");
            txtcod.requestFocus();
            return;
        }
        if (txtfechaingreso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa una Descripcion!");
            txtfechaingreso.requestFocus();
            return;
        }
        if (txttipo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un Tipo");
            txttipo.requestFocus();
            return;    
        }
        if (txtcant.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa una Cantidad!");
            txtcant.requestFocus();
            return;
        }
        if (txtval.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un Valor!");
            txtval.requestFocus();
            return;
        }
        
        
        //Instanciaciòn de la clase Empleados para obtener todos los metodos, atributos
        
        Productos objProducto = new Productos();
        
        int codigo =  Integer.parseInt(txtcod.getText());
        String fechaingreso = txtfechaingreso.getText();
        String tipo = txttipo.getText();
        String cantidad = txtcant.getText();
        String valor = txtval.getText();
        
        
        modelo = (DefaultTableModel) tblProductos.getModel();
        try {
            boolean result = objProducto.actualizarProductos(codigo, fechaingreso, tipo, cantidad, valor);
            if (result == true) {
                JOptionPane.showMessageDialog(null, "Los datos se Actualizaron correctamente.");
                //Limpiamos las cajas de texto y los ComboBox.
                txtcod.setText("");
                txtfechaingreso.setText("");
                txttipo.setText("");
                txtcant.setText("");
                txtval.setText("");
                
                //Limpiamos la tabla (Registros, Columnas).
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnBuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductosActionPerformed
         mostrarColumna();
         cargarRegistro();
    }//GEN-LAST:event_btnBuscarProductosActionPerformed

    private void btneliminarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarproductosActionPerformed
       
        if (tblProductos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, presione el boton de buscar");
            return;
        }
        
        if (tblProductos.getSelectedRow() == -1 ) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        Productos objProducto = new Productos();
        
        modelo = (DefaultTableModel) tblProductos.getModel();
        
        try {
            
            int codigo = Integer.parseInt(txtcod.getText());
            
            boolean result = objProducto.eliminarProductos(codigo);
            
            if (result == true) {
                JOptionPane.showMessageDialog(null, "El registro se eliminò correctamente");
                //Limpiamos las cajas de texto y los ComboBox.
                txtcod.setText("");
                txtfechaingreso.setText("");
                txttipo.setText("");
                txtcant.setText("");
                txtval.setText("");
                
                //Limpiamos la tabla (Registros, Columnas).
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrio un problema, por favor intenta de nuevo");
            
        }
        
    }//GEN-LAST:event_btneliminarproductosActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
      
        /*Programacion para cuando el Usuario seleccione una fila
        Los datos se muestre en los componentes graficos (TextField, ComboBox)*/
        
        modelo = (DefaultTableModel) tblProductos.getModel();
        
        try {
            
            //Llenar los datos que se encuentran en la tabla
            txtcod.setText(String.valueOf(modelo.getValueAt(tblProductos.getSelectedRow() , 0)));
            txtfechaingreso.setText(String.valueOf(modelo.getValueAt(tblProductos.getSelectedRow() , 1)));
            txttipo.setText(String.valueOf(modelo.getValueAt(tblProductos.getSelectedRow() , 2)));
            txtcant.setText(String.valueOf(modelo.getValueAt(tblProductos.getSelectedRow() , 3)));
            txtval.setText(String.valueOf(modelo.getValueAt(tblProductos.getSelectedRow() , 3)));
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, Ocurriò un error al seleccionar una fila ¡Intentalo de nuevo!");
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodKeyTyped
        char validar=evt.getKeyChar();
      
      if(Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
      }
    }//GEN-LAST:event_txtcodKeyTyped

    private void txtvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalKeyTyped
        char validar=evt.getKeyChar();
      
      if(Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
      }
    }//GEN-LAST:event_txtvalKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProductos;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminarproductos;
    private javax.swing.JButton btnlimpiardatos;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtfechaingreso;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextField txtval;
    // End of variables declaration//GEN-END:variables

}
