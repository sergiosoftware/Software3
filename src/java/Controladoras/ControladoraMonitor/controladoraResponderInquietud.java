/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.CRUDEntidades.CRUDInquietud;
import Modelos.Entidades.Estudiante;
import Modelos.Entidades.Inquietud;
import Modelos.Entidades.RespuestaInquietud;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
@Controller
public class controladoraResponderInquietud
{
    
    CRUDInquietud crudhandler;
    
    /**
     * 
     * @param request
     * @return 
     */
    @RequestMapping(value = "responderInquietud.htm", method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request)
    {
        
        ModelAndView mav = new ModelAndView();
        String fechaRespuesta = request.getParameter("fechaRespuesta");
        String horaRespuesta = request.getParameter("horaInicioRespuesta"); 
        mav.setViewName("responderInquietud");
        mav.addObject("respuestas", new RespuestaInquietud());
        return mav;
    }
    
    @RequestMapping(value = "responderInquietudRevisar.htm", method = RequestMethod.GET)
    public ModelAndView form(){
        
        this.crudhandler= new CRUDInquietud();
        ModelAndView mav = new ModelAndView();
        List<Inquietud> inquietudes = crudhandler.consultarTodas();
        mav.setViewName("responderInquietudRevisar");
        mav.addObject("respuestas", inquietudes);
        return mav;
    }
    
}
