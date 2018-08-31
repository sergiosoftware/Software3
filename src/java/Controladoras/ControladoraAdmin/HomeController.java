/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraAdmin;


import Conexión.conexion;
import Modelos.Entidades.Estudiante;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergioandres
 */
public class HomeController {
    private JdbcTemplate jdbcTemplate;

   

    @RequestMapping(value = "Login.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Login");
        mav.addObject("usuarios", new Estudiante());
        return mav;
    }
    
}
