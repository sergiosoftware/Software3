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
public class Pregunta
{
    private int idPregunta;
    private String enunciado;
    private String rutaImagen;

    public Pregunta()
    {
    }

    /**
     * constructor de Preguntas
     * @param idPregunta identificador único de la pregunta a realizar
     * @param enunciado cuerpo de la pregunta
     * @param rutaImagen cadena que permite subir una imagen como pregunta
     */
    public Pregunta(int idPregunta, String enunciado, String rutaImagen)
    {
        this.idPregunta = idPregunta;
        this.enunciado = enunciado;
        this.rutaImagen = rutaImagen;
    }

    /**
     * @return the idPregunta
     */
    public int getIdPregunta()
    {
        return idPregunta;
    }

    /**
     * @param idPregunta the idPregunta to set
     */
    public void setIdPregunta(int idPregunta)
    {
        this.idPregunta = idPregunta;
    }

    /**
     * @return the enunciado
     */
    public String getEnunciado()
    {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado)
    {
        this.enunciado = enunciado;
    }

    /**
     * @return the rutaImagen
     */
    public String getRutaImagen()
    {
        return rutaImagen;
    }

    /**
     * @param rutaImagen the rutaImagen to set
     */
    public void setRutaImagen(String rutaImagen)
    {
        this.rutaImagen = rutaImagen;
    }
    
    
}
