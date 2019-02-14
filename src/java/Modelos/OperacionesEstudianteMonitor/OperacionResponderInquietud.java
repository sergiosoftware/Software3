/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.CRUDEntidades.CRUDInquietud;
import Modelos.CRUDEntidades.CRUDRespuestaInquietud;
import Modelos.Entidades.RespuestaInquietud;
import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class OperacionResponderInquietud {

    private CRUDRespuestaInquietud inquietudResponder;
    private CRUDInquietud inquietudActualizada;

    public OperacionResponderInquietud() {
        this.inquietudResponder = new CRUDRespuestaInquietud();
        this.inquietudActualizada = new CRUDInquietud();
    }

    /**
     * Método que registra la respuesta a una inquietud, y actualiza su estado a
     * respondida El sistema debe validar que la fecha sea mayor a la actual o
     * igual Si la fecha es igual, debe validar que la hora sea mayor
     *
     * @param idInquietud el id de la inquietud a responder
     * @param codigoEstudiante el estudiante que realiza la respuesta
     * @param fechaRespuesta la fecha que el estudiante propuso la reunión para
     * responder
     * @param hora la hora a la que la reunión quedó programada
     * @return 0 si no se pudo registrar la respuesta para la inquietud, 1 en caso contrario
     */
    public int guardarRespuestaInquietud(int idInquietud, int codigoEstudiante, Date fechaRespuesta, Time hora, String preRespuesta) {
        int result = 0;
        Date fechaSistema = new Date();
        Time horaActual = new Time(fechaSistema.getHours(), fechaSistema.getMinutes(), fechaSistema.getSeconds());
        if (idInquietud == 0 || codigoEstudiante == 0 || preRespuesta.isEmpty()) {
            result = 0;
        } else if (fechaRespuesta != null) {
            if (fechaSistema.equals(fechaRespuesta) && horaActual.after(fechaSistema)) {
                result = inquietudResponder.guardarConFecha(idInquietud, codigoEstudiante, fechaRespuesta, hora,preRespuesta);
                if (result == 1) {
                    result = inquietudActualizada.editarEstadoInquietud(idInquietud);
                }
            } else if (fechaSistema.before(fechaRespuesta)) {
                result = inquietudResponder.guardarConFecha(idInquietud, codigoEstudiante, fechaRespuesta, hora,preRespuesta);
                if (result == 1) {
                    result = inquietudActualizada.editarEstadoInquietud(idInquietud);
                }
            }
        }
        else{
            result = inquietudResponder.guardarSinFecha(idInquietud, codigoEstudiante,preRespuesta);
            if (result == 1) {
                    result = inquietudActualizada.editarEstadoInquietud(idInquietud);
                }
        }
        return result;

    }

    /**
     * Método para consultar las respuestas que a dado un estudiante a inquietudes planteadas
     * @param codigoEstudiante codigo del estudiante que ha dado respuesta a las inquietudes
     * @return lista con las respuestas a iinquietud que a registrado un estudiante
     */
    public List consultarRespuestas(int codigoEstudiante) {
        List respuestas = inquietudResponder.consultarRespuestas(codigoEstudiante);
        if (respuestas == null) {
            return null;
        } else {
            return respuestas;
        }

    }
    
    /**
     * Metodo para consultar una respuesta en especifico que a dado un estudiante a una inquietud
     * @param idInquietud identificar de la inquietud que se va a onsultar
     * @param codigoEstudiante codigo del estudiante que se va a relacionar con la inquietud que se va a consultar
     * @return informacion de una respuesta a una inquietud por parte de un estudiante
     */
    RespuestaInquietud consultarUnaRespuesta(int idInquietud, int codigoEstudiante) {
        CRUDRespuestaInquietud verRespuesta = new CRUDRespuestaInquietud();
        RespuestaInquietud nueva = verRespuesta.consultarUna(idInquietud, codigoEstudiante);
        return nueva;
    }

}
