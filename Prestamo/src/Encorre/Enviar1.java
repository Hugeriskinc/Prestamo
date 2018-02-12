/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encorre;

import Base_datos.Conectar;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Ortiz
 */
public class Enviar1 {
    
    Correo c = new Correo();
    String destino;
    String asunto;
    String mensaje;
    String j = "Declinado";
    String destino1;
    
    public void Enviar(){
        
        ResultSet rs = bd.Vertodo("select * from Clientes");
        
        try{
            
            while(rs.next()){
                
                destino1 = rs.getString("Correo_elec");
                
            }
            
        } catch(Exception e){
            
        } finally{
            bd.cerrar();
        }
        
        c.setContraseña("vwclzippwkbmspam");
        c.setUsuario("ortizoscar320@gmail.com");
        c.setAsunto("Informacion sobre su prestamo!");
        c.setMensaje("Se le informa por este medio que su prestamo esta "+ j);
        c.setDestino(destino1);
        c.setNombrear("");
        c.setRutaar("");
        
        
        Controla cp = new Controla();
        if(cp.Enviarcorreo(c)){
            JOptionPane.showMessageDialog(null, "Mensajo envieado", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Mensajo no envieado", "Sistema de prestamo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    Conectar bd = new Conectar();
    
}
