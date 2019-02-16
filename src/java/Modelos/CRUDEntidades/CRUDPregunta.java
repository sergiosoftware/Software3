/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Asignatura;
import Modelos.Entidades.Pregunta;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author sergioandres
 */
public class CRUDPregunta {
    private JdbcTemplate jdbcTemplate;
    private String sql;

    public CRUDPregunta() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate (con.conectar());     
    }
    
    /**
     * funcion para crear una pregunta en la base de datos
     * @param p Pregunta que se desea registrar
     * @param a Asignatura a la que se va a registrar una nueva pregunta
     * @return retorna un valor entero, si es 0 es que hubo algun error
     *                                  si es 1 es que fue correcto
     */
    
    public int registrarPregunta(Pregunta p, Asignatura a){
        return jdbcTemplate.update("INSERT INTO pregunta (idPregunta,enunciado,rutaImagen,codigoAsignatura)"
        + "VALUES (?,?,?,?)",p.getIdPregunta(),p.getEnunciado(),p.getRutaImagen(),a.getCodigo());
    }
    
    /**
     * funcion para eliminar una pregunta de la base de datos dado su id
     * @param idPregunta identificador de la pregunta que se desea eliminar
     * @return retorna un valor entero, si es 0 es que hubo algun error
     *                                  si es 1 es que fue correcto
     */
    public int eliminarPregunta(int idPregunta){
        return jdbcTemplate.update("DELETE from pregunta "
                + "WHERE "
                + "idPregunta=?;",idPregunta);
    }
    
    /**
     * funcion para editar uina pregunta dado su identificador
     * @param p Onjeto con los nuevos datos de la pregunta
     * @param a Asignatura que se le esta modificando una pregunta
     * @param idPregunta Identificado de la pregunta que se desea editar
     * @return retorna un valor entero, si es 0 es que hubo algun error
     *                                  si es 1 es que fue correcto
     */
    public int editarPregunta(Pregunta p, Asignatura a, int idPregunta){
        return jdbcTemplate.update("UPDATE pregunta"
                + "enunciado=?,"
                + "rutaImagen=?"
                + "codigoAsignatura=?,"
                + "WHERE idPregunta=?", p.getEnunciado(),p.getRutaImagen(),a.getCodigo(),idPregunta);
    }
    
    /**
     * funcion para consultar en la base de datos una pregunta
     * @param idPregunta idetificador de la pregunta que se desea consultar
     * @return una pregunta con todos sus valores
     */
    public Pregunta seleccionarPregunta(int idPregunta) {
        final Pregunta pre = new Pregunta();
        String quer = "SELECT * FROM pregunta WHERE idPregunta=?" + idPregunta;
        return (Pregunta) jdbcTemplate.query(quer, (ResultSet rs) -> {
            if (rs.next()) {
                pre.setEnunciado(rs.getString("enunciado"));
                pre.setRutaImagen((rs.getString("rutaImagen")));
            }
            return pre;
        });
    }
    
    /**
     * funcion para buscar todas las preguntas que hay en la base de datos
     * @return lista total de preguntas
     */
    public List consultarTodas(){
        this.sql = "select * from preguntas order by idpregunta desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }
    
    /**
     * funcion para buscar 10 preguntas de manera aleatoria en la base de datos
     * @return preguntas aleatorias
     */
    public List consultarAleatorio(){
        this.sql = "SELECT * FROM preguntas ORDER BY RAND() LIMIT 10";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }
    
    
}
