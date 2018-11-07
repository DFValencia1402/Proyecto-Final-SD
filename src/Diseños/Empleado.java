package Diseños;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import CRUD.*;
import java.sql.ResultSet;


public class Empleado extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modelo;
        
    public Empleado() {
        initComponents();
        this.setLocationRelativeTo(null);   
        this.setSize(800, 580);
        
       
    }

    //Agragamos las columnas a nuestra Tabla
    private void mostrarColumna(){
        modelo = (DefaultTableModel) tblEmpleados.getModel();
        
        modelo.addColumn("CC");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("GENERO");
        modelo.addColumn("CARGO");
    }
   
    private void cargarRegistro(){
        
        Empleados objEmpleado = new Empleados();
        
        modelo = (DefaultTableModel) tblEmpleados.getModel();
        
        ResultSet resultado = objEmpleado.cargarEmpleado();
        
        try {
            Object datos[] = new Object[6];
            while (resultado.next()) {
                for (int i = 0; i < 6; i++) {
                    datos[i] = resultado.getObject(i + 1);
                }
                modelo.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnBuscarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnmenuprincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        cmbGenero = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        btnactualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/org-fondo-madera-negro.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLEADO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CARGO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 280, 70, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("APELLIDO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 80, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("C.C.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 80, 40, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("NOMBRE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 120, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("TELEFONO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 200, 80, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("GENERO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 240, 80, 20);
        getContentPane().add(txtCedula);
        txtCedula.setBounds(150, 80, 180, 30);

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom);
        txtNom.setBounds(150, 120, 180, 30);
        getContentPane().add(txtApe);
        txtApe.setBounds(150, 160, 180, 30);
        getContentPane().add(txtTel);
        txtTel.setBounds(150, 200, 180, 30);

        btnRegistrarEmpleado.setText("REGISTRAR");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarEmpleado);
        btnRegistrarEmpleado.setBounds(370, 130, 100, 30);

        btnBuscarEmpleado.setText("BUSCAR");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarEmpleado);
        btnBuscarEmpleado.setBounds(500, 130, 110, 30);

        btnEliminarEmpleado.setText("ELIMINAR");
        btnEliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarEmpleadoMouseClicked(evt);
            }
        });
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarEmpleado);
        btnEliminarEmpleado.setBounds(500, 190, 110, 30);

        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir);
        btnsalir.setBounds(180, 490, 80, 30);

        btnmenuprincipal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnmenuprincipal.setText("MENU PRINCIPAL");
        btnmenuprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuprincipalMouseClicked(evt);
            }
        });
        btnmenuprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuprincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenuprincipal);
        btnmenuprincipal.setBounds(500, 490, 150, 30);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEmpleados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 340, 730, 110);

        cmbGenero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "***Seleccionar***", "Masculino", "Femenino" }));
        getContentPane().add(cmbGenero);
        cmbGenero.setBounds(150, 240, 130, 30);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR CAMPOS");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(370, 270, 140, 30);

        cmbCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Cajer@", "Contad@r", "Domiciliario" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(150, 280, 130, 30);

        btnactualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(640, 130, 110, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/org-fondo-madera-negro.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       System.exit(WIDTH);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnmenuprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuprincipalMouseClicked
         MENU MN = new MENU();
           MN .setVisible(true);
           dispose();
    }//GEN-LAST:event_btnmenuprincipalMouseClicked

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
       //***programacion para el boton Guardar.
       
       //Validaciòn.
        if (txtCedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese una cedula");
            txtCedula.requestFocus();
            return;
        }
        if (txtNom.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un nombre");
            txtNom.requestFocus();
            return;
        }
        if (txtApe.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese tùs apellidos");
            txtApe.requestFocus();
            return;
        }
        if (txtTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, Ingrese un telefono");
            txtTel.requestFocus();
            return;
        }
        if (cmbGenero.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, Seleccione un genero");
            cmbGenero.requestFocus();
            return;
        }
        if (cmbCargo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, Seleccione un Cargo");
            cmbCargo.requestFocus();
            return;
        }
        
        //Instanciaciòn de la clase Empleados para obtener todos los metodos, atributos
        
        Empleados objEmpleado = new Empleados();
        
        //Obtenemos todos los datos digitados por el Usuario.
        
        int cedula =  Integer.parseInt(txtCedula.getText());
        String nombre = txtNom.getText();
        String apellido = txtApe.getText();
        String telefono = txtTel.getText();
        String genero = "";
        String cargo = "";
        
        //Validacion para el comboBox Genero
        if (cmbGenero.getSelectedIndex() == 1) {
            genero = "Masculino";
        }
        else{
            genero = "Femenino";
        }
        
        //Validacion para el comboBox Genero
        switch (cmbGenero.getSelectedIndex()) {
            case 1:
                cargo = "Cajer@";
                break;
            case 2:
                cargo = "Contad@r";
                break;
            case 3:
                cargo = "Domiciliario";
                break;
        }
        try {
            boolean resultado = objEmpleado.insertarEmpleado(cedula, nombre, apellido, telefono, genero, cargo);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Los datos se han registrado satisfactoriamente");
                txtCedula.setText("");
                txtNom.setText("");
                txtApe.setText("");
                txtTel.setText("");
                cmbGenero.setSelectedIndex(0);
                cmbCargo.setSelectedIndex(0);
            }
            else {
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrio algo inesperado, por favor vuelva a intentarlo");
        }
      String []registrar = new String[6];
      registrar[0]=txtCedula.getText();
      registrar[1]=txtNom.getText();
      registrar[2]=txtApe.getText();
      registrar[3]=txtTel.getText();
      registrar[4]=(String)cmbGenero.getSelectedItem();
      registrar[5]=(String)cmbCargo.getSelectedItem();
      modelo.addRow(registrar);
        
      
        
                                                       
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnmenuprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuprincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmenuprincipalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCedula.setText("");
        txtNom.setText("");
        txtApe.setText("");
        txtTel.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
     
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnEliminarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoMouseClicked
        int eli=tblEmpleados.getSelectedRowCount();
       if(eli>=0){
           modelo.removeRow(eli);
       }else{
           JOptionPane.showMessageDialog(null,"No Hay Datos Que Eliminar");
       }
    }//GEN-LAST:event_btnEliminarEmpleadoMouseClicked

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        mostrarColumna();
        cargarRegistro();
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnmenuprincipal;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
