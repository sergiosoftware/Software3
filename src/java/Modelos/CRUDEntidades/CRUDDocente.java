/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Docente;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author sergioandres
 */
public class CRUDDocente {
    private JdbcTemplate jdbcTemplate;
    private String sql;

    public CRUDDocente() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate (con.conectar());     
    }
    
    /**
     * funcion para registrar un nuevo docente en la base de datos
     * @param d Modelo de docente que se desea registrar
     * @return 
     */
    public int registrarDocente(Docente d){
        return jdbcTemplate.update("INSERT INTO docente (identificacion,nombre,apellido,correoElectronico)"
        + "VALUES (?,?,?,?)",d.getIdentificacion(),d.getNombre(),d.getApellido(),d.getCorreoElectronico());
    }
    
    /**
     * funcion para eliminar un docente de la base de datos del sistema
     * @param identificacion  identificador del docente que se desea eliminar
     * @return 
     */
    public int eliminarDocente(int identificacion){
        return jdbcTemplate.update("DELETE from docente "
                + "WHERE "
                + "identificacion=?;",identificacion);
    }
    
    /**
     * funcion para editar un docente dada su identificacion
     * @param d Objeto con los nuevos datos del docente
     * @param identificacion  Identificador del docente que se desea editar
     * @return 
     */
    public int editarDocente(Docente d, String identificacion){
        return jdbcTemplate.update("UPDATE docente"
                + "nombre=?,"
                + "apellido=?"
                + "correoElectronico=?,"
                + "WHERE identificacion=?",d.getNombre(),d.getApellido(),d.getCorreoElectronico(),identificacion);
    }
    
    /**
     * funcion para consultar en la base de datos una pregunta
     * @param identificacion idetificador de la persona que se desea consultar
     * @return una pregunta con todos sus valores
     */
    public Docente seleccionarDocente(int identificacion) {
        final Docente doc = new Docente();
        String quer = "SELECT * FROM docente WHERE identificacion=?" + identificacion;
        return (Docente) jdbcTemplate.query(quer, (ResultSet rs) -> {
            if (rs.next()) {
                doc.setNombre(rs.getString("nombre"));
                doc.setApellido(rs.getString("apellido"));
                doc.setCorreoElectronico(rs.getString("correoElectronico"));
            }
            return doc;
        });
    }
    
    /**
     * funcion para buscar todas los docente que hay en la base de datos
     * @return lista total de docente
     */
    public List consultarTodos(){
        this.sql = "select * from docentes order by identificacion desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }
}
