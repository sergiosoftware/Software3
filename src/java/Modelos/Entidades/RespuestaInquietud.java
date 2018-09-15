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
public class RespuestaInquietud {

    private int idInquetud,codigoEstudiante,idRespuesta;
    private Date fechaRespuesta;
    private Time horaRespuesta;
    
    public RespuestaInquietud() {
    }

    public RespuestaInquietud(int idInquetud, int codigoEstudiante, Date fecha, Time hora) {
        this.idInquetud = idInquetud;
        this.codigoEstudiante = codigoEstudiante;
        this.fechaRespuesta = fecha;
        this.horaRespuesta=hora;
    }

    /**
     * @return the idInquetud
     */
    public int getIdInquetud() {
        return idInquetud;
    }

    /**
     * @param idInquetud the idInquetud to set
     */
    public void setIdInquetud(int idInquetud) {
        this.idInquetud = idInquetud;
    }

    /**
     * @return the codigoEstudiante
     */
    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * @param codigoEstudiante the codigoEstudiante to set
     */
    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
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
     * @return the horaRespuesta
     */
    public Time getHoraRespuesta() {
        return horaRespuesta;
    }

    /**
     * @param horaRespuesta the horaRespuesta to set
     */
    public void setHoraRespuesta(Time horaRespuesta) {
        this.horaRespuesta = horaRespuesta;
    }
    
    
    
}
