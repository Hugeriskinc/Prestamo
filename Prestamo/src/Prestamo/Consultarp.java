/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamo;

import Base_datos.Conectar;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar Ortiz
 */
public class Consultarp extends javax.swing.JFrame {

    /**
     * Creates new form Consultar
     */
    public Consultarp() {
        initComponents();
        ResultSet rs = bd.Vertodo("select * from Prestamo");
        DefaultTableModel model = new DefaultTableModel();
        jtTabla.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del prestamo","Monto de la deuda","Monto restante", "Monto total", "Itebis", "Ganancias", "Codigo del cliente", "Fecha del prestamo"});
        try{
            
            while(rs.next()){
                
                model.addRow(new Object[]{rs.getInt("Id_prestamo"), rs.getInt("Monto_deuda"),rs.getInt("Monto_restante"), rs.getInt("Monto_total"),rs.getInt("Itebis"), rs.getInt("Ganancias"), rs.getInt("Id_cliente"), rs.getString("Fecha_prestamo")});
                
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
        jbtBuscar = new javax.swing.JButton();
        jtxtBuscar = new javax.swing.JTextField();
        jbtMostrar = new javax.swing.JButton();
        jrbMonto = new javax.swing.JRadioButton();
        jrbCodigo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar.setText("Buscar");
        jbtBuscar.setToolTipText("");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, 50));
        jPanel1.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        jbtMostrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar.setText("Mostrar Todo");
        jbtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 210, 50));

        jrbMonto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbMonto.setText("Monto");
        jPanel1.add(jrbMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jrbCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo.setSelected(true);
        jrbCodigo.setText("Codigo");
        jPanel1.add(jrbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 150, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Consultar Prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 36, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 753, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));


        return retValue;
    }
    
    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed

        String nombre = jtxtBuscar.getText();
        
        if(jrbMonto.isSelected() == false && jrbCodigo.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
        if(jrbMonto.isSelected() == true && jrbCodigo.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        } else if(jrbMonto.isSelected() == true){
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el monto a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 char k = nombre.charAt(0);
                if(Character.isLetter(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Numero", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } else{
                ResultSet rs = bd.Vertodo("select * from Prestamo where Monto_deuda like'"+nombre+"%'");
                DefaultTableModel model = new DefaultTableModel();
                jtTabla.setModel(model);
                model.setColumnIdentifiers(new Object[]{"Codigo del prestamo","Monto de la deuda","Monto restante", "Monto total", "Itebis", "Ganancias", "Codigo del cliente", "Fecha del prestamo"});
                try{

                    while(rs.next()){

                        model.addRow(new Object[]{rs.getInt("Id_prestamo"), rs.getInt("Monto_deuda"),rs.getInt("Monto_restante"), rs.getInt("Monto_total"),rs.getInt("Itebis"), rs.getInt("Ganancias"), rs.getInt("Id_cliente"), rs.getString("Fecha_prestamo")});
                
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
                    char k = nombre.charAt(0);
                if(Character.isLetter(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Numero", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } else{
                        ResultSet rs = bd.Vertodo("select * from Prestamo where id_prestamo = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtTabla.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del prestamo","Monto de la deuda","Monto restante", "Monto total", "Itebis", "Ganancias", "Codigo del cliente", "Fecha del prestamo"});
        
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_prestamo"), rs.getInt("Monto_deuda"),rs.getInt("Monto_restante"), rs.getInt("Monto_total"),rs.getInt("Itebis"), rs.getInt("Ganancias"), rs.getInt("Id_cliente"), rs.getString("Fecha_prestamo")});
                
                        }
                    }

                } catch(Exception e){

                    //JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    bd.cerrar();
                }

            }
        }
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrarActionPerformed

        ResultSet rs = bd.Vertodo("select * from Prestamo");
        DefaultTableModel model = new DefaultTableModel();
        jtTabla.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del prestamo","Monto de la deuda","Monto restante", "Monto total", "Itebis", "Ganancias", "Codigo del cliente", "Fecha del prestamo"});
        try{

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_prestamo"), rs.getInt("Monto_deuda"),rs.getInt("Monto_restante"), rs.getInt("Monto_total"),rs.getInt("Itebis"), rs.getInt("Ganancias"), rs.getInt("Id_cliente"), rs.getString("Fecha_prestamo")});
                          
            }

        } catch(Exception e){

        } finally{
            bd.cerrar();
        }
    }//GEN-LAST:event_jbtMostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.hide();

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
            java.util.logging.Logger.getLogger(Consultarp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultarp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultarp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultarp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultarp().setVisible(true);
            }
        });
    }
    
    Conectar bd = new Conectar();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtMostrar;
    private javax.swing.JRadioButton jrbCodigo;
    private javax.swing.JRadioButton jrbMonto;
    private javax.swing.JTable jtTabla;
    public static javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables
}