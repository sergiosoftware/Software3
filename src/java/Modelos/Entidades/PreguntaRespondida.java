/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Entidades;

import java.beans.PropertyChangeSupport;

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

    /**
     * @return the monitorRespondio
     */
    public Estudiante getMonitorRespondio() {
        return monitorRespondio;
    }

    /**
     * @param monitorRespondio the monitorRespondio to set
     */
    public void setMonitorRespondio(Estudiante monitorRespondio) {
        Modelos.Entidades.Estudiante oldMonitorRespondio = this.monitorRespondio;
        this.monitorRespondio = monitorRespondio;
        propertyChangeSupport.firePropertyChange(PROP_MONITORRESPONDIO, oldMonitorRespondio, monitorRespondio);
    }

    /**
     * @return the idInquietud
     */
    public int getIdInquietud() {
        return idInquietud;
    }

    /**
     * @param idInquietud the idInquietud to set
     */
    public void setIdInquietud(int idInquietud) {
        int oldIdInquietud = this.idInquietud;
        this.idInquietud = idInquietud;
        propertyChangeSupport.firePropertyChange(PROP_IDINQUIETUD, oldIdInquietud, idInquietud);
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_MONITORRESPONDIO = "monitorRespondio";
    public static final String PROP_IDINQUIETUD = "idInquietud";

    
    
    
    
}
