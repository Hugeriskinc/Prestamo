/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solicitud;

import Base_datos.Conectar;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar Ortiz
 */
public class SolicitudVer extends javax.swing.JFrame {

    /**
     * Creates new form SolicitudVer
     */
    public SolicitudVer() {
        initComponents();
        
        ResultSet rs = bd.Vertodo("select * from Solicitud");
        DefaultTableModel model = new DefaultTableModel();
        jtTabla.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud", "Nombre Del Cliente", "Cedula", "Monto Solicitado", "Correo Eletronico", "Garante", "Fecha de Registro", "Codigo del epleado", "Estatus"});
                try{
            
            while(rs.next()){
                
                model.addRow(new Object[]{rs.getInt("Id_Solicitud"), rs.getString("Nombre_cliente"), rs.getString("Cedula"), rs.getString("Monto_prestamo"), rs.getString("Correo_elec"), rs.getString("Tipo_garante"), rs.getString("Fecha_re"), rs.getInt("Id_empleado"), rs.getString("Estatus")});

            }
            
        } catch(Exception e){
            System.out.println(e);
        } finally{
            bd.cerrar();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jtxtBuscar = new javax.swing.JTextField();
        jbtBuscar = new javax.swing.JButton();
        jrbNombre = new javax.swing.JRadioButton();
        jrbCodigo = new javax.swing.JRadioButton();
        jbtMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Consultar Solicitudes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 20, -1, -1));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 819, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 140, 50));
        jPanel1.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 109, 210, -1));

        jbtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 150, 60));

        jrbNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre.setText("Nombre");
        jPanel1.add(jrbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 69, -1, -1));

        jrbCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo.setSelected(true);
        jrbCodigo.setText("Codigo");
        jPanel1.add(jrbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 29, -1, -1));

        jbtMostrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar.setText("Mostrar Todo");
        jbtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 210, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.hide();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed

        String nombre = jtxtBuscar.getText();

         if(jrbNombre.isSelected() == false && jrbCodigo.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
        if(jrbNombre.isSelected() == true && jrbCodigo.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        } else if(jrbNombre.isSelected() == true){
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } else{
                ResultSet rs = bd.Vertodo("select * from Solicitud where Nombre_cliente like'"+nombre+"%'");
                DefaultTableModel model = new DefaultTableModel();
                jtTabla.setModel(model);
                model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud", "Nombre Del Cliente", "Cedula", "Monto Solicitado", "Correo Eletronico", "Garante", "Fecha de Registro", "Codigo del epleado", "Estatus"});
                try{

                    while(rs.next()){

                        model.addRow(new Object[]{rs.getInt("Id_Solicitud"), rs.getString("Nombre_cliente"), rs.getString("Cedula"), rs.getString("Monto_prestamo"), rs.getString("Correo_elec"), rs.getString("Tipo_garante"), rs.getString("Fecha_re"), rs.getInt("Id_empleado"), rs.getString("Estatus")});

                    }

                } catch(Exception e){

                } finally{
                    bd.cerrar();
                }
               }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo a buscar");
            } else{
                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho >= 0){
                        ResultSet rs = bd.Vertodo("select * from Solicitud where Id_Solicitud = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtTabla.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud", "Nombre Del Cliente", "Cedula", "Monto Solicitado", "Correo Eletronico", "Garante", "Fecha de Registro", "Codigo del epleado", "Estatus"});
                
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_Solicitud"), rs.getString("Nombre_cliente"), rs.getString("Cedula"), rs.getString("Monto_prestamo"), rs.getString("Correo_elec"), rs.getString("Tipo_garante"), rs.getString("Fecha_re"), rs.getInt("Id_empleado"), rs.getString("Estatus")});

                        }
                    }

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    bd.cerrar();
                }
            }
        }
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrarActionPerformed

        ResultSet rs = bd.Vertodo("select * from Solicitud");
        DefaultTableModel model = new DefaultTableModel();
        jtTabla.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud", "Nombre Del Cliente", "Cedula", "Monto Solicitado", "Correo Eletronico", "Garante", "Fecha de Registro", "Codigo del epleado", "Estatus"});
        try{

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_Solicitud"), rs.getString("Nombre_cliente"), rs.getString("Cedula"), rs.getString("Monto_prestamo"), rs.getString("Correo_elec"), rs.getString("Tipo_garante"), rs.getString("Fecha_re"), rs.getInt("Id_empleado"), rs.getString("Estatus")});

            }

        } catch(Exception e){

        } finally{
            bd.cerrar();
        }
    }//GEN-LAST:event_jbtMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(SolicitudVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitudVer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtMostrar;
    private javax.swing.JRadioButton jrbCodigo;
    private javax.swing.JRadioButton jrbNombre;
    private javax.swing.JTable jtTabla;
    public static javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables


    Conectar bd = new Conectar();
}