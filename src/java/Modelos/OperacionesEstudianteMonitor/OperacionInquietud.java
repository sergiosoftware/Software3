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
    
    
    /**
     * Método que registra una nueva inquietud
     * Validando asignatura y estudiante existentes
     * @param codigoestudiante el estudiante que publica la inquietud
     * @param codigoasignatura la asignatura de la que se va a preguntar
     * @param tema el tema en el que el estudiante tiene inquietud
     * @param descp detalles simples y concretos de su inquietud
     * @return 
     */
    public int crearinquietud(int codigoestudiante,String codigoasignatura,String tema, String descp){
        CRUDInquietud nuevainquietud= new CRUDInquietud();
        if(codigoasignatura==null){
            return 0;
        }
        int result=nuevainquietud.IngresarInquietud(codigoestudiante, codigoasignatura, tema, descp);
        return result;
    }
    
    public Inquietud verinquietud(int codigoinquietud){
        CRUDInquietud verinquietud= new CRUDInquietud();
        Inquietud nueva= verinquietud.consultaruna(codigoinquietud);
        return nueva;
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

    public List<Inquietud> consultarTodas() {
        CRUDInquietud verinquietud= new CRUDInquietud();
        List<Inquietud> inquietudes= verinquietud.consultarTodas();
        return inquietudes;
    }
    
}
