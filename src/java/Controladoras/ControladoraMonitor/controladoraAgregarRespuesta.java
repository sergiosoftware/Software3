/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.CRUDEntidades.CRUDAsesoria;
import Modelos.CRUDEntidades.CRUDRespuestaAsesoria;
import Modelos.OperacionesEstudianteMonitor.OperacionResponderInquietud;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class controladoraAgregarRespuesta {
    
    private CRUDRespuestaAsesoria respuestaAsesorias;

    public controladoraAgregarRespuesta() {
        this.respuestaAsesorias= new CRUDRespuestaAsesoria();
    }
    
    @RequestMapping(value = "agregarRespuesta.htm", method = RequestMethod.GET,headers="Accept=application/json")
    public ModelAndView home(HttpServletRequest request) {
        Date format = new Date();
        Date time = new Date();
        Time tiempo= new Time(1);
        int idInquietud = Integer.parseInt(request.getParameter("idAsesoria"));
        int codigoEstudiante = Integer.parseInt(request.getParameter("codigoMonitor"));
        //String asignatura = request.getParameter("asignatura");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        try {
            format = new SimpleDateFormat("yyyy-mm-dd").parse(fecha);
            time = new SimpleDateFormat("hh:mm:ss").parse(hora);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time.getTime());
            tiempo.setTime(calendar.getTimeInMillis());
            
        } catch (ParseException ex) {
            Logger.getLogger(controladoraResponderAsesoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        int respuesta = respuestaAsesorias.IngresarRespuestaAsesoria(idInquietud, codigoEstudiante, format, tiempo);
        ModelAndView def= new ModelAndView();
        def.setViewName("Respuesta Agregar Respuesta");
        def.addObject("respuesta",respuesta);
       
        return def;
    }
    
    
    
}
