/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Pregunta;
import Modelos.Entidades.Respuesta;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author sergioandres
 */
public class CRUDRespuesta {
    private JdbcTemplate jdbcTemplate;

    public CRUDRespuesta() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate (con.conectar());     
    }
    
    /**
     * funcoin para registrar una respuesta a una pregunta
     * @param r respuesta definida
     * @param p pregunta para asociar la respuesta
     * @return 
     */
    
    public int registrarRespuesta(Respuesta r, Pregunta p){
        return jdbcTemplate.update("INSERT INTO respuesta (idRespuesta,descripcionRespuesta,correcta,idPregunta)"
        + "VALUES (?,?,?,?)",r.getIdRespuesta(),r.getDescripcionRespuesta(),r.getCorrecta(),p.getIdPregunta());
    }
    
    /**
     * funcion para eliminar una respuesta de la base de datos dado su id
     * @param idRespuesta identificador de la respuesta que se desea eliminar
     * @return 
     */
    public int eliminarRespuesta(int idRespuesta){
        return jdbcTemplate.update("DELETE from respuesta "
                + "WHERE "
                + "idRespuesta=?;",idRespuesta);
    }
    
    /**
     * funcion para editar una respuesta dada su identificacion
     * @param r Objeto con los nuevos datos de la respuesta
     * @param p pregunta que se le esta modificando una respuesta
     * @param idRespuesta  Identificador de la respuesta que se desea aditar
     * @return 
     */
    public int editarPregunta(Respuesta r, Pregunta p, int idRespuesta){
        return jdbcTemplate.update("UPDATE respuesta"
                + "descripcionRespuesta=?,"
                + "correcta=?", r.getDescripcionRespuesta(),r.getCorrecta(),idRespuesta);
    }
    
    /**
     * funcion para consultar en la base de datos una pregunta
     * @param idRespuesta  idetificador de la respuesta que se desea consultar
     * @return una respuesta con todos sus valores
     */
    public Respuesta seleccionarRespuesta(int idRespuesta) {
        final Respuesta res = new Respuesta();
        String quer = "SELECT * FROM respuesta WHERE idRespuesta=?" + idRespuesta;
        return (Respuesta) jdbcTemplate.query(quer, new ResultSetExtractor<Respuesta>() {
            @Override
            public Respuesta extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    res.setDescripcionRespuesta(rs.getString(2));
                    char c = rs.getString(3).charAt(0);
                    res.setCorrecta(c);
                }
                return res;
            }
        });
    }
    
    
    
    
}

