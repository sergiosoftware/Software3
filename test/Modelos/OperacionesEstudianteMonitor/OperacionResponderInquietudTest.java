/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.Entidades.Inquietud;
import Modelos.Entidades.PreguntaRespondida;
import Modelos.Entidades.RespuestaInquietud;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JulianCamilo
 */
public class OperacionResponderInquietudTest {
    
    OperacionResponderInquietud instance;
    public OperacionResponderInquietudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       instance = new OperacionResponderInquietud();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Prueba para responder una pregunta normal
     */
    @Test
    public void testGuardarRespuestaInquietudNormal() {
        int idInquietud = 1;
        int codigoEstudiante = 1701122317;
        Date fechaRespuesta= new Date(119, 1, 6);
        Time hora = new Time(9, 0, 0);
        int expResult = 1;
        int result = instance.guardarRespuestaInquietud(idInquietud, codigoEstudiante, fechaRespuesta, hora);
        RespuestaInquietud respuestaGuardada=instance.consultarUnaRespuesta(idInquietud,codigoEstudiante);
        RespuestaInquietud respuestaEsperada= new RespuestaInquietud(idInquietud, codigoEstudiante, fechaRespuesta, hora);
        assertEquals(expResult, result);
        assertEquals(respuestaEsperada.getCodigoEstudiante(), respuestaGuardada.getCodigoEstudiante());
        assertEquals(respuestaEsperada.getFechaRespuesta(), respuestaGuardada.getFechaRespuesta());
        assertEquals(respuestaEsperada.getHoraRespuesta(), respuestaGuardada.getHoraRespuesta());
        // TODO review the generated test code and remove the default call to fail.  
    }
    
    /**
     * Prueba para responder una pregunta fecha null
     */
    @Test
    public void testGuardarRespuestaInquietudFechaNull() {
        int idInquietud = 2;
        int codigoEstudiante = 1701310061;
        Date fechaRespuesta = null;
        Time hora = new Time(12, 0, 0);
        int expResult = 0;
        int result = instance.guardarRespuestaInquietud(idInquietud, codigoEstudiante, fechaRespuesta, hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.  
    }
    
    @Test
    public void testGuardarRespuestaInquietudFechaIgualActualHoraMenor() {
        int idInquietud = 3;
        int codigoEstudiante = 1701310061;
        Date fechaRespuestaActual = new Date();
        Time horaMenorActual = new Time(6, 0, 0);
        int expResult = 0;
        int result = instance.guardarRespuestaInquietud(idInquietud, codigoEstudiante, fechaRespuestaActual, horaMenorActual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.  
    }
    
}
