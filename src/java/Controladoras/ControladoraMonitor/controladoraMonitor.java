/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.Entidades.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Redireccionar a la vista indexMonitor
 * @author sergioandres
 */
public class controladoraMonitor {
    @RequestMapping(value = "indexMonitor.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("indexMonitor");
        //mav.addObject("usuarios", new Estudiante());
        return mav;
    }
    
    public void registrarMonitor(Estudiante monitor)
    {
        
    }
}
