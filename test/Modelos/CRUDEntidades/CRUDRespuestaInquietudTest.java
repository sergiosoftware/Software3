/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

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
public class CRUDRespuestaInquietudTest {
    
    public CRUDRespuestaInquietudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of guardar method, of class CRUDRespuestaInquietud.
     */
    @Test
    public void testGuardarFallido() {
        System.out.println("guardar");
        int idInquietud = 1234;
        int codigoEstudiante = 4321;
        int idRespuesta = 1;
        String respuesta = "Martes 10 pm";
        CRUDRespuestaInquietud instance = new CRUDRespuestaInquietud();
        boolean expResult = false;
        boolean result = instance.guardar(idInquietud, codigoEstudiante, idRespuesta, respuesta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class CRUDRespuestaInquietud.
     */
    @Test
    public void testActualizarCorrecto() {
        System.out.println("actualizar");
        int idInquietud = 1234;
        boolean cambiadoA = true;
        CRUDRespuestaInquietud instance = new CRUDRespuestaInquietud();
        boolean expResult = true;
        boolean result = instance.actualizar(idInquietud, cambiadoA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
