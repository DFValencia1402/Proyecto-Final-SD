
package Diseños;
    import CRUD.Proveedores;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.awt.HeadlessException;
/**
 *
 * @author DFVAL
 */
public class Proveedor extends javax.swing.JFrame {
   DefaultTableModel model = new DefaultTableModel();
    
     private DefaultTableModel modelo; 
   public Proveedor() {
        initComponents();
        this.setLocationRelativeTo(null);   
        this.setSize(800, 580);
    }
    //Agragamos las columnas a nuestra Tabla
    private void mostrarColumna(){
        modelo = (DefaultTableModel) tblProveedor.getModel();
        
        modelo.addColumn("NIT");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
    }
   
    private void cargarRegistro(){
        
        Proveedores objProveedores = new Proveedores();
        
        modelo = (DefaultTableModel) tblProveedor.getModel();
        
        ResultSet resultado = objProveedores.cargarProveedores();
        
        try {
            Object datos[] = new Object[5];
            while (resultado.next()) {
                for (int i = 0; i < 5; i++) {
                    datos[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        txtnit = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        btneliminarproveedor = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnmenuprincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        btnlimpiardatos = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtape = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/org-fondo-madera-negro.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PROVEEDOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 30, 160, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("TELEFONO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 270, 90, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("NIT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 110, 73, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("NOMBRE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 150, 75, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("APELLIDOS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 190, 90, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("DIRECCION");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 230, 90, 17);

        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelKeyTyped(evt);
            }
        });
        getContentPane().add(txttel);
        txttel.setBounds(150, 260, 160, 30);

        txtnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnitKeyTyped(evt);
            }
        });
        getContentPane().add(txtnit);
        txtnit.setBounds(150, 100, 160, 30);

        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });
        getContentPane().add(txtnom);
        txtnom.setBounds(150, 140, 160, 30);
        getContentPane().add(txtdir);
        txtdir.setBounds(150, 220, 160, 30);

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar);
        btnregistrar.setBounds(350, 150, 100, 30);

        btnBuscarProveedor.setText("BUSCAR");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarProveedor);
        btnBuscarProveedor.setBounds(480, 150, 110, 30);

        btneliminarproveedor.setText("ELIMINAR");
        btneliminarproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarproveedorMouseClicked(evt);
            }
        });
        btneliminarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarproveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminarproveedor);
        btneliminarproveedor.setBounds(480, 210, 110, 30);

        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(240, 500, 90, 30);

        btnmenuprincipal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnmenuprincipal.setText("MENU PRINCIPAL");
        btnmenuprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuprincipalMouseClicked(evt);
            }
        });
        getContentPane().add(btnmenuprincipal);
        btnmenuprincipal.setBounds(440, 500, 130, 30);

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 330, 680, 150);

        btnlimpiardatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnlimpiardatos.setText("LIMPIAR DATOS");
        btnlimpiardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiardatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiardatos);
        btnlimpiardatos.setBounds(390, 270, 140, 30);

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(610, 150, 100, 30);

        txtape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapeKeyTyped(evt);
            }
        });
        getContentPane().add(txtape);
        txtape.setBounds(150, 180, 160, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("LIMPIAR TABLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 270, 120, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/org-fondo-madera-negro.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 780, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuprincipalMouseClicked
       MENU MN = new MENU();
           MN .setVisible(true);
           dispose();
    }//GEN-LAST:event_btnmenuprincipalMouseClicked

    private void btneliminarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarproveedorActionPerformed
       if (tblProveedor.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, presione el boton de buscar");
            return;
        }
        
        if (tblProveedor.getSelectedRow() == -1 ) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        Proveedores objProveedores = new Proveedores();
        modelo = (DefaultTableModel) tblProveedor.getModel();
        
        try {
            
            int nit = Integer.parseInt(txtnit.getText());
            
            boolean result = objProveedores.eliminarProveedor(nit);
            
            if (result == true) {
                JOptionPane.showMessageDialog(null, "El registro se eliminò correctamente");
                //Limpiamos las cajas de texto y los ComboBox.
                txtnit.setText("");
                txtnom.setText("");
                txtape.setText("");
                txtdir.setText("");
                txttel.setText("");
                
                //Limpiamos la tabla (Registros, Columnas).
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
                   
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrio un problema, por favor intenta de nuevo");
            
        }
    }//GEN-LAST:event_btneliminarproveedorActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        //***programacion para el boton Guardar.
       
       //Validaciòn.
        if (txtnit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un Nit");
            txtnit.requestFocus();
            return;
        }
        if (txtnom.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un Nombre");
            txtnom.requestFocus();
            return;
        }
        if (txtape.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un Apellido");
            txtape.requestFocus();
            return;
        }
        if (txtdir.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese una Direccion");
            txtdir.requestFocus();
            return;
        }
        if (txttel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un Telefono");
            txttel.requestFocus();
            return;
        }
        
        
        //Instanciaciòn de la clase Empleados para obtener todos los metodos, atributos
        
        Proveedores objProveedores = new Proveedores();
        
        //Obtenemos todos los datos digitados por el Usuario.
        
        int nit =  Integer.parseInt(txtnit.getText());
        String nombre = txtnom.getText();
        String apellido = txtape.getText();
        String direccion = txtdir.getText();
        String telefono = txttel.getText();
        
        
        try {
            boolean resultado = objProveedores.insertarProveedor(nit, nombre, apellido, direccion, telefono);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Los datos se han registrado satisfactoriamente");
                txtnit.setText("");
                txtnom.setText("");
                txtape.setText("");
                txtdir.setText("");
                txttel.setText("");
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, el registro no se realizò correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrio algo inesperado, por favor vuelva a intentarlo");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnlimpiardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiardatosActionPerformed
        txtnit.setText("");
        txtnom.setText("");
        txtape.setText("");
        txtdir.setText("");
        txttel.setText("");
    }//GEN-LAST:event_btnlimpiardatosActionPerformed

    private void btneliminarproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarproveedorMouseClicked
        int eli=tblProveedor.getSelectedRowCount();
       if(eli>=0){
           model.removeRow(eli);
       }else{
           JOptionPane.showMessageDialog(null,"No Hay Datos Que Eliminar");
       }
    }//GEN-LAST:event_btneliminarproveedorMouseClicked

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        mostrarColumna();
        cargarRegistro();
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       //********************Programaciòn para el Boton actualizar************
        
        //Validar si el usuario no ha presionado el Boton de buscar.
        
        if (tblProveedor.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, presione el boton de buscar");
            return;
        }
        
        if (tblProveedor.getSelectedRow() == -1 ) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        if (txtnit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un Nit!");
            txtnit.requestFocus();
            return;
        }
        if (txtnom.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un Nombre!");
            txtnom.requestFocus();
            return;
        }
        
        if (txtape.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un Apellido");
            txtape.requestFocus();
            return;
        }
        
        if (txtdir.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una Direccion!");
            txtdir.requestFocus();
            return;
        }
        
        if (txttel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un Telefono!");
            txttel.requestFocus();
            return;
        }
        
        
        //Instanciaciòn de la clase Empleados para obtener todos los metodos, atributos
        
        Proveedores objProveedores = new Proveedores();
        
        
        int nit =  Integer.parseInt(txtnit.getText());
        String nombre = txtnom.getText();
        String apellido = txtape.getText();
        String direccion = txtdir.getText();
        String telefono = txttel.getText();
        
        
        modelo = (DefaultTableModel) tblProveedor.getModel();
        try {
            boolean result = objProveedores.actualizarProveedor(nit, nombre, apellido, direccion, telefono);
            if (result == true) {
                JOptionPane.showMessageDialog(null, "Los datos se Actualizaron correctamente.");
                //Limpiamos las cajas de texto y los ComboBox.
                txtnit.setText("");
                txtnom.setText("");
                txtape.setText("");
                txtdir.setText("");
                txttel.setText("");
                
                //Limpiamos la tabla (Registros, Columnas).
                modelo.setColumnCount(0);
                modelo.setRowCount(0);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
       /*Programacion para cuando el Usuario seleccione una fila
        Los datos se muestre en los componentes graficos (TextField, ComboBox)*/
        
        modelo = (DefaultTableModel) tblProveedor.getModel();
        
        try {
            
            //Llenar los datos que se encuentran en la tabla
            txtnit.setText(String.valueOf(modelo.getValueAt(tblProveedor.getSelectedRow() , 0)));
            txtnom.setText(String.valueOf(modelo.getValueAt(tblProveedor.getSelectedRow() , 1)));
            txtape.setText(String.valueOf(modelo.getValueAt(tblProveedor.getSelectedRow() , 2)));
            txtdir.setText(String.valueOf(modelo.getValueAt(tblProveedor.getSelectedRow() , 3)));
            txttel.setText(String.valueOf(modelo.getValueAt(tblProveedor.getSelectedRow() , 4)));
            
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, Ocurriò un error al seleccionar una fila ¡Intentalo de nuevo!");
        }
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void txtnitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnitKeyTyped
       char validar=evt.getKeyChar();
      
      if(Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
      }
    }//GEN-LAST:event_txtnitKeyTyped

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
       char validar=evt.getKeyChar();
      
      if(Character.isDigit(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
      }
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapeKeyTyped
        char validar=evt.getKeyChar();
      
      if(Character.isDigit(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "Ingrese solo Letras");
      }
    }//GEN-LAST:event_txtapeKeyTyped

    private void txttelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelKeyTyped
       char validar=evt.getKeyChar();
      
      if(Character.isLetter(validar)){
          getToolkit().beep();
          evt.consume();
          JOptionPane.showMessageDialog(null, "Ingrese solo Numeros");
      }
    }//GEN-LAST:event_txttelKeyTyped

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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btneliminarproveedor;
    private javax.swing.JButton btnlimpiardatos;
    private javax.swing.JButton btnmenuprincipal;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

    

    
}
