/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Base_datos.Conectar_Oracle;
import Empleado.Agregare;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Ortiz
 */
public class Agregarc extends javax.swing.JFrame {

    /**
     * Creates new form Agregarc
     */
    
    int a=0, b=0, fila1, gara;
    String j="", Fechana = "";
    
    public Agregarc() {
        initComponents();
        
        int a1=0;
        
        
        
        try{
            ResultSet rs1 = cc.Vertodo("select * from Clientes");
            while(rs1.next()){
            a1 = rs1.getInt("Id_cliente");
                
            }
            
            
            
            a = a1 + 1;
            
        } catch(Exception e){
            
        } finally{
            cc.close();
        }
        
        jblUsu1.setText(String.valueOf(a));
        jCbSexo.removeAllItems();
        jCbSexo.insertItemAt("Masculino", 0);
        jCbSexo.insertItemAt("Femenino", 1);
        
        
    }
    
    public void Buscar(){
            
            int a1=0;

            
            
        try {
            ResultSet rs1;
                try {
                    rs1 = cc.Vertodo("select * from empleado");
                    
                    while(rs1.next()){
                        a1 = rs1.getInt("Id_Empleado");
                
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Agregare.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (SQLException ex) {
        }
        
        a = a1 + 1;
        jblUsu1.setText(String.valueOf(a));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtCedula = new javax.swing.JTextField();
        jtxtCalle = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jblUsu1 = new javax.swing.JLabel();
        jCbSexo = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxtSector = new javax.swing.JTextField();
        jtxtCiudad = new javax.swing.JTextField();
        jtxtNcasa = new javax.swing.JTextField();
        jtxtCelular = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Clientes");
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Agregar Clientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 109, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Cedula:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 206, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Sexo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 40, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Calle:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 180, 40));
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 143, 180, 40));
        jPanel1.add(jtxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 199, 180, 40));
        jPanel1.add(jtxtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 130, 40));

        jtxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 130, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 130, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 120, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("N. Registro");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        jblUsu1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jblUsu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 62, 42));

        jCbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jCbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 130, 30));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("Correo Electronico:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 160, -1));
        jPanel1.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 180, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Ciudad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Sector:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Numero de casa:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Celular:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        jPanel1.add(jtxtSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 130, 40));
        jPanel1.add(jtxtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 130, 40));
        jPanel1.add(jtxtNcasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 180, 40));
        jPanel1.add(jtxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));


        return retValue;
    }
    
    public static String fecha(){
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        
        return formato.format(fecha);
        
    }
    
    //Boton para volver al menu
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                
        this.hide();
        
    }//GEN-LAST:event_jButton2ActionPerformed

   
    //Boton para Agregar al cliente
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    
        String Codigo = String.valueOf(a);
        String Nombre = jtxtNombre.getText();
        String Apellido = jtxtApellido.getText();
        String Cedula = jtxtCedula.getText();
        String ele = "";
        if(jCbSexo.getSelectedIndex() == 0){
            ele = "m";
        } else if(jCbSexo.getSelectedIndex() == 1){
            ele = "f";
        }
        String Sexo = ele;
        String Ciudad = jtxtCiudad.getText();
        String Sector = jtxtSector.getText();
        String Calle = jtxtCalle.getText();
        String Ncasa = jtxtNcasa.getText();
        String Telefono = jtxtTelefono.getText();
        String Celular = jtxtCelular.getText();
        String Email = jtxtEmail.getText();
        try{
        if(Nombre.equals("") || Apellido.equals("") || Cedula.equals("") || Sexo.equals("") || Ciudad.equals("") || Sector.equals("") || Calle.equals("") || Ncasa.equals("") || Telefono.equals("") || Celular.equals("") || Email.equals("")){
        
            JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            try{
                    
                    try{
                    cc.Insert("insert into Clientes(Id_cliente, Nombre_cli, Apellido_cli, Cedula_cli, Sexo_cli, Ciudad_cli, Sector_cli, Calle_cli, NCasa_cli, Telefono_cli, Celular_cli, Correo_cli)"
                            + "values ("+Codigo+", '"+Nombre+"', '"+Apellido+"', '"+Cedula+"', '"+Sexo+"', '"+Ciudad+"', '"+Sector+"', '"+Calle+"', '"+Ncasa+"', '"+Telefono+"', '"+Celular+"', '"+Email+"')");
                    this.j = "";
                    
                    jtxtNombre.setText("");
                    jtxtApellido.setText("");
                    jtxtCedula.setText("");
                    ele = "";
                    jtxtCiudad.setText("");
                    jtxtSector.setText("");
                    jtxtCalle.setText("");
                    jtxtNcasa.setText("");
                    jtxtTelefono.setText("");
                    jtxtCelular.setText("");
                    jtxtEmail.setText("");
                    this.gara = 0;
                    Buscar();
                    
                     }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No Se Agrego El Registro", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                    } finally{
                        cc.close();
                    }

            }catch(Exception e){

            } finally{
                cc.close();
            }
        
        } }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(Agregarc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregarc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregarc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregarc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregarc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblUsu1;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCalle;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtCelular;
    private javax.swing.JTextField jtxtCiudad;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNcasa;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSector;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables

    Conectar_Oracle cc = new Conectar_Oracle();
    
}
