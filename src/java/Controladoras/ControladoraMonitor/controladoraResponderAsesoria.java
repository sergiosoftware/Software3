/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.CRUDEntidades.CRUDRespuestaAsesoria;
import Modelos.Entidades.RespuestaAsesoria;
import java.sql.Time;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JulianCamilo
 */
@Controller
public class controladoraResponderAsesoria {

    private CRUDRespuestaAsesoria respuestas;

    public controladoraResponderAsesoria() {
        this.respuestas = new CRUDRespuestaAsesoria();
    }

    

    @RequestMapping(value = "agregarRespuesta.htm", method = RequestMethod.GET)
    public ModelAndView agregarAsesoria(HttpServletRequest request) {
        
        int idInquietud = Integer.parseInt(request.getParameter("idAsesoria"));
        int codigoEstudiante = Integer.parseInt(request.getParameter("codigoMonitor"));
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        Time horaRespuesta = new Time(Integer.parseInt(hora.substring(0, 2)), Integer.parseInt(hora.substring(3, 5)), 0);
        int respuesta = respuestas.IngresarRespuestaAsesoria(idInquietud, codigoEstudiante, fecha, horaRespuesta);
        ModelAndView def = new ModelAndView();
        def.setViewName("respuestaResponderAsesoria");
        System.out.println(respuesta+"############################################");
        def.addObject("respuestas",respuesta);
        return def;
    }

}
