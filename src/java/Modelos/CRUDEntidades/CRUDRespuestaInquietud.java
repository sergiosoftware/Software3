/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Asignatura;
import Modelos.Entidades.RespuestaInquietud;
import java.sql.Time;
import java.util.Date;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author JulianCamilo
 */
public class CRUDRespuestaInquietud {

    private JdbcTemplate jdbcTemplate;
    
    public CRUDRespuestaInquietud() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }

    public int guardar(int idInquietud, int codigoEstudiante, Date fechaRespueta, Time horaRespuesta) {
        RespuestaInquietud nuevaRespuesta = new RespuestaInquietud(idInquietud,codigoEstudiante,fechaRespueta,horaRespuesta);
        int resultUpdate=jdbcTemplate.update("INSERT INTO respuestainquietud(idInquietud, codigoMonitor, fechaRespuesta,hora) "
                + "VALUES (?,?,?,?)", nuevaRespuesta.getIdInquetud(), nuevaRespuesta.getCodigoEstudiante(), nuevaRespuesta.getFechaRespuesta(), nuevaRespuesta.getHoraRespuesta());
        return resultUpdate;
    }


    
}
