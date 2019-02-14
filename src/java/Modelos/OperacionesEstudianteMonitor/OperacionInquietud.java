/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.CRUDEntidades.CRUDAsignatura;
import Modelos.CRUDEntidades.CRUDInquietud;
import Modelos.Entidades.Asignatura;
import Modelos.Entidades.Inquietud;
import java.util.List;

/**
 *
 * @author JulianCamilo
 */
public class OperacionInquietud {

    /**
     * Método que registra una nueva inquietud Validando asignatura y estudiante
     * existentes
     *
     * @param codigoestudiante el estudiante que publica la inquietud
     * @param codigoasignatura la asignatura de la que se va a preguntar
     * @param tema el tema en el que el estudiante tiene inquietud
     * @param descp detalles simples y concretos de su inquietud
     * @return 0 si no se pudo crear la inquietud o 1 si ocurre lo contrario
     */
    public int crearinquietud(int codigoestudiante, String codigoasignatura, String tema, String descp) {
        CRUDInquietud nuevainquietud = new CRUDInquietud();
        CRUDAsignatura asignatura = new CRUDAsignatura();
        int result = 0;
        if (codigoasignatura == null) {
            result = 0;
        } else {
            Asignatura resultAsignatura = asignatura.seleccionarAsignatura(codigoasignatura);
            if (resultAsignatura.getCodigo() != null) {
                result = nuevainquietud.IngresarInquietud(codigoestudiante, codigoasignatura, tema, descp);
            }
        }
        return result;
    }
    
    /**
     * Metodo para verificar la existencia de una inquietud identificada por su código
     * @param codigoinquietud identificador de la inquietud que va a ser verificada su existencia 
     * @return inquietud con la informacion correspondiente a la misma 
     */
    public Inquietud verinquietud(int codigoinquietud) {
        CRUDInquietud verinquietud = new CRUDInquietud();
        Inquietud nueva = verinquietud.consultaruna(codigoinquietud);
        return nueva;
    }

    /**
     * Método para eliminar una inquietud registrada mediante su identificador 
     * @param idinquietud identificador de la inquietud que va a ser eliminada del sistema
     * @return 
     */
    public int eliminarinquietud(int idinquietud) {
        CRUDInquietud eliminarinquietud = new CRUDInquietud();
        int result = eliminarinquietud.eliminarinquietud(0);
        return result;
    }

    /**
     * Metodo para modificar los parametros de una inquietud registrada
     * @param idinquietud identificador de la inquietud que va a ser modificada
     * @param codigoestudiante código del estudiante que va a realizar la modificación
     * @param codigoasignatura código de la asignatura para la cual se esta modificando la inquietud
     * @param tema tema de la inquietud
     * @param descp descripción de la inquietud
     * @return 
     */
    public int modificar(int idinquietud, int codigoestudiante, String codigoasignatura, String tema, String descp) {
        CRUDInquietud nuevainquietud = new CRUDInquietud();
        int result = nuevainquietud.editarInquietud(idinquietud, codigoestudiante, codigoasignatura, tema, descp);
        return result;
    }

    /**
     * Método Para generar un reporte con todas las inquietudes registradas en el sistema
     * @return lista con la informacion de la inquietudes registradas en el sistema
     */
    public List<Inquietud> consultarTodas() {
        CRUDInquietud verinquietud = new CRUDInquietud();
        List<Inquietud> inquietudes = verinquietud.consultarTodas();
        return inquietudes;
    }

    /**
     * Método que genera un reporte con las dudas de una asignatura, opcionalmente tambien las de un tema
     * @param idAsignatura Parametro String obligatorio de la asignatura a la que se le va a generar el reporte
     * @param tema Parametro String opcional que genera un reporte de la asignatura solo con el tema elegido 
     * @return Una lista de inquietudes para esa asignatura
     */
    public List<Inquietud> generarReporte(String idAsignatura, String tema){
        List<Inquietud> reporte=null;
        if(!idAsignatura.isEmpty()){
            if(!tema.isEmpty()){
                reporte=generarReporteAsignaturaTema(idAsignatura, tema);
            }
            else{
                reporte=generarReporteAsignatura(idAsignatura);
            }
        }
        return reporte;
    }
    
    /**
     * Método para generar un reporte con las inquietudes de una asginatura en especifico
     * @param idAsignatura identificador de la asignatura para la cual se va a generar el reporte de inquietudes
     * @return lista con las inquietudes asociadas a una asignatura en especifico
     */
    List<Inquietud> generarReporteAsignatura(String idAsignatura) {
        List<Inquietud> reporte = null;
        if (!idAsignatura.isEmpty()) {
            CRUDInquietud reporteAsignatura = new CRUDInquietud();
            reporte = reporteAsignatura.reporteInquietudesFrecuentesAsignatura(idAsignatura);
        }
        return reporte;
    }

    /**
     * Método para generar un reporte con las inquietudes de una asginatura en especifico ademas de un tema
     * @param idAsignatura identificador de la asignatura para la cual se va a generar el reporte de inquietudes
     * @param tema tema para el cual se va generar del reporte de inquietudes 
     * @return lista con las inquietudes registradas para una asignatura y tema en especifico
     */
    List<Inquietud> generarReporteAsignaturaTema(String idAsignatura, String tema) {
       List<Inquietud> reporte = null;
        if (!idAsignatura.isEmpty()) {
            CRUDInquietud reporteAsignatura = new CRUDInquietud();
            reporte = reporteAsignatura.reporteInquietudesFrecuentesAsignaturaTema(idAsignatura, tema);
        }
        return reporte;
    }

}
