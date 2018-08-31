/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.CRUDEntidades.CRUDInquietud;
import Modelos.Entidades.Inquietud;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JulianCamilo
 */
public class OperacionInquietud {
    
    
    public int crearinquietud(int codigoestudiante,String codigoasignatura,String tema, String descp){
        CRUDInquietud nuevainquietud= new CRUDInquietud();
        int result=nuevainquietud.IngresarInquietud(codigoestudiante, codigoasignatura, tema, descp);
        return result;
    }
    
    public Inquietud verinquietud(int codigoinquietud){
        CRUDInquietud verinquietud= new CRUDInquietud();
        Inquietud nueva= verinquietud.consultaruna(codigoinquietud);
        return nueva;
    }
    
    public void responderinquietud(){
        
    }
    
    public int eliminarinquietud(int idinquietud){
        CRUDInquietud eliminarinquietud= new CRUDInquietud();
        int result=eliminarinquietud.eliminarinquietud(0);
        return result;
    }
    
    public int modificar(int idinquietud,int codigoestudiante,String codigoasignatura,String tema, String descp){
        CRUDInquietud nuevainquietud= new CRUDInquietud();
        int result=nuevainquietud.editarInquietud(idinquietud,codigoestudiante, codigoasignatura, tema, descp);
        return result;
    }
    
}
