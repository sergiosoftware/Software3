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
public class Estudiante {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String cedula;
    private String programa;
    private String correo;
    private int calificacion;
    private boolean monitor;

    public Estudiante() {
    }

    /**
     * Constructor para la creacion de un nuevo estudiante
     * @param codigo del estudiante
     * @param nombre del estudiante
     * @param apellido del estudiante
     * @param cedula del estudiante
     * @param correo del estudiante
     * @param calificacion
     * @param monitor 
     */
    public Estudiante(int codigo, String nombre, String apellido, String cedula, String correo, int calificacion, boolean monitor) {    
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.calificacion = calificacion;
        this.monitor = monitor;
    }

    public Estudiante(int codigo, String nombre, String apellido, String cedula, String programa, String correo, int calificacion, boolean monitor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.programa = programa;
        this.correo = correo;
        this.calificacion = calificacion;
        this.monitor = monitor;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the monitor
     */
    public boolean isMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(boolean monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the programa
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }

  
    
    
    
}
