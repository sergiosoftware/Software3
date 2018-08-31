/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Entidades;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class Respuesta
{
    private int idRespuesta;
    private String descripcionRespuesta;
    private char correcta;

    public Respuesta()
    {
    }
    
    /**
     * constructor de las Respuestas
     * @param idRespuesta identificador unico para la respuesta que se realizará
     * @param descripcionRespuesta cuerpo de la respuesta
     * @param correcta caracter 'S' o 'N' que denota si la respuesta realizada es 
     * la que correctamente responde a una pregunta realizada
     */
    public Respuesta(int idRespuesta, String descripcionRespuesta, char correcta)
    {
        this.idRespuesta = idRespuesta;
        this.descripcionRespuesta = descripcionRespuesta;
        this.correcta = correcta;
    }
    
    

    /**
     * @return the idRespuesta
     */
    public int getIdRespuesta()
    {
        return idRespuesta;
    }

    /**
     * @param idRespuesta the idRespuesta to set
     */
    public void setIdRespuesta(int idRespuesta)
    {
        this.idRespuesta = idRespuesta;
    }

    /**
     * @return the descripcionRespuesta
     */
    public String getDescripcionRespuesta()
    {
        return descripcionRespuesta;
    }

    /**
     * @param descripcionRespuesta the descripcionRespuesta to set
     */
    public void setDescripcionRespuesta(String descripcionRespuesta)
    {
        this.descripcionRespuesta = descripcionRespuesta;
    }

    /**
     * @return the correcta
     */
    public char getCorrecta()
    {
        return correcta;
    }

    /**
     * @param correcta the correcta to set
     */
    public void setCorrecta(char correcta)
    {
        this.correcta = correcta;
    }
    
}
