/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solicitud;

import Base_datos.Conectar_Oracle;
import Empleado.Agregare;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Solicitud extends javax.swing.JFrame {

    /**
     * Creates new form Solicitud
     */
    
    int a=0, fila1, gara;
    static public int Cliente=0;
    String j="", Fechana = "";
    String codigogrso;
    String codigogrhi;
    String codigogrpre;
    
    public Solicitud() {
        initComponents();
        
        int a1=0, b1=0;
        
        DefaultTableModel model = new DefaultTableModel(), model1 = new DefaultTableModel(), model2 = new DefaultTableModel(), model3 = new DefaultTableModel();
        jtgarantia1.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del Garantia","Nombre","Cedula", "Sexo", "Direccion", "Telefono", "Direccion del empleo"});
        
        jtgarantia2.setModel(model1);
        model1.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Direccion", "Tipo vivienda", "Nombre", "Cedula", "Titulo"});
        
        jtgarantia3.setModel(model2);
        model2.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Marca carro", "Modelo Vehiculo", "Año Vehiculo", "Matricula", "Dueño", "Direccion"});
        
        jtConsulta.setModel(model3);
        model3.setColumnIdentifiers(new Object[]{"Codigo del Cliente", "Nombre", "Apellido", "Cedula", "Sexo", "Ciudad", "Sector", "Calle", "# Casa", "Telefono", "Celular", "Correo"});
        
        
        try{
        ResultSet rs = cc.Vertodo("select * from Solicitud_prestamo");
        ResultSet rs1 = cc.Vertodo("select * from Garantia_solidaria");
        ResultSet rs2 = cc.Vertodo("select * from Garantia_Hipotecaria");
        ResultSet rs3 = cc.Vertodo("select * from Garantia_Prendaria");
        ResultSet rs4 = cc.Vertodo("select * from Clientes");
            
            while(rs.next()){
            a1 = rs.getInt("Id_solicitud");
                
            }
            
            while(rs1.next()){
            model.addRow(new Object[]{rs1.getInt("Id_GaranSolid"), rs1.getString("Nombre_solid"), rs1.getString("Cedula_solid"), rs1.getString("Sexo_solid"), rs1.getString("Direccion_solid"), rs1.getString("Telefono_solid"), rs1.getString("Direccion_Empleo")});
                
            }
            
            while(rs2.next()){
            model1.addRow(new Object[]{rs2.getInt("ID_GaranHipo"), rs2.getString("Direccion_Vivienda"), rs2.getString("Tipo_Vivienda"), rs2.getString("Nombre_Dueno"), rs2.getString("Cedula_Dueno"), rs2.getString("Titulo_Propiedad")});
                
            }
            
            while(rs3.next()){
            model2.addRow(new Object[]{rs3.getInt("ID_GaranPren"), rs3.getString("Marca_Vehiculo"), rs3.getString("Modelo_Vehiculo"), rs3.getString("Año_Vehiculo"), rs3.getString("Matricula_Vehiculo"), rs3.getString("Dueno_vehiculo"), rs3.getString("Direccion_Dueno")});
                
            }
            
            while(rs4.next()){
            model3.addRow(new Object[]{rs4.getInt("ID_cliente"), rs4.getString("Nombre_cli"), rs4.getString("Apellido_cli"), rs4.getString("Cedula_cli"), rs4.getString("Sexo_cli"), rs4.getString("Ciudad_cli"), rs4.getString("Sector_cli"), rs4.getString("Calle_cli"), rs4.getString("NCasa_cli"), rs4.getString("Telefono_cli"), rs4.getString("Celular_cli"), rs4.getString("Correo_cli")});
                
            }
            
            a = a1 + 1;
        } catch(Exception e){
            
        } finally{
            cc.close();
        }
        
        jLabel11.setText(fecha());
        
        jlCodigo.setText(String.valueOf(a));
        jcbGarante.removeAllItems();
        jcbGarante.addItem("Solidario");
        jcbGarante.addItem("Hipotecario");
        jcbGarante.addItem("Prendaria");
        
        jcPrestamo.removeAllItems();
        jcPrestamo.addItem("Personal");
        jcPrestamo.addItem("Prendario");
        jcPrestamo.addItem("Hipotecario");
        
    }
    
    public void Buscar(){
            
            int a1=0;

            
            
        try {
            ResultSet rs1;
                try {
                    rs1 = cc.Vertodo("select * from Solicitud_prestamo");
                    
                    while(rs1.next()){
                        a1 = rs1.getInt("Id_Solicitud");
                
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Agregare.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        } catch (SQLException ex) {
        }
        
        a = a1 + 1;
        jlCodigo.setText(String.valueOf(a));
    
    }
    
    //Metodo par ala fecha
    public static String fecha(){
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        
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
        jrbNombre = new javax.swing.JRadioButton();
        jrbCodigo = new javax.swing.JRadioButton();
        jbtBuscar = new javax.swing.JButton();
        jbtMostrar = new javax.swing.JButton();
        jtxtBuscar1 = new javax.swing.JTextField();
        jbtSelec = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jdGarantiaSoli = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtgarantia1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jtxtBuscar = new javax.swing.JTextField();
        jbtBuscar1 = new javax.swing.JButton();
        jrbNombre1 = new javax.swing.JRadioButton();
        jrbCodigo1 = new javax.swing.JRadioButton();
        jbtMostrar1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jdGarantiaPren = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtgarantia2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jtxtBuscar2 = new javax.swing.JTextField();
        jbtBuscar2 = new javax.swing.JButton();
        jrbNombre2 = new javax.swing.JRadioButton();
        jrbCodigo2 = new javax.swing.JRadioButton();
        jbtMostrar2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jdGarantiaHipo = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtgarantia3 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jtxtBuscar3 = new javax.swing.JTextField();
        jbtBuscar3 = new javax.swing.JButton();
        jrbNombre3 = new javax.swing.JRadioButton();
        jrbCodigo3 = new javax.swing.JRadioButton();
        jbtMostrar3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtMonto = new javax.swing.JTextField();
        jtxtPlazo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbGarante = new javax.swing.JComboBox<>();
        jlCliente = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jcPrestamo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlCliente1 = new javax.swing.JLabel();

        jdBuscar.setTitle("Buscar Garante");
        jdBuscar.setMinimumSize(new java.awt.Dimension(850, 640));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setText("Consultar Cliente");
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

        jrbNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre.setSelected(true);
        jrbNombre.setText("Nombre Cliente");
        jrbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNombreActionPerformed(evt);
            }
        });
        jPanel3.add(jrbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 11, -1, -1));

        jrbCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo.setText("Codigo Del Cliente");
        jPanel3.add(jrbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 51, -1, -1));

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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jdGarantiaSoli.setMinimumSize(new java.awt.Dimension(870, 710));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel12.setText("Consultar Garantia Solidaria");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jtgarantia1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtgarantia1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 819, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 612, 140, 50));
        jPanel2.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 109, 210, 30));

        jbtBuscar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar1.setText("Buscar");
        jbtBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, 50));

        jrbNombre1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre1.setText("Nombre");
        jPanel2.add(jrbNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jrbCodigo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo1.setSelected(true);
        jrbCodigo1.setText("Codigo");
        jPanel2.add(jrbCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jbtMostrar1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar1.setText("Mostrar Todo");
        jbtMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtMostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 200, 50));

        jButton6.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Confirmar.png"))); // NOI18N
        jButton6.setText("Seleccionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 180, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 860, 680));

        jLabel14.setText("jLabel3");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        javax.swing.GroupLayout jdGarantiaSoliLayout = new javax.swing.GroupLayout(jdGarantiaSoli.getContentPane());
        jdGarantiaSoli.getContentPane().setLayout(jdGarantiaSoliLayout);
        jdGarantiaSoliLayout.setHorizontalGroup(
            jdGarantiaSoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdGarantiaSoliLayout.setVerticalGroup(
            jdGarantiaSoliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdGarantiaSoliLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdGarantiaPren.setMinimumSize(new java.awt.Dimension(870, 710));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel15.setText("Consultar Garantia Hipotecaria");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jtgarantia2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtgarantia2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 819, -1));

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton8.setText("Volver");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 612, 140, 50));
        jPanel4.add(jtxtBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 109, 210, 30));

        jbtBuscar2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar2.setText("Buscar");
        jbtBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscar2ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, 50));

        jrbNombre2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre2.setText("Nombre");
        jPanel4.add(jrbNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jrbCodigo2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo2.setSelected(true);
        jrbCodigo2.setText("Codigo");
        jPanel4.add(jrbCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jbtMostrar2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar2.setText("Mostrar Todo");
        jbtMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrar2ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtMostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 200, 50));

        jButton9.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Confirmar.png"))); // NOI18N
        jButton9.setText("Seleccionar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 180, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 860, 680));

        jLabel17.setText("jLabel3");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        javax.swing.GroupLayout jdGarantiaPrenLayout = new javax.swing.GroupLayout(jdGarantiaPren.getContentPane());
        jdGarantiaPren.getContentPane().setLayout(jdGarantiaPrenLayout);
        jdGarantiaPrenLayout.setHorizontalGroup(
            jdGarantiaPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdGarantiaPrenLayout.setVerticalGroup(
            jdGarantiaPrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdGarantiaPrenLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdGarantiaHipo.setMinimumSize(new java.awt.Dimension(870, 710));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel18.setText("Consultar Garantia Prendaria");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jtgarantia3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtgarantia3);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 819, -1));

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver 1.png"))); // NOI18N
        jButton10.setText("Volver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 612, 140, 50));
        jPanel5.add(jtxtBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 109, 210, 30));

        jbtBuscar3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jbtBuscar3.setText("Buscar");
        jbtBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscar3ActionPerformed(evt);
            }
        });
        jPanel5.add(jbtBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, 50));

        jrbNombre3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbNombre3.setText("Nombre");
        jPanel5.add(jrbNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jrbCodigo3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jrbCodigo3.setSelected(true);
        jrbCodigo3.setText("Codigo");
        jPanel5.add(jrbCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jbtMostrar3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbtMostrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        jbtMostrar3.setText("Mostrar Todo");
        jbtMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMostrar3ActionPerformed(evt);
            }
        });
        jPanel5.add(jbtMostrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 200, 50));

        jButton11.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Confirmar.png"))); // NOI18N
        jButton11.setText("Seleccionar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 180, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 860, 680));

        jLabel22.setText("jLabel3");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        javax.swing.GroupLayout jdGarantiaHipoLayout = new javax.swing.GroupLayout(jdGarantiaHipo.getContentPane());
        jdGarantiaHipo.getContentPane().setLayout(jdGarantiaHipoLayout);
        jdGarantiaHipoLayout.setHorizontalGroup(
            jdGarantiaHipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdGarantiaHipoLayout.setVerticalGroup(
            jdGarantiaHipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdGarantiaHipoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Solicitud de Prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("NO. Solicitud");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jlCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 53, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Garantia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Monto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Plazo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel1.add(jtxtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 215, 28));
        jPanel1.add(jtxtPlazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 215, 28));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 415, 160, 60));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 415, 140, 60));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Cliente:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Tipo Prestamo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jcbGarante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcbGarante, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 140, 30));
        jPanel1.add(jlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 150, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 140, 40));

        jcPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 140, 30));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 220, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        jlCliente1.setText("jLabel10");
        jPanel1.add(jlCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton cerrar la ventana
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.hide();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Boton para llenar el registro
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String Codigo = String.valueOf(a);
        String codigocl = String.valueOf(jlCliente1.getText());
        String codigogaso = this.codigogrso;
        String codigogapre = this.codigogrpre;
        String codigogahi = this.codigogrhi;
        String monto = jtxtMonto.getText();
        String plazo = jtxtPlazo.getText();
        String sql = "insert into Solicitud_prestamo values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection cn = null;
        PreparedStatement insert;
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.sql.Date sqlDate = new java.sql.Date(t);
        
        String Tipopre = "";
        
        if(jcPrestamo.getSelectedIndex() == 0){
            Tipopre = "Personal";
        } else if(jcPrestamo.getSelectedIndex() == 1){
            Tipopre = "Prendaria";
        }else if(jcPrestamo.getSelectedIndex() == 2){
            Tipopre = "Hipotecaria";
        }
        
        
        try{
            
            if(monto.equals("") || plazo.equals("") || codigocl.equals("") || Tipopre.equals("")){
        
            JOptionPane.showMessageDialog(null, "Faltan datos por introducir!", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
            
        }else{  
                
                try{
                    
                
                    try{
                    
                        cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ADM","Administrador");
                        insert = cn.prepareStatement(sql);
                        
                        insert.setInt(1, Integer.parseInt(Codigo));
                        insert.setInt(2, Integer.parseInt(codigocl));
                        insert.setString(3, codigogaso);
                        insert.setString(4, codigogapre);
                        insert.setString(5, codigogahi);
                        insert.setInt(6, Integer.parseInt(monto));
                        insert.setString(7, plazo);
                        insert.setDate(8, sqlDate);
                        insert.setString(9, Tipopre);
                        insert.executeUpdate();
                    
                        JOptionPane.showMessageDialog(null, "Se Agrego El Registro", "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                        
                    codigocl = "";
                    codigogaso = "";
                    codigogapre = "";
                    codigogahi = "";
                    Tipopre = "";
                    jlCliente.setText("");
                    jtxtMonto.setText("");
                    jtxtPlazo.setText("");
                    Buscar();
                    
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No Se Agrego El Registro " + e, "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                    } finally{
                        cc.close();
                    } 
     
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error" + e, "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
                }
                    
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error" + e, "Sistema De Prestamo", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jdBuscar.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jrbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbNombreActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed

        String nombre = jtxtBuscar1.getText();

        if(jrbCodigo.isSelected() == true && jrbNombre.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion");
        } else if(jrbNombre.isSelected() == true){
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar");
            } else{
                try{
                    char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } else{
                        ResultSet rs4 = cc.Vertodo("select * from Clientes where Nombre_cli like'"+nombre+"%'");
                        DefaultTableModel model = new DefaultTableModel();
                        jtConsulta.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Cliente", "Nombre", "Apellido", "Cedula", "Sexo", "Ciudad", "Sector", "Calle", "# Casa", "Telefono", "Celular", "Correo"});
        
                        while(rs4.next()){

                            model.addRow(new Object[]{rs4.getInt("ID_cliente"), rs4.getString("Nombre_cli"), rs4.getString("Apellido_cli"), rs4.getString("Cedula_cli"), rs4.getString("Sexo_cli"), rs4.getString("Ciudad_cli"), rs4.getString("Sector_cli"), rs4.getString("Calle_cli"), rs4.getString("NCasa_cli"), rs4.getString("Telefono_cli"), rs4.getString("Celular_cli"), rs4.getString("Correo_cli")});
              
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
                        ResultSet rs4 = cc.Vertodo("select * from Clientes where ID_cliente = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtConsulta.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Cliente", "Nombre", "Apellido", "Cedula", "Sexo", "Ciudad", "Sector", "Calle", "# Casa", "Telefono", "Celular", "Correo"});
        
                        while(rs4.next()){

                            model.addRow(new Object[]{rs4.getInt("ID_cliente"), rs4.getString("Nombre_cli"), rs4.getString("Apellido_cli"), rs4.getString("Cedula_cli"), rs4.getString("Sexo_cli"), rs4.getString("Ciudad_cli"), rs4.getString("Sector_cli"), rs4.getString("Calle_cli"), rs4.getString("NCasa_cli"), rs4.getString("Telefono_cli"), rs4.getString("Celular_cli"), rs4.getString("Correo_cli")});
              
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
            ResultSet rs4 = cc.Vertodo("select * from Clientes");
            DefaultTableModel model = new DefaultTableModel();
            jtConsulta.setModel(model);
            model.setColumnIdentifiers(new Object[]{"Codigo del Cliente", "Nombre", "Apellido", "Cedula", "Sexo", "Ciudad", "Sector", "Calle", "# Casa", "Telefono", "Celular", "Correo"});
        
            while(rs4.next()){

                model.addRow(new Object[]{rs4.getInt("ID_cliente"), rs4.getString("Nombre_cli"), rs4.getString("Apellido_cli"), rs4.getString("Cedula_cli"), rs4.getString("Sexo_cli"), rs4.getString("Ciudad_cli"), rs4.getString("Sector_cli"), rs4.getString("Calle_cli"), rs4.getString("NCasa_cli"), rs4.getString("Telefono_cli"), rs4.getString("Celular_cli"), rs4.getString("Correo_cli")});
              
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
                        jlCliente1.setText(at1);
                        
                        jlCliente.setText(at);
                        jdBuscar.hide();

                    }
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jbtSelecActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jdBuscar.show();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(jcbGarante.getSelectedIndex() == 0){
            jdGarantiaSoli.show();
        } else if(jcbGarante.getSelectedIndex() == 1){
            jdGarantiaPren.show();
        }else if(jcbGarante.getSelectedIndex() == 2){
            jdGarantiaHipo.show();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jdGarantiaSoli.hide();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbtBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscar1ActionPerformed

        String nombre = jtxtBuscar.getText();

        if(jrbCodigo.isSelected() == false && jrbNombre.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(jrbCodigo.isSelected() == true && jrbNombre.isSelected() == true){
                JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else if(jrbCodigo.isSelected() == true){if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else{
                char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } else{

                    DefaultTableModel model = new DefaultTableModel();
                    jtgarantia1.setModel(model);
                    model.setColumnIdentifiers(new Object[]{"Codigo del Garantia","Nombre","Cedula", "Sexo", "Direccion", "Telefono", "Direccion del empleo"});
        
                    try{
                        ResultSet rs = cc.Vertodo("select * from Garantia_solidaria where Nombre_solid like'"+nombre+"%'");
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_cliente"), rs.getString("Nombre_cli"), rs.getString("Apellido_cli"), rs.getString("Cedula_cli"), rs.getString("Sexo_cli"), rs.getString("Ciudad_cli"), rs.getString("Sector_cli"), rs.getString("Calle_cli"), rs.getString("NCasa_cli"), rs.getString("Telefono_cli"), rs.getString("Celular_cli"), rs.getString("Correo_cli")});

                        }

                    } catch(Exception e){

                    } finally{
                        cc.close();
                    }
                }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho > 0){
                        ResultSet rs = cc.Vertodo("select * from Garantia_solidaria where Id_GaranSolid = "+nombre+"");
                        DefaultTableModel model = new DefaultTableModel();
                        jtgarantia1.setModel(model);
                        model.setColumnIdentifiers(new Object[]{"Codigo del Garantia","Nombre","Cedula", "Sexo", "Direccion", "Telefono", "Direccion del empleo"});
        
                        while(rs.next()){

                            model.addRow(new Object[]{rs.getInt("Id_cliente"), rs.getString("Nombre_cli"), rs.getString("Apellido_cli"), rs.getString("Cedula_cli"), rs.getString("Sexo_cli"), rs.getString("Ciudad_cli"), rs.getString("Sector_cli"), rs.getString("Calle_cli"), rs.getString("NCasa_cli"), rs.getString("Telefono_cli"), rs.getString("Celular_cli"), rs.getString("Correo_cli")});

                        }
                    }

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    cc.close();
                }
            }
        }
        }
    }//GEN-LAST:event_jbtBuscar1ActionPerformed

    private void jbtMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrar1ActionPerformed

        DefaultTableModel model = new DefaultTableModel();
        jtgarantia1.setModel(model);
        model.setColumnIdentifiers(new Object[]{"Codigo del Garantia","Nombre","Cedula", "Sexo", "Direccion", "Telefono", "Direccion del empleo"});
        try{
            ResultSet rs = cc.Vertodo("select * from Garantia_solidaria");
            while(rs.next()){

                model.addRow(new Object[]{rs.getInt("Id_cliente"), rs.getString("Nombre_cli"), rs.getString("Apellido_cli"), rs.getString("Cedula_cli"), rs.getString("Sexo_cli"), rs.getString("Ciudad_cli"), rs.getString("Sector_cli"), rs.getString("Calle_cli"), rs.getString("NCasa_cli"), rs.getString("Telefono_cli"), rs.getString("Celular_cli"), rs.getString("Correo_cli")});

            }

        } catch(Exception e){

        } finally{
            cc.close();
        }
    }//GEN-LAST:event_jbtMostrar1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int j = jtgarantia1.getSelectedRow();
        String codigo = "";

        try{
            if(j==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if(j >=0 ){

                    codigo = jtgarantia1.getValueAt(j, 0).toString();
                    this.codigogrso = codigo;
                    this.codigogrhi = "";
                    this.codigogrpre = "";
                    jdGarantiaSoli.hide();

                }
            }

        }catch (Exception ex) {

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        jdGarantiaPren.hide();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jbtBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscar2ActionPerformed
        
        String nombre = jtxtBuscar.getText();

        if(jrbCodigo.isSelected() == false && jrbNombre.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(jrbCodigo.isSelected() == true && jrbNombre.isSelected() == true){
                JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else if(jrbCodigo.isSelected() == true){if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else{
                char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } else{

                    DefaultTableModel model1 = new DefaultTableModel();
                    jtgarantia1.setModel(model1);
                    model1.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Direccion", "Tipo vivienda", "Nombre", "Cedula", "Titulo"});
        
                    try{
                        ResultSet rs2 = cc.Vertodo("select * from Garantia_Hipotecaria where Nombre_solid like'"+nombre+"%'");
                        while(rs2.next()){

                            model1.addRow(new Object[]{rs2.getInt("ID_GaranHipo"), rs2.getString("Direccion_Vivienda"), rs2.getString("Tipo_Vivienda"), rs2.getString("Nombre_Dueno"), rs2.getString("Cedula_Dueno"), rs2.getString("Titulo_Propiedad")});
             
                        }

                    } catch(Exception e){

                    } finally{
                        cc.close();
                    }
                }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho > 0){
                        ResultSet rs2 = cc.Vertodo("select * from Garantia_Hipotecaria where Id_GaranSolid = "+nombre+"");
                        DefaultTableModel model1 = new DefaultTableModel();
                        jtgarantia1.setModel(model1);
                        model1.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Direccion", "Tipo vivienda", "Nombre", "Cedula", "Titulo"});
        
                        while(rs2.next()){

                            model1.addRow(new Object[]{rs2.getInt("ID_GaranHipo"), rs2.getString("Direccion_Vivienda"), rs2.getString("Tipo_Vivienda"), rs2.getString("Nombre_Dueno"), rs2.getString("Cedula_Dueno"), rs2.getString("Titulo_Propiedad")});
             
                        }
                    }

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    cc.close();
                }
            }
        }
        }
        
    }//GEN-LAST:event_jbtBuscar2ActionPerformed

    private void jbtMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrar2ActionPerformed
       
        DefaultTableModel model1 = new DefaultTableModel();
        jtgarantia1.setModel(model1);
        model1.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Direccion", "Tipo vivienda", "Nombre", "Cedula", "Titulo"});
        try{
            ResultSet rs2 = cc.Vertodo("select * from Garantia_Hipotecaria");
            while(rs2.next()){

                model1.addRow(new Object[]{rs2.getInt("ID_GaranHipo"), rs2.getString("Direccion_Vivienda"), rs2.getString("Tipo_Vivienda"), rs2.getString("Nombre_Dueno"), rs2.getString("Cedula_Dueno"), rs2.getString("Titulo_Propiedad")});
             
            }

        } catch(Exception e){

        } finally{
            cc.close();
        }
        
    }//GEN-LAST:event_jbtMostrar2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        int j = jtgarantia2.getSelectedRow();
        String codigo = "";

        try{
            if(j==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if(j >=0 ){

                    codigo = jtgarantia2.getValueAt(j, 0).toString();
                    this.codigogrhi = codigo;
                    this.codigogrso = "";
                    this.codigogrpre = "";
                    jdGarantiaPren.hide();

                }
            }

        }catch (Exception ex) {

        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        jdGarantiaHipo.hide();
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbtBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscar3ActionPerformed
       
        String nombre = jtxtBuscar.getText();

        if(jrbCodigo.isSelected() == false && jrbNombre.isSelected() == false){
            JOptionPane.showMessageDialog(null, "No a elegino ningun tipo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if(jrbCodigo.isSelected() == true && jrbNombre.isSelected() == true){
                JOptionPane.showMessageDialog(null, "Solo puede sellecionar una sola opcion", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else if(jrbCodigo.isSelected() == true){if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el nombre a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else{
                char k = nombre.charAt(0);
                if(Character.isDigit(k)){
                    JOptionPane.showMessageDialog(null, "Solo Puede introducir Letras", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
                } else{

                    DefaultTableModel model2 = new DefaultTableModel();
                    jtgarantia1.setModel(model2);
                    model2.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Marca carro", "Modelo Vehiculo", "Año Vehiculo", "Matricula", "Dueño", "Direccion"});
        
                    try{
                        ResultSet rs3 = cc.Vertodo("select * from Garantia_Prendaria where Nombre_solid like'"+nombre+"%'");
                        while(rs3.next()){

                            model2.addRow(new Object[]{rs3.getInt("ID_GaranPren"), rs3.getString("Marca_Vehiculo"), rs3.getString("Modelo_Vehiculo"), rs3.getString("Año_Vehiculo"), rs3.getString("Matricula_Vehiculo"), rs3.getString("Dueno_vehiculo"), rs3.getString("Direccion_Dueno")});
                
                        }

                    } catch(Exception e){

                    } finally{
                        cc.close();
                    }
                }
            }
        }else{
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "No a escrito el codigo a buscar", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try{
                    int ho = Integer.parseInt(nombre);
                    if(ho > 0){
                        ResultSet rs3 = cc.Vertodo("select * from Garantia_Prendaria where Id_GaranSolid = "+nombre+"");
                        DefaultTableModel model2 = new DefaultTableModel();
                        jtgarantia1.setModel(model2);
                        model2.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Marca carro", "Modelo Vehiculo", "Año Vehiculo", "Matricula", "Dueño", "Direccion"});
        
                        while(rs3.next()){

                            model2.addRow(new Object[]{rs3.getInt("ID_GaranPren"), rs3.getString("Marca_Vehiculo"), rs3.getString("Modelo_Vehiculo"), rs3.getString("Año_Vehiculo"), rs3.getString("Matricula_Vehiculo"), rs3.getString("Dueno_vehiculo"), rs3.getString("Direccion_Dueno")});
                
                        }
                    }

                } catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo puede introducir numeros", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);

                } finally{
                    cc.close();
                }
            }
        }
        }
        
    }//GEN-LAST:event_jbtBuscar3ActionPerformed

    private void jbtMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMostrar3ActionPerformed
        
        DefaultTableModel model2 = new DefaultTableModel();
        jtgarantia1.setModel(model2);
        model2.setColumnIdentifiers(new Object[]{"Codigo del Garantia", "Marca carro", "Modelo Vehiculo", "Año Vehiculo", "Matricula", "Dueño", "Direccion"});
        try{
            ResultSet rs3 = cc.Vertodo("select * from Garantia_Prendaria");
            while(rs3.next()){

                model2.addRow(new Object[]{rs3.getInt("ID_GaranPren"), rs3.getString("Marca_Vehiculo"), rs3.getString("Modelo_Vehiculo"), rs3.getString("Año_Vehiculo"), rs3.getString("Matricula_Vehiculo"), rs3.getString("Dueno_vehiculo"), rs3.getString("Direccion_Dueno")});
                
            }

        } catch(Exception e){

        } finally{
            cc.close();
        }
        
    }//GEN-LAST:event_jbtMostrar3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        int j = jtgarantia3.getSelectedRow();
        String codigo = "";

        try{
            if(j==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if(j >=0 ){

                    codigo = jtgarantia3.getValueAt(j, 0).toString();
                    this.codigogrpre = codigo;
                    this.codigogrso = "";
                    this.codigogrhi = "";
                    jdGarantiaHipo.hide();

                }
            }

        }catch (Exception ex) {

        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtBuscar1;
    private javax.swing.JButton jbtBuscar2;
    private javax.swing.JButton jbtBuscar3;
    private javax.swing.JButton jbtMostrar;
    private javax.swing.JButton jbtMostrar1;
    private javax.swing.JButton jbtMostrar2;
    private javax.swing.JButton jbtMostrar3;
    private javax.swing.JButton jbtSelec;
    private javax.swing.JComboBox<String> jcPrestamo;
    private javax.swing.JComboBox<String> jcbGarante;
    private javax.swing.JDialog jdBuscar;
    private javax.swing.JDialog jdGarantiaHipo;
    private javax.swing.JDialog jdGarantiaPren;
    private javax.swing.JDialog jdGarantiaSoli;
    public static javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlCliente1;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JRadioButton jrbCodigo;
    private javax.swing.JRadioButton jrbCodigo1;
    private javax.swing.JRadioButton jrbCodigo2;
    private javax.swing.JRadioButton jrbCodigo3;
    private javax.swing.JRadioButton jrbNombre;
    private javax.swing.JRadioButton jrbNombre1;
    private javax.swing.JRadioButton jrbNombre2;
    private javax.swing.JRadioButton jrbNombre3;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JTable jtgarantia1;
    private javax.swing.JTable jtgarantia2;
    private javax.swing.JTable jtgarantia3;
    public static javax.swing.JTextField jtxtBuscar;
    public static javax.swing.JTextField jtxtBuscar1;
    public static javax.swing.JTextField jtxtBuscar2;
    public static javax.swing.JTextField jtxtBuscar3;
    public static javax.swing.JTextField jtxtMonto;
    public static javax.swing.JTextField jtxtPlazo;
    // End of variables declaration//GEN-END:variables

    Conectar_Oracle cc = new Conectar_Oracle();
    
}