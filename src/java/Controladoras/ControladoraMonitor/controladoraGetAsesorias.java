/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.CRUDEntidades.CRUDAsesoria;
import Modelos.Entidades.Asesoria;
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
public class controladoraGetAsesorias {
    
    private CRUDAsesoria asesorias;

    public controladoraGetAsesorias() {
        this.asesorias= new CRUDAsesoria();
    }
    
    
    @RequestMapping(value = "getAsesoriaAsignatura.htm", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request){
        String asignatura=request.getParameter("asignatura");
        List respuesta = asesorias.consultarPorAsignatura(asignatura);
        ModelAndView def= new ModelAndView();
        def.setViewName("respuestaAsesorias");
        def.addObject("respuestas",respuesta);
        return def;
    }
    
}
