/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras.ControladoraAdmin;


import Modelos.Entidades.Estudiante;
import Modelos.OperacionesDocenteAdmin.OperacionLoginRegister;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergioandres
 */
public class HomeController {
    private JdbcTemplate jdbcTemplate;
    private OperacionLoginRegister register;

   

    @RequestMapping(value = "Login.htm", method = RequestMethod.GET)
    public ModelAndView form() {
        System.out.println("Entre al controller");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("Login");
        return mav;
    }
    
    
    @RequestMapping(value = "Login.htm", method = RequestMethod.POST)
    public ModelAndView form(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        String username=request.getParameter("txtUsername");
        String password=request.getParameter("txtPassword");
        register= new OperacionLoginRegister();
        Estudiante typeUser=register.iniciarSesion(username,password);
        System.out.println(typeUser.isMonitor());
        if(typeUser==null){
            mav.setViewName("Login");
            String error="Usuario o contraseña incorrecto";
            mav.addObject("error",error);
        }
        else if(typeUser.isMonitor()){
            System.out.println("Es monitor");
            mav.setViewName("indexMonitor");
            mav.addObject("usuario",typeUser);
        }
        else{
            System.out.println("Es estudiante");
            mav.setViewName("indexEstudiante");
            mav.addObject("usuario",typeUser);
        }
        return mav;
    }
    
    
}
