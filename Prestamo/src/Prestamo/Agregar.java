/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamo;

import Base_datos.Conectar_Oracle;
import Empleado.Agregare;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oscar Ortiz
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    
    int a=0, b=0, fila1, gara, n;
    String j="", Fechana = "", Codi = "";
    
    public Agregar() {
        initComponents();
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String fecha1 = "";
        fecha1 = formato.format(fecha);
        jLabel10.setText(fecha1);
        int a1=0, b1=0;
        
        try{
        ResultSet rs = cc.Vertodo("select * from Solicitud_prestamo");
        DefaultTableModel model = new DefaultTableModel();
        jtConsulta.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud","Codigo Del Cliente", "Codigo de la Garantia Solidaria", "Codigo de la Garantia Prendaria", "Codigo de la Garantia Hipotecaria", "Monto","Plazo", "Fecha de la solicitud","Tipo de Prestamo"});
             
        ResultSet rs1 = cc.Vertodo("select * from Prestamo_concedido");
        //ResultSet rs2 = cc.Vertodo("select * from tipo_Garante");
        
            
            while(rs1.next()){
            a1 = rs1.getInt("Id_prestamo");
                
            }
            
            while(rs.next()){

                 model.addRow(new Object[]{rs.getInt("ID_solicitud"), rs.getInt("ID_Cliente"), rs.getInt("ID_GaranSolid"), rs.getInt("ID_GaranPren"), rs.getInt("ID_GaranHipo"), rs.getInt("Monto"), rs.getString("Plazo"), rs.getString("Fecha_solicitud"), rs.getString("Tipo_Prestamo")});
                
            }
            
            a = a1 + 1;
        } catch(Exception e){
            
        } finally{
            cc.close();
        }
        
        jLabel3.setText(String.valueOf(this.a));
        
    }
    
    public void Buscar(){
            
            int a1=0;

            
            
        try {
            ResultSet rs1;
                try {
                    rs1 = cc.Vertodo("select * from Prestamo_concedido");
                    
                    while(rs1.next()){
                        a1 = rs1.getInt("Id_prestamo");
                
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Agregare.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (SQLException ex) {
        }
        
        a = a1 + 1;
        jLabel3.setText(String.valueOf(a));
    
    }
    
    //Metodo par ala fecha
    public static String fecha(){
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        
        return formato.format(fecha);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdBuscar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jrbCodigo = new javax.swing.JRadioButton();
        jrbNombre = new javax.swing.JRadioButton();
        jbtBuscar = new javax.swing.JButton();
        jbtMostrar = new javax.swing.JButton();
        jtxtBuscar1 = new javax.swing.JTextField();
        jbtSelec = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Tasa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jlCliente = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jlCliente1 = new javax.swing.JLabel();

        jdBuscar.setTitle("Buscar Garante");
        jdBuscar.setMinimumSize(new java.awt.Dimension(843, 664));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setText("Consultar Solicitud");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtConsulta);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, 823, 382));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton7.setText("Volver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 574, 140, 50));

        jrbCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo.setSelected(true);
        jrbCodigo.setText("Codigo De La Solicitud");
        jrbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(jrbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 11, -1, -1));

        jrbNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre.setText("Codigo Del Cliente");
        jPanel3.add(jrbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 51, -1, -1));

        jbtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 140, 40));

        jbtMostrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar.setText("Mostrar Todo");
        jbtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 200, 40));
        jPanel3.add(jtxtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, -1));

        jbtSelec.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtSelec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Insertar.png"))); // NOI18N
        jbtSelec.setText("Insertar");
        jbtSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSelecActionPerformed(evt);
            }
        });
        jPanel3.add(jbtSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 150, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));

        javax.swing.GroupLayout jdBuscarLayout = new javax.swing.GroupLayout(jdBuscar.getContentPane());
        jdBuscar.getContentPane().setLayout(jdBuscarLayout);
        jdBuscarLayout.setHorizontalGroup(
            jdBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdBuscarLayout.setVerticalGroup(
            jdBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Codigo del prestamo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 34, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Solicitante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 95, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Tasa Interes:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 141, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Estado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 203, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Categoria:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 249, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 295, -1, -1));
        jPanel1.add(Tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 149, 203, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calcular.png"))); // NOI18N
        jButton1.setText("Amortizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 140, 40));
        jPanel1.add(jlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 150, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 120, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 120, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Saldado", "Atrasado" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 200, 30));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 294, 190, 30));
        jPanel1.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 100, 210, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encurso", "Saldado", "Inactivo" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 200, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 430));

        jlCliente1.setText("jLabel12");
        jPanel1.add(jlCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int a1=0;
        String a2 = "";
        
        if(n!=0){
            
            ResultSet rs1, rs2;
                try {
                    rs1 = cc.Vertodo("select * from Prestamo_concedido");
                    
                    
                try {
                    while(rs1.next()){
                        a1 = rs1.getInt("Id_prestamo");
                        
                    }
                    rs1 = cc.Vertodo("select * from Prestamo_concedido where Id_prestamo = "+a1+"");
                    while(rs1.next()){
                        a2 = rs1.getString("Tasa_Interes");
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Agregare.class.getName()).log(Level.SEVERE, null, ex);
                }
            Amortizacion amor = new Amortizacion();
            amor.coemple = a1;
            amor.jlInteres.setText(a2);
            amor.show();
            n=0;
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que registrar el prestamo", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jdBuscar.show();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String Codigo = String.valueOf(a);
        String solicitud = jlCliente1.getText();
        String tasa_interes = Tasa.getText();
        String Este = "";
        String categoria = "";
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String fecha1 = "";
        fecha1 = formato.format(fecha);
        jLabel10.setText(fecha1);
        String sql = "insert into Prestamo_concedido values(?, ?, ?, ?, ?, ?)";
        Connection cn = null;
        PreparedStatement insert;
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.sql.Date sqlDate = new java.sql.Date(t);
        
        if(jComboBox1.getSelectedIndex() == 0){
            Este = "Pendiente";
        } else if(jComboBox1.getSelectedIndex() == 1){
            Este = "Saldado";
        } else {
            Este = "Atrasado";
        }
        
        if(jComboBox2.getSelectedIndex() == 0){
            categoria = "Encurso";
        } else if(jComboBox2.getSelectedIndex() == 1){
            categoria = "Saldado";
        } else {
            categoria = "Inactivo";
        }
        
        try{
            if(solicitud.equals("") || tasa_interes.equals("") ||  Este.equals("") || categoria.equals("")){

                JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);

            }else{
                try{
                    cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ADM","Administrador");
                    insert = cn.prepareStatement(sql);


                        insert.setInt(1, Integer.parseInt(Codigo));
                        insert.setInt(2, Integer.parseInt(solicitud));
                        insert.setInt(3, Integer.parseInt(tasa_interes));
                        insert.setString(4, Este);
                        insert.setString(5, categoria);
                        insert.setDate(6, sqlDate);
                        insert.executeUpdate();
                        
                        jlNombre.setText("");
                        Tasa.setText("");
                        Buscar();
                        
                    JOptionPane.showMessageDialog(null, "Se Agrego El Registro ", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                    this.n = 1;

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Faltan datos por introducir! " + e, "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                } finally{
                    cc.close();
                }
            }
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jdBuscar.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed

        String nombre = jtxtBuscar1.getText();

        if(jrbNombre.isSelected() == true && jrbCodigo.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion");
        } else if(jrbNombre.isSelected() == true){
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar");
            } else{
                try{
                int ho = Integer.parseInt(nombre);
                if(ho >= 0){
                ResultSet rs = cc.Vertodo("select * from Solicitud_prestamo where ID_Cliente like'"+nombre+"%'");
                DefaultTableModel model = new DefaultTableModel();
                jtConsulta.setModel(model);
                model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud","Codigo Del Cliente", "Codigo de la Garantia Solidaria", "Codigo de la Garantia Prendaria", "Codigo de la Garantia Hipotecaria", "Monto","Plazo", "Fecha de la solicitud","Tipo de Prestamo"});
        

                    while(rs.next()){

                        model.addRow(new Object[]{rs.getInt("ID_solicitud"), rs.getInt("ID_Cliente"), rs.getInt("ID_GaranSolid"), rs.getInt("ID_GaranPren"), rs.getInt("ID_GaranHipo"), rs.getInt("Monto"), rs.getString("Plazo"), rs.getString("Fecha_solicitud"), rs.getString("Tipo_Prestamo")});
                
                    }
                }
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } finally{
                    cc.close();
                }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo a buscar");
            } else{

                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho >= 0){
                        ResultSet rs = cc.Vertodo("select * from Solicitud_prestamo where ID_solicitud = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtConsulta.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud","Codigo Del Cliente", "Codigo de la Garantia Solidaria", "Codigo de la Garantia Prendaria", "Codigo de la Garantia Hipotecaria", "Monto","Plazo", "Fecha de la solicitud","Tipo de Prestamo"});
        
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("ID_solicitud"), rs.getInt("ID_Cliente"), rs.getInt("ID_GaranSolid"), rs.getInt("ID_GaranPren"), rs.getInt("ID_GaranHipo"), rs.getInt("Monto"), rs.getString("Plazo"), rs.getString("Fecha_solicitud"), rs.getString("Tipo_Prestamo")});
                
                        }
                    }

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    cc.close();
                }

            }
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrarActionPerformed

        try{
        ResultSet rs = cc.Vertodo("select * from Solicitud_prestamo");
        DefaultTableModel model = new DefaultTableModel();
        jtConsulta.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo de la Solicitud","Codigo Del Cliente", "Codigo de la Garantia Solidaria", "Codigo de la Garantia Prendaria", "Codigo de la Garantia Hipotecaria", "Monto","Plazo", "Fecha de la solicitud","Tipo de Prestamo"});
        

            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("ID_solicitud"), rs.getInt("ID_Cliente"), rs.getInt("ID_GaranSolid"), rs.getInt("ID_GaranPren"), rs.getInt("ID_GaranHipo"), rs.getInt("Monto"), rs.getString("Plazo"), rs.getString("Fecha_solicitud"), rs.getString("Tipo_Prestamo")});
                
            }

        } catch(Exception e){

        } finally{
            cc.close();
        }
    }//GEN-LAST:event_jbtMostrarActionPerformed

    private void jbtSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSelecActionPerformed

        fila1 = jtConsulta.getSelectedRow();
        String at = "", at1 = "";

        try{
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un Cliente", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if(fila1 >=0 ){
                    if(this.gara > 0){

                        JOptionPane.showMessageDialog(null, "Error al realizar el proceso, Contactar al tecnico");

                    }else {

                        this.j= "Lleno";
                        at = jtConsulta.getValueAt(fila1, 1).toString();
                        at1 = jtConsulta.getValueAt(fila1, 0).toString();
                        ResultSet rs1 = cc.Vertodo("select * from Clientes where ID_cliente = "+at+"");
                        int a1;
                        String n = "";
                                    
                        while(rs1.next()){
                        n = rs1.getString("Nombre_cli");
                        }
                        
                        //this.gara = Integer.parseInt(at);
                        jlCliente1.setText(at1);
                        jlNombre.setText(n);
                        jdBuscar.hide();

                    }
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jbtSelecActionPerformed

    private void jrbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbCodigoActionPerformed

    //Boton para salir de la ventana
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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tasa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtMostrar;
    private javax.swing.JButton jbtSelec;
    private javax.swing.JDialog jdBuscar;
    private javax.swing.JLabel jlCliente;
    public static javax.swing.JLabel jlCliente1;
    public static javax.swing.JLabel jlNombre;
    private javax.swing.JRadioButton jrbCodigo;
    private javax.swing.JRadioButton jrbNombre;
    private javax.swing.JTable jtConsulta;
    public static javax.swing.JTextField jtxtBuscar1;
    // End of variables declaration//GEN-END:variables

    Conectar_Oracle cc = new Conectar_Oracle();

}
