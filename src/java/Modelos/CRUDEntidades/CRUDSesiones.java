/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Estudiante;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author JulianCamilo
 */
public class CRUDSesiones {
    
    private conexion conectar;
    private String sql;
    private JdbcTemplate jdbcTemplate;

    public CRUDSesiones() {
        this.conectar= new conexion();
        this.jdbcTemplate= new JdbcTemplate(conectar.conectar());
        this.sql= "";
    }
    

    public Estudiante consultar(String username, String newpass) {
        Estudiante user;
        this.sql="SELECT * FROM login WHERE username=" +"'"+username+"'"+" AND pass=" +"'"+newpass+"'"+";";
        Estudiante buscado=(Estudiante)this.jdbcTemplate.query(sql,new ResultSetExtractor<Estudiante>() {
            @Override
            public Estudiante extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                        Estudiante aux = new Estudiante();
                        aux.setCorreo(rs.getString(1));
                        return aux;
                    }
                    return null;
            }
        });
        if(buscado==null){
            user=null;
        }
        else{
            this.sql="SELECT * FROM estudiante WHERE correo="+"'"+username+"'";
            user=(Estudiante) this.jdbcTemplate.query(sql, new ResultSetExtractor<Estudiante>() {
                @Override
                public Estudiante extractData(ResultSet rs) throws SQLException, DataAccessException {
                     if(rs.next()){
                        Estudiante aux = new Estudiante();
                        aux.setCodigo(rs.getInt(1));
                        aux.setNombre(rs.getString(2));
                        aux.setApellido(rs.getString(3));
                        aux.setCorreo(rs.getString(5));
                         System.out.println(rs.getNString(7));
                        if(rs.getNString(7).equals("S")){
                            System.out.println("Es monitor");
                            aux.setMonitor(true);
                        }
                        else{
                            System.out.println("No es monitor");
                            aux.setMonitor(false);
                        }
                        
                        return aux;
                    }
                    return null;
                }
            });
        }
        return user;
    }
    
}
