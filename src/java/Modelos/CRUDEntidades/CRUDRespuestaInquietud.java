/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Asignatura;
import Modelos.Entidades.RespuestaInquietud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author JulianCamilo
 */
public class CRUDRespuestaInquietud {

    private JdbcTemplate jdbcTemplate;
    private String sql;
    
    public CRUDRespuestaInquietud() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        this.sql= "";
    }

    /**
     * Método para guardar una respuesta para una inquietud, esta respuesta indicara una fecha de asesoria
     * @param idInquietud identificador de la inquietud
     * @param codigoEstudiante codigo del estudiante que registra la respuesta de la inquietud
     * @param fechaRespueta fecha en la cual el monitor ofrecera la asesoria al estudiante
     * @param horaRespuesta hora en la cual el monitor ofrecera la asesoria al estudiante 
     * @param preRepuesta respuesta previa del monitor al estudiante
     * @return 
     */
    public int guardarConFecha(int idInquietud, int codigoEstudiante, Date fechaRespueta, Time horaRespuesta, String preRepuesta) {
        RespuestaInquietud nuevaRespuesta = new RespuestaInquietud(idInquietud,codigoEstudiante,fechaRespueta,horaRespuesta,preRepuesta);
        int resultUpdate=jdbcTemplate.update("INSERT INTO respuestainquietud(idInquietud, codigoMonitor, fechaRespuesta,hora,preRespuesta) "
                + "VALUES (?,?,?,?,?)", nuevaRespuesta.getIdInquetud(), nuevaRespuesta.getCodigoEstudiante(), nuevaRespuesta.getFechaRespuesta(), nuevaRespuesta.getHoraRespuesta(),nuevaRespuesta.getPreRespuesta());
        return resultUpdate;
    }
    
    /**
     * Método para guardar una respuesta para una inquietud, esta respuesta indicara una respuesta previa
     * @param idInquietud identificador la inquietud 
     * @param codigoEstudiante codigo del estudiante que va a registrar la respuesta a la inquietud
     * @param preRepuesta respuesta previa del monitor a la inquietud planteada
     * @return 
     */
    public int guardarSinFecha(int idInquietud, int codigoEstudiante, String preRepuesta) {
        RespuestaInquietud nuevaRespuesta = new RespuestaInquietud(idInquietud,codigoEstudiante,preRepuesta);
        int resultUpdate=jdbcTemplate.update("INSERT INTO respuestainquietud(idInquietud, codigoMonitor,preRespuesta) "
                + "VALUES (?,?,?)", nuevaRespuesta.getIdInquetud(), nuevaRespuesta.getCodigoEstudiante(),nuevaRespuesta.getPreRespuesta());
        return resultUpdate;
    }

    /**
     * Método para consultar todas las respuestas dadas a inquietudes por parte de un estudiante 
     * @param codigoEstudiante codigo del estudiante que a registrado las respuestas  por lo menos una inquietud
     * @return lista con las respuestas dadas a inquietudes por parte de un estudiante 
     */
    public List consultarRespuestas(int codigoEstudiante) {
        this.sql = "select * from inquietud c left join respuestainquietud d on c.idinquietud=d.idinquietud left join estudiante e on d.codigoMonitor=e.codigo where c.codigoEstudiante="+codigoEstudiante+";";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }

    /**
     * Método para consultar una respuesta dada a una inquietud por parte de un estudiante 
     * @param idInquietud identificador de la inquietud 
     * @param codigoMonitor codigo del estudiante que registro la respuesta a la inquietud
     * @return respuesta dada a una inquietud por un estudiante
     */
    public RespuestaInquietud consultarUna(int idInquietud, int codigoMonitor) {
        this.sql="select * from respuestainquietud where idinquietud=" + idInquietud+" and codigoMonitor="+codigoMonitor+";";
        return (RespuestaInquietud) this.jdbcTemplate.query(sql, new ResultSetExtractor<RespuestaInquietud>() {
            @Override
            public RespuestaInquietud extractData(ResultSet rs) throws SQLException, DataAccessException {
                    if(rs.next()){
                        RespuestaInquietud aux = new RespuestaInquietud();
                        aux.setIdRespuesta(rs.getInt(1));
                        aux.setIdInquetud(rs.getInt(2));
                        aux.setCodigoEstudiante(rs.getInt(3));
                        aux.setFechaRespuesta(rs.getDate(4));
                        aux.setHoraRespuesta(rs.getTime(5));
                        return aux;
                    }
                    return null;
                }
        });
    }


    
}
