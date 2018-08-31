/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.CRUDEntidades;

import Modelos.Entidades.Pregunta;
import Modelos.Entidades.Respuesta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author JulianCamilo
 */
public class CRUDRespuestaTest {
    
    public CRUDRespuestaTest() {
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
     * Test of registrarRespuesta method, of class CRUDRespuesta.
     * Caso de prueba para verificar que el sistema responde como deberia
     * ante un ingreso indebido de una respuesta
     */
    @Test
    public void testRegistrarRespuestaFallido() {
        System.out.println("registrarRespuesta");
        Respuesta r = new Respuesta(0, "nada-23-", 'F');
        Pregunta p = new Pregunta();
        CRUDRespuesta instance = new CRUDRespuesta();
        int expResult = 0;
        int result = instance.registrarRespuesta(r, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarRespuesta method, of class CRUDRespuesta.
     * Se desea comprobar que el sistema borra correctamente una respuesta
     */
    @Test
    public void testEliminarRespuestaCorrecta() {
        System.out.println("eliminarRespuesta");
        int idRespuesta = 23;
        CRUDRespuesta instance = new CRUDRespuesta();
        int expResult = 1;
        int result = instance.eliminarRespuesta(idRespuesta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editarPregunta method, of class CRUDRespuesta.
     */
    @Ignore
    public void testEditarPregunta() {
        System.out.println("editarPregunta");
        Respuesta r = null;
        Pregunta p = null;
        int idRespuesta = 0;
        CRUDRespuesta instance = new CRUDRespuesta();
        int expResult = 0;
        int result = instance.editarPregunta(r, p, idRespuesta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarRespuesta method, of class CRUDRespuesta.
     * Se desea probar que al introducir un id de respuesta inexistente, el sistema responde
     * correctamente
     */
    @Test
    public void testSeleccionarRespuestaFallido() {
        System.out.println("seleccionarRespuesta");
        int idRespuesta = 0;
        CRUDRespuesta instance = new CRUDRespuesta();
        Respuesta expResult = null;
        Respuesta result = instance.seleccionarRespuesta(idRespuesta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
