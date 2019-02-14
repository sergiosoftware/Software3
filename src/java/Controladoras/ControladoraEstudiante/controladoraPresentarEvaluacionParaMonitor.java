/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraEstudiante;

import Conexión.conexion;
import Modelos.CRUDEntidades.*;
import Modelos.Entidades.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
@Controller
public class controladoraPresentarEvaluacionParaMonitor
{
    private JdbcTemplate jdbcTemplate;
    private CRUDPregunta pregunta;
    
    
    public controladoraPresentarEvaluacionParaMonitor()
    {
        conexion conexionBD = new conexion();
        this.jdbcTemplate = new JdbcTemplate(conexionBD.conectar());
        this.pregunta = new CRUDPregunta();
    }
    
    @ModelAttribute("pregunta")
    public  Pregunta getPregunta(){
        return new Pregunta();
    }
    @ModelAttribute("respuesta")
    public Respuesta getRespuesta(){
        return new Respuesta();
    }
    
    /**
     * Metodo para redireccionar a la vista solicitada
     * @return redireccionar a la vista PresentarEvalaucaionesParaMonitor
     */
    @RequestMapping(value = "PresentarEvaluacionParaMonitor.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("PresentarEvaluacionParaMonitor");
        mav.addObject("pregunta", new Pregunta());
        return mav;
    }
    
    /**
     * Metodo para redirecionar a la vista solicitada
     * @param model
     * @return redireccionamiento a la vista PresentarEvaluacionParaMonitor
     */
    @RequestMapping(value = "PresentarEvaluacionParaMonitor.htm",method = RequestMethod.GET)
    public String addInquietud(ModelMap model){
        model.addAttribute("pregunta", new Pregunta());
        return "pregunta";
    }
 
    /**
     * Metodo para seleccionar una pregunta para evaluar
     * @param pregunta 
     * @param result
     * @param status
     * @return una nueva vista con la inquietud publicada
     */
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form(
            @ModelAttribute("pregunta") Pregunta pregunta,
            BindingResult result,
            SessionStatus status
    ) {
       
            //System.out.println("Entre");
            this.pregunta.seleccionarPregunta(pregunta.getIdPregunta());
            return new ModelAndView("");
        }
}
