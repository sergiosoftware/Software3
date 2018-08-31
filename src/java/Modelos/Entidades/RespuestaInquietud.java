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
public class RespuestaInquietud {

    private int idInquetud,codigoEstudiante,idRespuesta;
    private String respuesta;
    private boolean estado;
    
    public RespuestaInquietud() {
    }

    public RespuestaInquietud(int idInquetud, int codigoEstudiante, int idRespuesta, String respuesta) {
        this.idInquetud = idInquetud;
        this.codigoEstudiante = codigoEstudiante;
        this.idRespuesta = idRespuesta;
        this.respuesta = respuesta;
        this.estado=false;
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
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
