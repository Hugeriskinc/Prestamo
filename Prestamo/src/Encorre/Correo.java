/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encorre;

/**
 *
 * @author Oscar Ortiz
 */
public class Correo {

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the rutaar
     */
    public String getRutaar() {
        return rutaar;
    }

    /**
     * @param rutaar the rutaar to set
     */
    public void setRutaar(String rutaar) {
        this.rutaar = rutaar;
    }

    /**
     * @return the nombrear
     */
    public String getNombrear() {
        return nombrear;
    }

    /**
     * @param nombrear the nombrear to set
     */
    public void setNombrear(String nombrear) {
        this.nombrear = nombrear;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    private String usuario;
    private String contraseña;
    private String rutaar;
    private String nombrear;
    private String destino;
    private String asunto;
    private String mensaje;
    
}
