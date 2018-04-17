package Login;

import Menu.Menu_ADM;
import Menu.Menu_USU;
import Base_datos.Conectar_Oracle;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import oracle.jdbc.OracleStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar Ortiz
 */
public class Login extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form Login
     */
    
    //Variables declaradas para poder hacer que la barra de carga funcione
    int cont;
    public final static int TWO_SECOND=5;
    
    //Variables usadas para que aparesca la hora
    String hora,minutos,segundos;
    Thread hilo;
    
    //Variables para el login
    String usu, con, usua;
    
    //Variable del Timer
    private Timer timer;
    
    public Login() {
        initComponents();
        
        //Esconde el label que dice del usuario o contraseña incorrecta
        jtxtInco.setVisible(false);
        
        //Donte presenta la fecha
        this.jLabel4.setText(fecha());
        
        //Es en donde se empiesa a correr la hora
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
        
        
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));


        return retValue;
    }
    
    //Metodo para la hora
    public void hora(){
        
        Calendar cal = new GregorianCalendar();
        Date hora = new Date();
        cal.setTime(hora);
        this.hora=cal.get(Calendar.HOUR_OF_DAY)>9?""+cal.get(Calendar.HOUR_OF_DAY):"0"+cal.get(Calendar.HOUR_OF_DAY);
        this.minutos=cal.get(Calendar.MINUTE)>9?""+cal.get(Calendar.MINUTE):"0"+cal.get(Calendar.MINUTE);
        this.segundos=cal.get(Calendar.SECOND)>9?""+cal.get(Calendar.SECOND):"0"+cal.get(Calendar.SECOND);
        
    }
    
    //Metodo para que corra la hora
    public void run(){
        
        Thread current = Thread.currentThread();
        //While
        /*while(current==hilo){
            hora();
            jLabel7.setText(hora+":"+minutos+":"+segundos);
        }*/
        
        //For
        for(int i=1;i>0;i++){
            if(i>0){
                hora();
                jLabel2.setText(hora+":"+minutos+":"+segundos);
            }
        }
        
    }
    
    //Metodo par ala fecha
    public static String fecha(){
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        
        return formato.format(fecha);
        
    }
  
    //Metodo para que la barra de carga funcione y se llene la barra/ Accede por el lado de administrador
    class timerListener1 implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent a){
            
            cont++;
            jpCarga.setValue(cont);
            if(cont==100){
                timer.stop();
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                jifCarga.dispose();
                Menu_ADM mp = new Menu_ADM();
                mp.jlUsu.setText(usua);
                mp.show();
            }
            
        }
        
    } 
    
    //Metodo para que la barra de carga funcione y se llene la barra/ Accede por el lado de usuario
    class timerListener2 implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent a){
            
            cont++;
            jpCarga.setValue(cont);
            if(cont==100){
                timer.stop();
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Sistema de registro", JOptionPane.INFORMATION_MESSAGE);
                jifCarga.dispose();
                Menu_USU mp = new Menu_USU();
                mp.jlUsu.setText(usua);
                mp.show();
            }
            
        }
        
    }
    
    //Metodo para desactivar el Timer de la barra de carga
    public void esconder(){
        this.setVisible(false);
    }

    //Metodo para activar el Timer de la barra de carga
    public void activar(){
        timer.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jifCarga = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jpCarga = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtxtUsu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtInco = new javax.swing.JLabel();
        jpCon = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jifCarga.setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jpCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 62, 347, 91));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setText("Cargando....");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 184, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        javax.swing.GroupLayout jifCargaLayout = new javax.swing.GroupLayout(jifCarga.getContentPane());
        jifCarga.getContentPane().setLayout(jifCargaLayout);
        jifCargaLayout.setHorizontalGroup(
            jifCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jifCargaLayout.setVerticalGroup(
            jifCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jtxtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, 35));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Candado.png"))); // NOI18N
        jButton1.setText("Acceder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 120, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 100, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Hora:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("00:00:00");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel3.setText("Fecha:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel4.setText("00/00/0000");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 460, 30));

        jtxtInco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtInco.setText("Usuario O Contraseña incorrectos");
        jPanel1.add(jtxtInco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jpCon.setToolTipText("");
        jpCon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpConKeyPressed(evt);
            }
        });
        jPanel1.add(jpCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 190, 35));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título-1.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 360));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textura.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para salir del sistema
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Metodo que consulta en la base de datos para acceder al sistema
    void acceder(String usu, String con){
      
        String cap = "";
        String sql = "select * from Empleado where Usuario_emp='"+usu+"' and Contrasena_emp='"+con+"'";
        try {
            
            Statement st = cn.createStatement();
            ResultSet rs =  st.executeQuery(sql);
            if(rs.next()){
                
                cap = rs.getString("Categoria_emp");
                usua = rs.getString("Usuario_emp");
            }
            if(cap.equals("adm") || cap.equals("ADM")){
               
                cont=-1;
                jpCarga.setValue(0);
                jpCarga.setStringPainted(true);
                timer = new Timer(TWO_SECOND, new timerListener1());
                jifCarga.show();
                this.dispose();
                cn.close();
                activar();
                
            } else {
                if(cap.equals("usu") || cap.equals("USU")){
                
                    cont=-1;
                    jpCarga.setValue(0);
                    jpCarga.setStringPainted(true);
                    timer = new Timer(TWO_SECOND, new timerListener2());
                    jifCarga.show();
                    this.dispose();
                    cn.close();
                    activar();
               
                    
                } else {
                    if((!cap.equals("adm")) && (!cap.equals("usu"))){
                        jtxtInco.setVisible(true);
                    }
                }
            }
            cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error1: " + ex);
        }
        
    }
    
    //Boton para iniciar el sistema
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        this.usu = jtxtUsu.getText();
        this.con = String.valueOf(jpCon.getPassword());
        
        try{
        cn = cc.connect();
        acceder(usu, con);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos" + e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //Boton para cuando le den enter acceda al programa
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
        String usu = jtxtUsu.getText();
        String con = String.valueOf(jpCon.getPassword());
        
        try{
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cn = cc.connect();
            acceder(usu, con);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos" + e);
        }
        
    }//GEN-LAST:event_jButton1KeyPressed

    //Funcion para cuando le dan enter en el texfield de la contraseña entre al sistema
    private void jpConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpConKeyPressed
        String usu = jtxtUsu.getText();
        String con = String.valueOf(jpCon.getPassword());
        
        try{
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cn = cc.connect();
            acceder(usu, con);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos" + e);
        }
    }//GEN-LAST:event_jpConKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JDialog jifCarga;
    private javax.swing.JProgressBar jpCarga;
    private javax.swing.JPasswordField jpCon;
    private javax.swing.JLabel jtxtInco;
    private javax.swing.JTextField jtxtUsu;
    // End of variables declaration//GEN-END:variables

    Conectar_Oracle cc = new Conectar_Oracle();
    Connection cn;
    
}
