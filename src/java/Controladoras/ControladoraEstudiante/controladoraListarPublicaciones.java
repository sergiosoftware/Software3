/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraEstudiante;

import Modelos.Entidades.Inquietud;
import Modelos.OperacionesEstudianteMonitor.OperacionInquietud;
import Modelos.OperacionesEstudianteMonitor.OperacionResponderInquietud;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JulianCamilo
 */
public class controladoraListarPublicaciones {
    
    OperacionResponderInquietud respuestaInquietud;
    
    /**
     * Metodo para redireccionar a la vista solicitada
     * @param request
     * @return redireccionamiento a la vista misPublicaciones
     */
    @RequestMapping(value = "misPublicaciones.htm", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request){
        
        this.respuestaInquietud= new OperacionResponderInquietud();
        ModelAndView mav = new ModelAndView();
        List respuestas = respuestaInquietud.consultarRespuestas(Integer.parseInt(request.getParameter("codigo")));
        mav.setViewName("misPublicaciones");
        if(respuestas!=null){
            mav.addObject("respuestas", respuestas);
        }
        else{
            mav.addObject("error","No has publicado nada aun");
        }
        mav.addObject("codigo",request.getParameter("codigo"));
        return mav;
    }
    
}
