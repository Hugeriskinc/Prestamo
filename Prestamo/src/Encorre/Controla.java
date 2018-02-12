/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encorre;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Ortiz
 */
public class Controla {
    
    
    
    public boolean Enviarcorreo(Correo c){
        
        try{
            Properties p = new Properties();
            p.put("mail.smyp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.stattls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", c.getUsuario());
            p.setProperty("mail.smtp.auth", "true");
            
            Session s = Session.getDefaultInstance(p, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(c.getMensaje());
            BodyPart adjunto = new MimeBodyPart();
            
            if(!c.getRutaar().equals("")){
                adjunto.setDataHandler(new DataHandler(new FileDataSource(c.getRutaar())));
                adjunto.setFileName(c.getNombrear());
            }
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(adjunto);
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(c.getUsuario()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getDestino()));
            mensaje.setSubject(c.getAsunto());
            mensaje.setContent(m);
            
            Transport t = s.getTransport("smtp");
            t.connect(c.getUsuario(), c.getContraseña());
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            
            return true;
            
            
        } catch(Exception e){
            
           return false; 
        }
        
    }
    
}
