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
public class Docente
{
    private String identificacion;
    private String nombre;
    private String apellido;
    private String correoElectronico;

    public Docente()
    {
    }

    /**
     * 
     * @param identificacion
     * @param nombre
     * @param apellido
     * @param correoElectronico 
     */
    public Docente(String identificacion, String nombre, String apellido, String correoElectronico)
    {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion()
    {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion)
    {
        this.identificacion = identificacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido()
    {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico()
    {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico)
    {
        this.correoElectronico = correoElectronico;
    }
    
    
}
