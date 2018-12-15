/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraAdmin;

import Modelos.Entidades.Estudiante;
import Modelos.OperacionesEstudianteMonitor.OperacionesEstudianteMonitor;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JulianCamilo
 */
public class controladoraPerfilUsuario {
    
    OperacionesEstudianteMonitor perfilUsuario;
    
    
    @RequestMapping(value = "perfilUsuario.htm", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request){
        
        ModelAndView mav = new ModelAndView();
        this.perfilUsuario= new OperacionesEstudianteMonitor();
        int codigoEstudiante=Integer.parseInt(request.getParameter("codigo"));
        Estudiante usuario=this.perfilUsuario.consultarEstudiante(codigoEstudiante);
        mav.setViewName("perfilUsuario");
        mav.addObject("codigo",request.getParameter("codigo"));
        mav.addObject("usuario",usuario);
        return mav;
    }

   
}
