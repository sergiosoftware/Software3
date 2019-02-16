/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.OperacionesEstudianteMonitor;

import Modelos.Entidades.Inquietud;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
        

/**
 * Test's operaciones inquietud
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
     * Prueba ingresando una inquietud normal(el id es 7 porque segun la conf
     * previa ya existen 6)
     */
    @Test
    public void testPublicarInquietudCorrecta() {
        int idInquietud = 7;
        int codigoestudiante = 1701311587;
        String codigoasignatura = "G8F0080";
        String tema = "Ipv6";
        String descp = "Ayuda Taller de ipv6";
        Inquietud inquietudCreada = new Inquietud(codigoestudiante, codigoasignatura, tema, descp);
        int expResult = 1;
        int result = instance.crearinquietud(codigoestudiante, codigoasignatura, tema, descp);
        Inquietud inquietudGuardada = instance.verinquietud(idInquietud);
        assertEquals(expResult, result);
        assertEquals(inquietudCreada.getCodigoEstudiante(), inquietudGuardada.getCodigoEstudiante());
        assertEquals(inquietudCreada.getCodigoidAsignatura(), inquietudGuardada.getCodigoidAsignatura());
        assertEquals(inquietudCreada.getDescripcion(), inquietudGuardada.getDescripcion());
        assertEquals(inquietudCreada.getTema(), inquietudGuardada.getTema());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Prueba tratar de ingresar una inquietud sin indicar la asignatura para la cual pertenece
     */
    @Test
    public void testPublicarInquietudAsignaturaNull() {
        int codigoestudiante = 1701310061;
        String codigoasignatura = null;
        String tema = "Derivadas";
        String descp = "Ayuda repaso taller";
        int expResult = 0;
        int result = instance.crearinquietud(codigoestudiante, codigoasignatura, tema, descp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Prueba tratar de ingresar una inquietud de una asignatura no registrada
     */
    @Test
    public void testPublicarInquietudAsignaturaNoRegistrada() {
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
     * Prueba Reporte Inquietudes frecuentes por asignatura
     *
     */
    @Test
    public void testReporteInquietudesFrecuentesAsignatura() {
        String idAsignatura = "G8F0071";
        Inquietud inquietud1 = new Inquietud(3, idAsignatura, "Derivada Implicita", "que es eso");
        Inquietud inquietud2 = new Inquietud(4, idAsignatura, "Derivada parcial", "repaso parcial");
        Inquietud inquietud3 = new Inquietud(5, idAsignatura, "ipv6", "rip y ospf");
        Inquietud inquietud4 = new Inquietud(6, idAsignatura, "Invariantes", "Me varia el invariante");
        List<Inquietud> inquietudes = new ArrayList<>();
        inquietudes.add(inquietud1);
        inquietudes.add(inquietud2);
        inquietudes.add(inquietud3);
        inquietudes.add(inquietud4);

        List reporteGenerado = instance.generarReporte(idAsignatura,"");
//        assertArrayEquals(inquietudes.toArray(), reporteGenerado.toArray());
        assertEquals(inquietudes.size(), reporteGenerado.size(), 0);
    }

    /**
     * Prueba Reporte Inquietudes frecuentes por asignatura y tema
     */
    @Test
    public void testReporteInquietudesFrecuentesAsignaturaTema() {
        String idAsignatura = "G8F0071";
        String tema = "Derivada";
        Inquietud inquietud1 = new Inquietud(3, idAsignatura, "Derivada Implicita", "que es eso");
        Inquietud inquietud2 = new Inquietud(4, idAsignatura, "Derivada parcial", "repaso parcial");
        List<Inquietud> inquietudes= new ArrayList<>();
        inquietudes.add(inquietud1);
        inquietudes.add(inquietud2);
        List<Inquietud> reporteGenerado = instance.generarReporte(idAsignatura, tema);
        assertArrayEquals(inquietudes.toArray(), reporteGenerado.toArray());
        assertEquals(reporteGenerado.size(), inquietudes.size(), 0);
    }

    /**
     * Prueba Reporte Inquietudes frecuentes sin indicar la asignatura
     */
    @Test
    public void testReporteInquietudesFrecuentesAsignaturaVacia() {
        String idAsignatura = "";
        List inquietudes = null;
        List reporteGenerado = instance.generarReporte(idAsignatura,"");
        assertEquals(inquietudes, reporteGenerado);
    }

    /**
     * Test of verinquietud method, of class OperacionInquietud.
     */
    @Ignore
    public void testVerinquietud() {
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
        OperacionInquietud instance = new OperacionInquietud();
        List<Inquietud> expResult = null;
        List<Inquietud> result = instance.consultarTodas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
