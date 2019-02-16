/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.CRUDEntidades.CRUDEstudiantes;
import java.util.LinkedList;
import Modelos.Entidades.*;
import java.util.List;
/**
 *
 * @author sergioandres
 */
public class OperacionesEstudianteMonitor {
 
    LinkedList<Estudiante> monitores = new LinkedList<>();
    CRUDEstudiantes estudiantes = new CRUDEstudiantes();
    
    /**
     * Método para listar los estudiantes que son monitores y están registrados en el sistema
     * @param totalEstudiantes lista donde se encuentran todos los estudiantes que se han registrado en el sistema;
     * ya sean monitores o no
     * @return retorna lista con los estudiantes que cumplen con el papel de monitores.
     */
    public LinkedList<Estudiante> obtenerMonitores(List<Estudiante> totalEstudiantes)
    {
        for (Estudiante estudianteIterador:totalEstudiantes)
        {
            if (estudianteIterador.isMonitor())
            {
                this.monitores.add(estudianteIterador);
            }
        }
        return monitores;
    }

    /**
     * Método para onsultar la informacion registrada de un estudiante
     * @param codigoEstudiante codigo del estudiante para el cual se va a generar el reporte con la informacion solicitada
     * @return informacion asociada a un estudiante registrado en el sistema
     */
    public Estudiante consultarEstudiante(int codigoEstudiante) {
        Estudiante usuario=estudiantes.consultar(codigoEstudiante);
        if(usuario.getNombre()==null){
            usuario=null;
        }
        return usuario;
    }
}
