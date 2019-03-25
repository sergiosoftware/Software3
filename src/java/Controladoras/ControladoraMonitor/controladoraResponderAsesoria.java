/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraMonitor;

import Modelos.CRUDEntidades.CRUDRespuestaAsesoria;
import Modelos.Entidades.RespuestaAsesoria;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "getRespuestaAsesoria.htm", method = RequestMethod.GET)
    public RespuestaAsesoria getRespuesta(HttpServletRequest request) {
        int idRespuesta = Integer.parseInt(request.getParameter("idAsesoria"));
        RespuestaAsesoria respuesta = respuestas.consultaruna(idRespuesta);
        return respuesta;
    }

    @RequestMapping(value = "getRespuestaAsignatura.htm", method = RequestMethod.GET)
    public RespuestaAsesoria getRespuestaAsignatura(HttpServletRequest request) {
        String asignatura = request.getParameter("asignatura");
        RespuestaAsesoria respuesta = respuestas.consultarUnaPorAsignatura(asignatura);
        return respuesta;
    }

    @RequestMapping(value = "getTodasRespuestas.htm", method = RequestMethod.GET)
    public List getTodas() {
        List respuest = respuestas.consultarTodas();
        return respuest;
    }

    @RequestMapping(value = "agregarRespuesta.htm", method = RequestMethod.GET)
    public int agregarAsesoria(HttpServletRequest request) {
        Date format = new Date();
        Date time = new Date();
        Time tiempo= new Time(1);
        int idInquietud = Integer.parseInt(request.getParameter("idInquietud"));
        int codigoEstudiante = Integer.parseInt(request.getParameter("codigoMonitor"));
        String asignatura = request.getParameter("asignatura");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        String tema = request.getParameter("tema");
        try {
            format = new SimpleDateFormat("yyyy-mm-dd").parse(fecha);
            time = new SimpleDateFormat("hh:mm:ss").parse(hora);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time.getTime());
            tiempo.setTime(calendar.getTimeInMillis());
            
        } catch (ParseException ex) {
            Logger.getLogger(controladoraResponderAsesoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        int respuesta = respuestas.IngresarRespuestaAsesoria(idInquietud, codigoEstudiante, format, tiempo);
        return respuesta;
    }

}
