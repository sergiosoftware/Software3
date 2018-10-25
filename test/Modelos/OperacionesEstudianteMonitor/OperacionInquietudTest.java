/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.Entidades.Inquietud;
import java.util.List;
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
public class OperacionInquietudTest {
    
    
    OperacionInquietud instance;
    public OperacionInquietudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new OperacionInquietud();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Prueba ingresando una inquietud normal
     */
    @Test
    public void testPublicarInquietudCorrecta() {
        System.out.println("crear inquietud");
        int codigoestudiante = 1701311587;
        String codigoasignatura = "G8F0080";
        String tema = "Ipv6";
        String descp = "Ayuda Taller de ipv6";
        
        int expResult = 1;
        int result = instance.crearinquietud(codigoestudiante, codigoasignatura, tema, descp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    //Prueba tratar de ingresar una inquietud sin asignatura
    @Test
    public void testPublicarInquietudAsignaturaNull() {
        System.out.println("inquietud asignatura null");
        int codigoestudiante = 1701310061;
        String codigoasignatura = null;
        String tema = "Derivadas";
        String descp = "Ayuda repaso taller";
        
        int expResult = 0;
        int result = instance.crearinquietud(codigoestudiante, codigoasignatura, tema, descp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    //Prueba tratar de ingresar una inquietud de una asignatura no registrada
    @Test
    public void testPublicarInquietudAsignaturanoRegistrada() {
        System.out.println("inquietud asignatura no registrada");
        int codigoestudiante = 1701321242;
        String codigoasignatura = "G8F0079";
        String tema = "Triggers";
        String descp = "Cuando uso cursor explicito?";
        
        int expResult = 0;
        int result = instance.crearinquietud(codigoestudiante, codigoasignatura, tema, descp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of verinquietud method, of class OperacionInquietud.
     */
    @Ignore
    public void testVerinquietud() {
        System.out.println("verinquietud");
        int codigoinquietud = 0;
        OperacionInquietud instance = new OperacionInquietud();
        Inquietud expResult = null;
        Inquietud result = instance.verinquietud(codigoinquietud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarinquietud method, of class OperacionInquietud.
     */
    @Ignore
    public void testEliminarinquietud() {
        System.out.println("eliminarinquietud");
        int idinquietud = 0;
        OperacionInquietud instance = new OperacionInquietud();
        int expResult = 0;
        int result = instance.eliminarinquietud(idinquietud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class OperacionInquietud.
     */
    @Ignore
    public void testModificar() {
        System.out.println("modificar");
        int idinquietud = 0;
        int codigoestudiante = 0;
        String codigoasignatura = "";
        String tema = "";
        String descp = "";
        OperacionInquietud instance = new OperacionInquietud();
        int expResult = 0;
        int result = instance.modificar(idinquietud, codigoestudiante, codigoasignatura, tema, descp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarTodas method, of class OperacionInquietud.
     */
    @Ignore
    public void testConsultarTodas() {
        System.out.println("consultarTodas");
        OperacionInquietud instance = new OperacionInquietud();
        List<Inquietud> expResult = null;
        List<Inquietud> result = instance.consultarTodas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
