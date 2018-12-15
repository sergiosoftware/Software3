/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Estudiante;
import Modelos.Entidades.Inquietud;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author JulianCamilo
 */
public class CRUDEstudiantes {
    private JdbcTemplate jdbcTemplate;
    private String sql;
    private conexion conectar;

    public CRUDEstudiantes() {
        this.conectar= new conexion();
        this.jdbcTemplate = new JdbcTemplate(conectar.conectar());
        this.sql="";
    }
    
    
    public int ingresar(){
        return 0;
    }

    public Estudiante consultar(int codigoEstudiante) {
        this.sql="select * from estudiante where codigo=" + codigoEstudiante+";";
        return (Estudiante) this.jdbcTemplate.query(sql, new ResultSetExtractor<Estudiante>() {
            @Override
            public Estudiante extractData(ResultSet rs) throws SQLException, DataAccessException {
                    if(rs.next()){
                        Estudiante aux = new Estudiante();
                        aux.setCodigo(rs.getInt(1));
                        aux.setNombre(rs.getString(2));
                        aux.setApellido(rs.getString(3));
                        aux.setCorreo(rs.getString(5));
                        aux.setPrograma(rs.getString(4));
                        if(rs.getNString(7).equals("S")){
                            aux.setMonitor(true);
                            aux.setCalificacion(rs.getInt(6));
                        }
                        else{
                            aux.setMonitor(false);
                            aux.setCalificacion(0);
                        }
                        return aux;
                    }
                    return null;
                }
        });
    }
    
}
