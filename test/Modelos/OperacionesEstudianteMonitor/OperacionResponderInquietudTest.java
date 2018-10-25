/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import java.sql.Time;
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
        System.out.println("guardarRespuestaInquietud");
        int idInquietud = 1;
        int codigoEstudiante = 1701122317;
        Date fechaRespuesta = new Date(2018, 9, 30);
        Time hora = new Time(9, 0, 0);
        int expResult = 1;
        int result = instance.guardarRespuestaInquietud(idInquietud, codigoEstudiante, fechaRespuesta, hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.  
    }
    
    /**
     * Prueba para responder una pregunta fecha null
     */
    @Test
    public void testGuardarRespuestaInquietudFechaNull() {
        System.out.println("fecha null");
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
        System.out.println("fecha igual hora mayor");
        int idInquietud = 3;
        int codigoEstudiante = 1701310061;
        Date fechaRespuesta = new java.sql.Date(2018, 9, 14);
        Time hora = new Time(23, 0, 0);
        int expResult = 0;
        int result = instance.guardarRespuestaInquietud(idInquietud, codigoEstudiante, fechaRespuesta, hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.  
    }
    
}
