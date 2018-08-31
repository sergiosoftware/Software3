/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.CRUDEntidades.CRUDPregunta;
import Modelos.Entidades.*;
import java.util.LinkedList;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class OperacionPresentarEvaluacionParaMonitor
{
    
    public LinkedList<Pregunta> seleccionarPreguntas()
    {
        LinkedList<Pregunta> preguntasAleatorias = new LinkedList<>();
        CRUDPregunta crudPregunta = new CRUDPregunta();
        preguntasAleatorias.addAll(crudPregunta.consultarAleatorio());
        return preguntasAleatorias;
    }
    
    
}
