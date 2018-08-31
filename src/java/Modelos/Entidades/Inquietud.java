/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class Inquietud
{
    private int idInquietud;
    private int codigoEstudiante;
    private String codigoidAsignatura;
    private String tema;
    private String Descripcion;
    private Date fechaPublicacion;

    public Inquietud()
    {
    }

    /**
     * 
     * @param idInquietud
     * @param codigoEstudiante
     * @param codigoidAsignatura
     * @param tema
     * @param Descripcion
     * @param fechaPublicacion 
     */
    public Inquietud(int codigoEstudiante, String codigoidAsignatura, String tema, String Descripcion)
    {
        this.codigoEstudiante = codigoEstudiante;
        this.codigoidAsignatura = codigoidAsignatura;
        this.tema = tema;
        this.Descripcion = Descripcion;
        //this.fechaPublicacion =fechaPublicacion;
    }

    /**
     * @return the idInquietud
     */
    public int getIdInquietud()
    {
        return idInquietud;
    }

    /**
     * @param idInquietud the idInquietud to set
     */
    public void setIdInquietud(int idInquietud)
    {
        this.idInquietud = idInquietud;
    }

    /**
     * @return the codigoEstudiante
     */
    public int getCodigoEstudiante()
    {
        return codigoEstudiante;
    }

    /**
     * @param codigoEstudiante the codigoEstudiante to set
     */
    public void setCodigoEstudiante(int codigoEstudiante)
    {
        this.codigoEstudiante = codigoEstudiante;
    }

    /**
     * @return the codigoidAsignatura
     */
    public String getCodigoidAsignatura()
    {
        return codigoidAsignatura;
    }

    /**
     * @param codigoidAsignatura the codigoidAsignatura to set
     */
    public void setCodigoidAsignatura(String codigoidAsignatura)
    {
        this.codigoidAsignatura = codigoidAsignatura;
    }

    /**
     * @return the tema
     */
    public String getTema()
    {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema)
    {
        this.tema = tema;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion()
    {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion)
    {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the fechaPublicacion
     */
    public Date getFechaPublicacion()
    {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion to set
     */
    public void setFechaPublicacion(String fechaPublicacion)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        try {
            this.fechaPublicacion = formatter.parse(fechaPublicacion);
        } catch (ParseException ex) {
            Logger.getLogger(Inquietud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
