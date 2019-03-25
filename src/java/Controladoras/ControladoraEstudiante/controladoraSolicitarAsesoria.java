/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraEstudiante;

import Modelos.CRUDEntidades.CRUDAsesoria;
import Modelos.Entidades.Asesoria;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author JulianCamilo
 */
@Controller
public class controladoraSolicitarAsesoria {
    
    private CRUDAsesoria asesorias;

    public controladoraSolicitarAsesoria() {
        this.asesorias=new CRUDAsesoria();
    }
    
    @RequestMapping(value = "getAsesoria.htm", method = RequestMethod.GET)
    public Asesoria getRespuesta(HttpServletRequest request){
        int idAsesoria=Integer.parseInt(request.getParameter("idAsesoria"));
        Asesoria respuesta = asesorias.consultaruna(idAsesoria);
        return respuesta;
    }
    
    @RequestMapping(value = "getAsesoriaAsignatura.htm", method = RequestMethod.GET)
    public Asesoria getRespuestaAsignatura(HttpServletRequest request){
        String asignatura=request.getParameter("asignatura");
        Asesoria respuesta = asesorias.consultarUnaPorAsignatura(asignatura);
        return respuesta;
    }
    
    @RequestMapping(value = "getTodasAsesorias.htm", method = RequestMethod.GET)
    public List getTodas(){
        List respuest=asesorias.consultarTodas();
        return respuest;
    }
    
    @RequestMapping(value = "agregarAsesoria.htm", method = RequestMethod.GET)
    public int agregarAsesoria(HttpServletRequest request){
        int codigoEstudiante=Integer.parseInt(request.getParameter("codigoEstudiante"));
        String asignatura=request.getParameter("asignatura");
        String tema=request.getParameter("tema");
        int respuesta = asesorias.IngresarAsesoria(codigoEstudiante, asignatura, tema);
        return respuesta;
    }
    
}
