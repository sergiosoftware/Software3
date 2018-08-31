/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Entidades;

/**
 *
 * @author JulianCamilo
 */
public class PreguntaRespondida {
    
    private Estudiante monitorRespondio;
    private int idInquietud;

    public PreguntaRespondida() {
    }

    public PreguntaRespondida(Estudiante monitorRespondio, int idInquietud) {
        this.monitorRespondio = monitorRespondio;
        this.idInquietud = idInquietud;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdInquietud() {
        return idInquietud;
    }

    public Estudiante getMonitorRespondio() {
        return monitorRespondio;
    }

    public void setIdInquietud(int idInquietud) {
        this.idInquietud = idInquietud;
    }

    public void setMonitorRespondio(Estudiante monitorRespondio) {
        this.monitorRespondio = monitorRespondio;
    }
    
    
    
}
