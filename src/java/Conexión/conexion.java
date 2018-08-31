/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexión;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class conexion
{
    public DriverManagerDataSource conectar() 
    {
        DriverManagerDataSource datos = new DriverManagerDataSource();
        datos.setDriverClassName("com.mysql.jdbc.Driver");
        datos.setUrl("jdbc:mysql://localhost/bemonitorfinal");
        datos.setUsername("root");
        datos.setPassword("sergio123");

        return datos;
    }

}
