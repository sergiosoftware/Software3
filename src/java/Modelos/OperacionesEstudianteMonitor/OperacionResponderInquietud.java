/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.CRUDEntidades.CRUDInquietud;
import Modelos.CRUDEntidades.CRUDRespuestaInquietud;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class OperacionResponderInquietud
{
    private CRUDRespuestaInquietud inquietudResponder;
    private CRUDInquietud inquietudActualizada;
    
    public OperacionResponderInquietud() {
        this.inquietudResponder= new CRUDRespuestaInquietud();
        this.inquietudActualizada= new CRUDInquietud();
    }

    /**
     * Método que registra la respuesta a una inquietud, y actualiza su estado a respondida
     * El sistema debe validar que la fecha sea mayor a la actual o igual
     * Si la fecha es igual, debe validar que la hora sea mayor
     * @param idInquietud el id de la inquietud a responder
     * @param codigoEstudiante el estudiante que realiza la respuesta
     * @param fechaRespuesta la fecha que el estudiante propuso la reunión para responder
     * @param hora la hora a la que la reunión quedó programada
     * @return 
     */
    public int guardarRespuestaInquietud(int idInquietud, int codigoEstudiante, Date fechaRespuesta, Time hora) {
        if(idInquietud==0 || codigoEstudiante==0 || fechaRespuesta==null||hora==null){
            return 0;
        }
        else{
            int result=inquietudResponder.guardar(idInquietud,codigoEstudiante,fechaRespuesta,hora);
            if(result==1){
                result=inquietudActualizada.editarEstadoInquietud(idInquietud);
            }
            return result;
            }
    }
    
}
