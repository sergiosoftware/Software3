/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraEstudiante;

import Modelos.Entidades.Estudiante;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergioandres
 */
public class controladoraEstudiante {
   
    /**
     * Metodo para redireccionar a la vista solicitada
     * @return  redireccionamiento a la vista indexEstudiante
     */
    @RequestMapping(value = "indexEstudiante.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("indexEstudiante");
        //mav.addObject("usuarios", new Estudiante());
        return mav;
    }
    
}
