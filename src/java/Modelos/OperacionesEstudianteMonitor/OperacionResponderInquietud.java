/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.CRUDEntidades.CRUDRespuestaInquietud;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;
import javax.json.JsonValue;

/**
 *
 * @author SALDARRIAGA VILLADA
 */
public class OperacionResponderInquietud
{
    private CRUDRespuestaInquietud nuevaRespuesta;
    
    public OperacionResponderInquietud() {
        this.nuevaRespuesta= new CRUDRespuestaInquietud();
    }
    
    public void recibirdatosControladora(JsonArray datos){
        String datosDecod[]=decodificar(datos);
        String mensaje="";
        boolean saved=guardarRespuestaInquietud(datosDecod[0],datosDecod[1],datosDecod[2],datosDecod[3]);
        if(saved){
            mensaje="La respuesta ha sido guardada con exito"+"\n";
            boolean actualizado;
            actualizado = actualizarEstadoInquietud(datosDecod[0],true);
            if (!actualizado) {
                mensaje+="Pero ocurrio un error interno, vuelva a intentarlo mas tarde";
            }
        }
        else
            mensaje="No se pudo guardar la respuesta, intentelo mas adelante";
    }

    private String[] decodificar(JsonArray datos) {
        String valores[] =new String[10];
        int cont=0;
        for (JsonValue dato : datos) {
            valores[cont]=dato.toString();
            cont++;
        }
        return valores;
    }

    private boolean guardarRespuestaInquietud(String idInquietud, String codigoEstudiante, String idRespuesta, String respuesta) {
        boolean result=nuevaRespuesta.guardar(Integer.parseInt(idInquietud),Integer.parseInt(codigoEstudiante),Integer.parseInt(idRespuesta),respuesta);
        return result;
    }

    private boolean actualizarEstadoInquietud(String idInquietud, boolean cambiadoA) {
        boolean result =nuevaRespuesta.actualizar(Integer.parseInt(idInquietud),cambiadoA);
        return result;
    }
    
    
}
