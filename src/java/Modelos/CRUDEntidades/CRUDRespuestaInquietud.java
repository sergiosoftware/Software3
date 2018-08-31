/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Asignatura;
import Modelos.Entidades.RespuestaInquietud;
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

    public boolean guardar(int idInquietud, int codigoEstudiante, int idRespuesta, String respuesta) {
        boolean guardado=false;
        RespuestaInquietud nuevaRespuesta = new RespuestaInquietud(idInquietud,codigoEstudiante,idRespuesta,respuesta);
        int resultUpdate=jdbcTemplate.update("INSERT INTO respuestaAsignatura(idinquietud, codigoEstudiante, idRespuesta,respuesta,estado) "
                + "VALUES (?,?,?)", nuevaRespuesta.getIdInquetud(), nuevaRespuesta.getCodigoEstudiante(), nuevaRespuesta.getIdInquetud(), nuevaRespuesta.getRespuesta(),nuevaRespuesta.isEstado());
        if (resultUpdate==1) {
            guardado=true;
        }
        return guardado;
    }

    public boolean actualizar(int idInquietud, boolean cambiadoA) {
        boolean actualizado=false;
        RespuestaInquietud actualizarRespuesta = new RespuestaInquietud();
        actualizarRespuesta.setIdInquetud(idInquietud);
        actualizarRespuesta.setEstado(cambiadoA);
        int resultUpdate=jdbcTemplate.update("UPDATE RespuestaInquietud SET estado="+actualizarRespuesta.isEstado()+ " WHERE idInquietud="+actualizarRespuesta.getIdInquetud()+";");
        if (resultUpdate==1) {
            actualizado=true;
        }
        return actualizado;
    }
    
}
