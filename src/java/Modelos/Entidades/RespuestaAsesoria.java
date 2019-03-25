/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Entidades;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author JulianCamilo
 */
public class RespuestaAsesoria {
    private int idRespuesta;
    private int idAsesoria;
    private int codigoMonitor;
    private Date fechaRespuesta;
    private Time hora;

    public RespuestaAsesoria() {
    }

    public RespuestaAsesoria(int idAsesoria, int codigoMonitor, Date fechaRespuesta, Time hora) {
        this.idAsesoria = idAsesoria;
        this.codigoMonitor = codigoMonitor;
        this.fechaRespuesta = fechaRespuesta;
        this.hora = hora;
    }

    /**
     * @return the idRespuesta
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * @param idRespuesta the idRespuesta to set
     */
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    /**
     * @return the idAsesoria
     */
    public int getIdAsesoria() {
        return idAsesoria;
    }

    /**
     * @param idAsesoria the idAsesoria to set
     */
    public void setIdAsesoria(int idAsesoria) {
        this.idAsesoria = idAsesoria;
    }

    /**
     * @return the codigoMonitor
     */
    public int getCodigoMonitor() {
        return codigoMonitor;
    }

    /**
     * @param codigoMonitor the codigoMonitor to set
     */
    public void setCodigoMonitor(int codigoMonitor) {
        this.codigoMonitor = codigoMonitor;
    }

    /**
     * @return the fechaRespuesta
     */
    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }

    /**
     * @param fechaRespuesta the fechaRespuesta to set
     */
    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    /**
     * @return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    
}
