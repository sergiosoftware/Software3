/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesDocenteAdmin;

import Modelos.CRUDEntidades.*;
import Modelos.Entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class OperacionesGestionarEvaluacionesParaMonitor
{
    /**
     * metodo para agregar una pregunta a la base de datos
     * @param p corresponde a un objeto de tipo pregunta para ingreso de preguntas al sistema
     * @param a corresponde a un objeto de tipo asignatura para ingreso de preguntas al sistema
     * @return retorna un valor entero, si es 0 es que hubo algun error
     *                                  si es 1 es que fue correcto
     */   
    public int ingresarPregunta(Pregunta p, Asignatura a)
    {
        CRUDPregunta crudPregunta = new CRUDPregunta();
        int result = crudPregunta.registrarPregunta(p, a);
        return result;
    }
    
    /**
     * metodo para ingresar respuesta a la base de datos
     * @param r objeto de tipo respuesta que tiene idRespuesta,descripcionRespuesta y opcionCorrecta
     * @param p objeto de tipo pregunta que tiene como finalidad proveer idPregunta para la respuesta a ingresar
     * @return retorna un valor entero, si es 0 es que hubo algun error
     *                                  si es 1 es que fue correcto
     */
    public int ingresarRespuesta(Respuesta r, Pregunta p)
    {
        CRUDRespuesta crudRespuesta = new CRUDRespuesta();
        int result = crudRespuesta.registrarRespuesta(r, p);
        return result;
    }
    
    /**
     * metodo para borrar una pregunta
     * @param idPregunta es el único identificador de cada pregunta, con el cual se hace el borrado de la pregunta de la base de datos
     * @return retorna un valor entero, si es 0 es que hubo algun error
     *                                  si es 1 es que fue correcto
     */
    public int eliminarPregunta(int idPregunta)
    {
        CRUDPregunta crudPregunta = new CRUDPregunta();
        int result = crudPregunta.eliminarPregunta(idPregunta);
        return result;
    }
    
    /**
     * funcion para eliminar Respuestas del sistema
     * @param idRespuesta identificador unico de respuesta que permite hacer el borrado de las respuestas de la base de datos
     * @return retorna un valor entero, si es 0 es que hubo algun error
     *                                  si es 1 es que fue correcto
     */
    public int eliminarRespuesta(int idRespuesta)
    {
        CRUDRespuesta crudRespuesta = new CRUDRespuesta();
        int result = crudRespuesta.eliminarRespuesta(idRespuesta);
        return result;
    }
    
    
    
    
    
    
    
}
