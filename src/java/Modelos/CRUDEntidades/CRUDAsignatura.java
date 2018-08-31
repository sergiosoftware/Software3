/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Conexión.conexion;
import Modelos.Entidades.Asignatura;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author sergioandres
 */
public class CRUDAsignatura {
    private JdbcTemplate jdbcTemplate;

    public CRUDAsignatura() {
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    /**
     * Funcion para registrar asignatura en la base de datos
     * @param a Asignatura que se quiere registrar
     * @return 
     */
    public int registrarAsignatura(Asignatura a){
        return jdbcTemplate.update("INSERT INTO asignatura(codigo, nombre, creditos) "
                + "VALUES (?,?,?)", a.getCodigo(), a.getNombre(), a.getCreditos());
    }
    /**
     * elimina una asignatura de la base de datos
     * @param codigo de la asignatura que se quiere eliminar
     * @return 
     */
    public int eliminarAsignatura(String codigo) {
        return jdbcTemplate.update("delete from asignatura "
                + "where "
                + "codigo=?;", codigo);
    }
    /**
     * edita los datos de una asignatura en la base de datos
     * @param a asignatura a modificar con los datos que se quieren cambiar
     * @param codigo de la asignatura que se quiere cambiar
     * @return 
     */
    public int editarAsignatura(Asignatura a, String codigo) {
        return jdbcTemplate.update("update asignatura"
                + "nombre =?,"
                + "creditos=?,"
                + "where codigo=?", a.getNombre(), a.getCreditos(), a.getCodigo());
    }
     /**
     * captura los datos de una asignatura de la base de datos
     * @param Codigo de la asignatura que es requerida
     * @return retorna una asignatura
     */
    public Asignatura seleccionarAsignatura(String Codigo) {
        final Asignatura asig = new Asignatura();
        String quer = "SELECT * FROM asignatura WHERE codigo=" + Codigo+";";
        return (Asignatura) jdbcTemplate.query(quer, new ResultSetExtractor<Asignatura>() {
            public Asignatura extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    asig.setCodigo(rs.getString("codigo"));
                    asig.setNombre(rs.getString("nombre"));
                    asig.setCreditos (Integer.parseInt(rs.getString("creditos")));
                }
                return asig;
            }

        }
        );
    }   
    
}
