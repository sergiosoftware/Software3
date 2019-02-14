/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Inquietud;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author JulianCamilo
 */
public class CRUDInquietud {

    private conexion conectar;
    private String sql;
    private JdbcTemplate jdbcTemplate;

    public CRUDInquietud() {
        this.conectar = new conexion();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
        this.sql = "";
    }

    /**
     * Método para registrar una nueva inquietud en el sistema
     * @param codigoestudiante Identificador del estudiante que esta realizando la inquietud
     * @param codigoasignatura Identificador de la asignatura para la cual se esta registrando la inquietud
     * @param tema Tema de lnquietud registrada
     * @param descrip Descripcion de la inquietud registrada
     * @return 
     */
    public int IngresarInquietud(int codigoestudiante, String codigoasignatura, String tema, String descrip) {
        Inquietud nuevainquietud = new Inquietud(codigoestudiante, codigoasignatura, tema, descrip);
        this.sql = "insert into inquietud(codigoEstudiante,codigoAsignatura,tema,descripcion,fechaPublicacion) values ("
                + nuevainquietud.getCodigoEstudiante() + ","+'"' + nuevainquietud.getCodigoidAsignatura() + '"'+","+'"' + nuevainquietud.getTema() + '"'+","
                +'"'+ nuevainquietud.getDescripcion() +'"'+ ",NOW());";
        int resul = this.jdbcTemplate.update(sql);
        return resul;
    }

    /**
     * Método para consultar una unica inquietud dado su idee¿ntificador
     * @param idInquietud identificador de la inquietud que va a ser consultada
     * @return inquietud con toda la informacion registrada en el sistema
     */
    public Inquietud consultaruna(int idInquietud) {
        this.sql = "select * from inquietud where idinquietud=" + idInquietud + ";";
        return (Inquietud) this.jdbcTemplate.query(sql, new ResultSetExtractor<Inquietud>() {
            @Override
            public Inquietud extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    Inquietud aux = new Inquietud();
                    aux.setIdInquietud(rs.getInt(1));
                    aux.setCodigoEstudiante(rs.getInt(2));
                    aux.setCodigoidAsignatura(rs.getString(3));
                    aux.setTema(rs.getString(4));
                    aux.setDescripcion(rs.getString(5));
                    aux.setFechaPublicacion(rs.getDate(6));
                    return aux;
                }
                return null;
            }
        });
    }

    /**
     * Método para generar un reporte con todas las inquietudes registradas en el sistema
     * @return lista con todas las inquietudes registrada en el sistema
     */
    public List consultarTodas() {
        this.sql = "select * from inquietud inner join estudiante on codigoEstudiante=codigo order by idinquietud desc";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }

    /**
     * Método para modificar los datos de un inquietud registrada en el sistema
     * @param idinquietud identificador de la inquietud que va a ser modificada
     * @param codigoestudiante codigo del estudiante que va a realzar la inuqietud
     * @param codigoasignatura código de la asignatura para la cual se realiza la inquietud
     * @param tema tema de la inquietud
     * @param descrip descripcion de la inquietud
     * @return 
     */
    public int editarInquietud(int idinquietud, int codigoestudiante, String codigoasignatura, String tema, String descrip) {
        Inquietud nuevainquietud = new Inquietud(codigoestudiante, codigoasignatura, tema, descrip);
        this.sql = "update inquietud set codigoestudiante=" + nuevainquietud.getCodigoEstudiante() + ",codigoasignatura=" + nuevainquietud.getCodigoidAsignatura()
                + ",tema=" + nuevainquietud.getTema() + ",descripcion=" + nuevainquietud.getDescripcion() + ",fechapublicacion=NOW()"
                + "where idinquietud=" + idinquietud + ";";
        int result = this.jdbcTemplate.update(sql);
        return result;
    }

    /**
     * Método para eliminar una inquietud registrada en el sistema
     * @param idinquietud identificador de la inquietud que va a ser eliminada 
     * @return 
     */
    public int eliminarinquietud(int idinquietud) {
        this.sql = "delete from inquietud where idinquietud=" + idinquietud + ";";
        int result = this.jdbcTemplate.update(sql);
        return result;
    }
    
    /**
     * Método para generar un reporte con inquietudes de una asignatura
     * @param codigoAsignatura codigo de la asignatura para la cual se va a generar el reporte
     * @return lista con las inquietudes registradas en el sistema para una asignatura
     */    
    public List<Inquietud> reporteInquietudesFrecuentesAsignatura(String codigoAsignatura) {
        this.sql = "select codigoEstudiante,codigoAsignatura,tema,descripcion,fechaPublicacion from inquietud where codigoAsignatura=" + '"'+codigoAsignatura+'"' + ";";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }
    
    /**
     * Método para generar un reporte con inquietudes de una asignatura ademas de un tema
     * @param codigoAsignatura codigo de la asignatura para la cual se va a generar el reporte
     * @param Tema Tema de la asignatura que se va a generar el reporte 
     * @return lista con las inquietudes registradas en el sistema para una asignatura y un tema
     */
    public List<Inquietud> reporteInquietudesFrecuentesAsignaturaTema(String codigoAsignatura, String Tema) {
        String operadorLike="%";
        this.sql = "select * from inquietud where codigoAsignatura="+'"' + codigoAsignatura+'"' + " AND tema like '"+operadorLike.concat(Tema).concat(operadorLike)+ "';";
        List datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }

    /**
     * Método para editar el estado de una inquietud, donde "S" indica que la inquietud ya tiene una respuesta asociada
     * por defecto la inquietud esta marcada como "N" indicando que no tiene respuesta
     * @param idInquietud identificador la inquietud que se va a modificar su estado
     * @return 
     */
    public int editarEstadoInquietud(int idInquietud) {
        //To change body of generated methods, choose Tools | Templates.}
        Inquietud nuevainquietud = new Inquietud(idInquietud);
        this.sql = "update inquietud set respuesta='S' where idinquietud=" + nuevainquietud.getIdInquietud() + ";";
        int result = this.jdbcTemplate.update(sql);
        return result;
    }

}
