/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.Entidades.Inquietud;
import Modelos.Entidades.RespuestaInquietud;
import Modelos.OperacionesEstudianteMonitor.OperacionInquietud;
import Modelos.OperacionesEstudianteMonitor.OperacionResponderInquietud;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
    
    OperacionInquietud inquietud;
    OperacionResponderInquietud respuestaInquietud;
    
    @RequestMapping(value = "responderInquietudRevisar.htm", method = RequestMethod.GET)
    public ModelAndView home(){
        
        this.inquietud= new OperacionInquietud();
        ModelAndView mav = new ModelAndView();
        List<Inquietud> inquietudes = inquietud.consultarTodas();
        mav.setViewName("responderInquietudRevisar");
        mav.addObject("respuestas", inquietudes);
        return mav;
    }
    
    /**
     * 
     * @param request
     * @return 
     */
    @RequestMapping(value = "responderInquietud.htm", method = RequestMethod.GET)
    public ModelAndView form()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("responderInquietud");
        mav.addObject("respuestas", new RespuestaInquietud());
        return mav;
    }
    
    @RequestMapping(value = "responderInquietud.htm", method = RequestMethod.POST)
    public ModelAndView form(HttpServletRequest request) {
        String fecha = request.getParameter("fechaRespuesta");
        String hora = request.getParameter("horaInicioRespuesta");
        System.out.println(Integer.parseInt(fecha.substring(0, 4)));
        LocalDate fechaR = LocalDate.of(Integer.parseInt(fecha.substring(0, 4)), Integer.parseInt(fecha.substring(5, 7)),Integer.parseInt(fecha.substring(8, 10)));
        Date fechaRespuesta= new Date(fechaR.getYear()-1900, fechaR.getMonthValue()+1, fechaR.getDayOfMonth());
        System.out.println(fechaRespuesta);
        Time horaRespuesta = new Time(Integer.parseInt(hora.substring(0, 2)), Integer.parseInt(hora.substring(3, 5)), 0);
        this.respuestaInquietud = new OperacionResponderInquietud();
        this.respuestaInquietud.guardarRespuestaInquietud(Integer.parseInt(request.getParameter("codigo")), 1701310061, fechaRespuesta, horaRespuesta);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("responderInquietud");
        mav.addObject("respuestas", new RespuestaInquietud());
        return mav;
    }
    
}
