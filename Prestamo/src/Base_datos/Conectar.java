/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Ortiz
 */
public class Conectar {

    static String url = "jdbc:mysql://localhost/Prestamo";

    static String user = "Oscar";
    static String pass = "Oscar3031";

    Connection con = null;

    public Connection Conectar() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente", "Connecion a la base de datos", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error al conectarse", "Connecion a la base de datos", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        }

        return con;

    }

    public void Insert(String sql) {

        Connection cn = Conectar();
        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se agrego el registro", "Registro de sistema", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + " No se agrego el registro", "Registro de sistema", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ResultSet Vertodo(String sql) {

        Connection cn = Conectar();
        Statement st;
        ResultSet rs = null;
        try {

            st = cn.createStatement();
            rs = st.executeQuery(sql);

        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
        }

        return rs;

    }

    public ResultSet seleccionar(String Sql) {

        Connection cn;
        PreparedStatement pst;
        ResultSet rs = null;

        try {

            cn = Conectar();
            pst = cn.prepareStatement(Sql);
            rs = pst.executeQuery();

        } catch (Exception e) {

        }

        return rs;

    }

    public void cerrar() {

        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
