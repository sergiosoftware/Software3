/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Entidades;

import java.util.Date;

/**
 *
 * @author JulianCamilo
 */
public class Asesoria {
    private int idasesoria;
    private int codigoEstudiante;
    private String codigoAsignatura;
    private String tema;
    private Date fechaPublicacion;

    public Asesoria() {
    }

    public Asesoria( int codigoEstudiante, String codigoAsignatura, String tema) {
        this.codigoEstudiante = codigoEstudiante;
        this.codigoAsignatura = codigoAsignatura;
        this.tema = tema;
        
    }

    /**
     * @return the idasesoria
     */
    public int getIdasesoria() {
        return idasesoria;
    }

    /**
     * @param idasesoria the idasesoria to set
     */
    public void setIdasesoria(int idasesoria) {
        this.idasesoria = idasesoria;
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
     * @return the codigoAsignatura
     */
    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    /**
     * @param codigoAsignatura the codigoAsignatura to set
     */
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the fechaPublicacion
     */
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion to set
     */
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
}
