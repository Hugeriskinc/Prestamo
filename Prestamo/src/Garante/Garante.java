/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Garante;

import Base_datos.Conectar;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Ortiz
 */
public class Garante extends javax.swing.JFrame {

    /**
     * Creates new form Garante
     */
    
    int a=0, b=0, fila1, gara;
    String j="", Fechana = "";
    
    public Garante() {
        initComponents();
        
        int b1=0;
        
        try{
        
            ResultSet rs2 = cc.Vertodo("select * from Tipo_Garante");
            
            while(rs2.next()){
            b1 = rs2.getInt("Id_garante");
                
            }
            b = b1 + 1;
            
            
        } catch(Exception e){
        
        }
        
        jblUsu2.setText(String.valueOf(b));
        jCbSexo1.removeAllItems();
        jCbSexo1.insertItemAt("Masculino", 0);
        jCbSexo1.insertItemAt("Femenino", 1);
        jcTipo.removeAllItems();
        jcTipo.insertItemAt("Prendario", 0);
        jcTipo.insertItemAt("Hipotecario", 1);
        jcTipo.insertItemAt("Solidario", 2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtxtNombre1 = new javax.swing.JTextField();
        jtxtCedula1 = new javax.swing.JTextField();
        jtxtDireccion1 = new javax.swing.JTextField();
        jtxtTelefono1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jblUsu2 = new javax.swing.JLabel();
        jCbSexo1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel10.setText("Agregar Garante");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Nombre:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 109, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Cedula:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Fecha de nacimiento:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Sexo:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 282, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Direccion:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 337, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Telefono:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 387, -1, -1));
        jPanel2.add(jtxtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 112, 190, -1));
        jPanel2.add(jtxtCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 185, -1));

        jtxtDireccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDireccion1ActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 190, -1));
        jPanel2.add(jtxtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 190, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir.png"))); // NOI18N
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 150, 50));

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 150, 50));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("N. Registro");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jblUsu2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(jblUsu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 62, 42));

        jCbSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jCbSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 282, 190, 27));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("Tipo:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jcTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 190, -1));
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 230, 190, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDireccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDireccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccion1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Date fecha = null;
        String Codigo = String.valueOf(b);
        String Nombre = jtxtNombre1.getText();
        String Cedula = jtxtCedula1.getText();
        String ele = "";
        if(jCbSexo1.getSelectedIndex() == 0){
            ele = "m";
        } else if(jCbSexo1.getSelectedIndex() == 1){
            ele = "f";
        }
        String Sexo = ele;
        String Direccion = jtxtDireccion1.getText();
        String Telefono = jtxtTelefono1.getText();
        String Tipo = "";
        if(jcTipo.getSelectedIndex() == 0){
            Tipo = "Prendiario";
        } else if(jcTipo.getSelectedIndex() == 1){
            Tipo = "Hipotecario";
        } else if(jcTipo.getSelectedIndex() == 2){
            Tipo = "Solidario";
        }

        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");

        try{
            String fechana = "";
            fechana = formato.format(jDateChooser2.getDate());

            if(Nombre.equals("") || Cedula.equals("") || Telefono.equals("")){

                JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);

            }else{
                try{

                    cc.Insert("insert into Tipo_Garante(Id_Garante, Nombre_completo, Cedula, Fecha_naci, Sexo, Direccion, Telefono, Tipo)"
                        + "values("+Codigo+", '"+Nombre+"', '"+Cedula+"', '"+fechana+"', '"+Sexo+"', '"+Direccion+"', '"+Telefono+"', '"+Tipo+"')");
                    this.j= "Lleno";
                    this.gara = b;

                    jtxtNombre1.setText("");
                    jtxtCedula1.setText("");
                    ele = "";
                    jtxtDireccion1.setText("");
                    jtxtTelefono1.setText("");
                    jDateChooser2.setDate(fecha);
                    fechana = "";
                    this.gara = 0;

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No Se Agrego El Registro", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                } finally{
                    cc.cerrar();
                }
                this.hide();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
        }
        Tipo = "";
        ele = "";
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.hide();

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Garante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Garante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Garante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Garante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Garante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jCbSexo1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblUsu2;
    private javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JTextField jtxtCedula1;
    private javax.swing.JTextField jtxtDireccion1;
    private javax.swing.JTextField jtxtNombre1;
    private javax.swing.JTextField jtxtTelefono1;
    // End of variables declaration//GEN-END:variables

    Conectar cc = new Conectar();
    
}
