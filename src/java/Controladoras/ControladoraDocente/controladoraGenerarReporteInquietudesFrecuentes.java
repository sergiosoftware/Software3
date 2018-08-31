/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraDocente;

import Modelos.Entidades.Inquietud;
import Modelos.Entidades.RespuestaInquietud;
import Modelos.CRUDEntidades.CRUDInquietud;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergioandres
 */
@Controller
public class controladoraGenerarReporteInquietudesFrecuentes {
    private CRUDInquietud crudInq;
    
    @RequestMapping(value = "generarReporteInquietudesFrecuentes.htm", method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request)
    {
        this.crudInq = new CRUDInquietud();
        ModelAndView mav = new ModelAndView();
        Inquietud nueva = new Inquietud();
        nueva.setCodigoEstudiante(1234);
        nueva.setCodigoidAsignatura("12345");
        nueva.setDescripcion("Hola");
        //nueva.setFechaPublicacion("25 enero 2017");
        nueva.setIdInquietud(12);
        nueva.setTema("este");
        Inquietud nueva2 = new Inquietud();
        nueva2.setCodigoEstudiante(1234);
        nueva2.setCodigoidAsignatura("12345");
        nueva2.setDescripcion("Hola");
        //nueva.setFechaPublicacion("25 enero 2017");
        nueva2.setIdInquietud(12);
        nueva2.setTema("este");
        LinkedList<Inquietud> uno = new LinkedList<>();
        uno.add(nueva);
        uno.add(nueva2);
        List<Inquietud> datos;
//        uno.add("1");
//        uno.add("lenguajes");
//        uno.add("Lexico");
//        uno.add("duro");
//        uno.add("nulo");
        datos = this.crudInq.reporteInquietudesFrecuentes();
        mav.addObject("inquietudesFrecuentes", datos);
        mav.setViewName("generarReporteInquietudesFrecuentes");
        return mav;
    }
    
}
