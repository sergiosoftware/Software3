/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author JulianCamilo
 */
public class CRUDEstudiantes {
    private JdbcTemplate jdbcTemplate;

    public CRUDEstudiantes() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    
    public int ingresar(){
        return 0;
    }
    
}
