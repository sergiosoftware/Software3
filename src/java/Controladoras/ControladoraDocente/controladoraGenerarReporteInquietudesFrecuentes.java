/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraDocente;

import Modelos.Entidades.Inquietud;
import Modelos.Entidades.RespuestaInquietud;
import Modelos.CRUDEntidades.CRUDInquietud;
import Modelos.OperacionesEstudianteMonitor.OperacionInquietud;
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

    private OperacionInquietud crudInq;

    @RequestMapping(value = "generarReporteInquietudesFrecuentes.htm", method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request) {
        this.crudInq = new OperacionInquietud();
        ModelAndView mav = new ModelAndView();
        String asignatura = request.getParameter("asignatura");
        String tema = request.getParameter("tema");
        List<Inquietud> datos = crudInq.generarReporte(asignatura, tema);
        mav.addObject("inquietudesFrecuentes", datos);
        mav.setViewName("generarReporteInquietudesFrecuentes");
        return mav;
    }

}
