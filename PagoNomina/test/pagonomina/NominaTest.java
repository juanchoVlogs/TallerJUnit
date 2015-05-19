/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagonomina;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alvaroms
 */
public class NominaTest {
    
    public NominaTest() {
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
     * Test of calcularSueldoBruto method, of class Nomina.
     */
    @Test
    public void testCalcularSueldoBruto() {
        System.out.println("calcularSueldoBruto");
        Empleado miEmpleado = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularSueldoBruto(miEmpleado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSueldoReal method, of class Nomina.
     */
    @Test
    public void testCalcularSueldoReal() {
        System.out.println("calcularSueldoReal");
        Empleado miEmpleado = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularSueldoReal(miEmpleado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSueldoEmpleados method, of class Nomina.
     */
    @Test
    public void testCalcularSueldoEmpleados() {
        System.out.println("calcularSueldoEmpleados");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularSueldoEmpleados(listaEmpleados);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPromedioSueldos method, of class Nomina.
     */
    @Test
    public void testCalcularPromedioSueldos() {
        System.out.println("calcularPromedioSueldos");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularPromedioSueldos(listaEmpleados);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerIdEmplados method, of class Nomina.
     */
    @Test
    public void testObtenerIdEmplados() {
        System.out.println("obtenerIdEmplados");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        String[] expResult = null;
        String[] result = instance.obtenerIdEmplados(listaEmpleados);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalAPagar method, of class Nomina.
     */
    @Test
    public void testCalcularTotalAPagar() {
        System.out.println("calcularTotalAPagar");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularTotalAPagar(listaEmpleados);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEmpleadoGanaMenos method, of class Nomina.
     */
    @Test
    public void testObtenerEmpleadoGanaMenos() {
        System.out.println("obtenerEmpleadoGanaMenos");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        String expResult = "";
        String result = instance.obtenerEmpleadoGanaMenos(listaEmpleados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
