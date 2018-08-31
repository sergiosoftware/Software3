/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraAdmin;

import Conexión.conexion;
import Modelos.CRUDEntidades.CRUDAsignatura;
import Modelos.OperacionesDocenteAdmin.ValidacionesAsignatura;
import Modelos.Entidades.Asignatura;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergioandres
 */
@Controller
public class controladoraAdmin {
    private JdbcTemplate jdbcTemplate;
    private CRUDAsignatura dao;
    ValidacionesAsignatura AsignaturaValidar;
    
    public controladoraAdmin(){
        conexion con = new conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        this.dao = new CRUDAsignatura();
        this.AsignaturaValidar = new ValidacionesAsignatura();
    }
    
    /**
     * Metodo para agregar una asignatura
     * @return a la vista asignatura
     */
    @RequestMapping(value = "gestionarAsignatura.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        Asignatura asig = dao.seleccionarAsignatura("123");
        System.out.println(asig.getNombre());
        ModelAndView mav = new ModelAndView();
        mav.setViewName("gestionarAsignatura");
        mav.addObject("asig", asig);
        return mav;
    }

    /**
       valida los datos de una asignatura y si no hay errores añade una mediante
     * la clase CRUDAsignatura
     * @param a la asignatura a añadir
     * @param result
     * @param status
     * 
     * @return retorna a la vista index luego de registrar la asignatura
     */
    @RequestMapping(value = "addAsignatura.htm", method = RequestMethod.GET)
    public ModelAndView form(
            @ModelAttribute("asignatura") Asignatura a,
            BindingResult result,
            SessionStatus status
    ) {
        this.AsignaturaValidar.validate(a, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("addAsignatura");
            mav.addObject("asignatura", new Asignatura());
            return mav;
        } else {
            this.dao.registrarAsignatura(a);
            return new ModelAndView("redirect:/gestionarAsignatura.htm");
        }
    }
    
    /**
     * Borra una asignatura selecionada
     * @param request codigo de la asignatura que se desea borrar
     * @return a la vista que tiene todas las asignaturas
     */

    @RequestMapping("deleteAsignatura.htm")
    public ModelAndView home(HttpServletRequest request) {
        String codigo = request.getParameter("codigo");
        this.dao.eliminarAsignatura(codigo);
        return new ModelAndView("redirect:/listAsignatura.htm");
    }

    
    /**
     * Metodo para editar una asignatura selecionada
     * @param request codigo de la asignatura que desea editar junto a todos sus parametros
     * @return a la vista editar asignatura con los datos nuevos de la asignatura modificada
     */
    @RequestMapping(value = "editAsignatura", method = RequestMethod.GET)
    public ModelAndView form(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        String codigo = request.getParameter("codigo");
        Asignatura datos = this.selectAsignatura(codigo);
        mav.setViewName("editAsignatura");
        mav.addObject("asignatura", new Asignatura(codigo, datos.getNombre(), datos.getCreditos()));

        return mav;
    }

    /**
     * valida los datos de una asignatura y si no hay errores edita  mediante
     * la clase CRUDAsignatura
     * @param a asignatura a editar 
     * 
     * @return un objeto de la clase ModelAndView redireccionando a la vista correspondiente
     */
    @RequestMapping(value = "editAsignatura", method = RequestMethod.POST)
    public ModelAndView form(
            @ModelAttribute("asignatura") Asignatura a,
            BindingResult result,
            SessionStatus status,
            HttpServletRequest request
    ) {
        this.AsignaturaValidar.validate(a, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            String codigo = request.getParameter("codigo");
            Asignatura datos = this.selectAsignatura(codigo);
            mav.setViewName("editAsignatura");
            mav.addObject("asignatura", new Asignatura(codigo, datos.getNombre(), datos.getCreditos()));
            return mav;
        } else {
            String codigo = request.getParameter("codigo");
            this.dao.editarAsignatura(a, codigo);
            return new ModelAndView("redirect:/list.htm");
        }

    }

    
    /**
     * Metodo simple para selecionar una asignatura
     * @param codigo de la asignatura
     * @return la asignatura deseada
     */
    public Asignatura selectAsignatura(String codigo) {
        return this.dao.seleccionarAsignatura(codigo);
    }
    
    
    
    
}
