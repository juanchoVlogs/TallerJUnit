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
        System.out.println("camino 1 gerente");
        Empleado miEmpleado = new Empleado("Juan Diego", "Prado", "Gerente", "444226121");
        Nomina instance = new Nomina();
        double expResult = 5000000;
        double result = instance.calcularSueldoBruto(miEmpleado);
        assertEquals(expResult, result, 0.0);
        System.out.println("camino 2 secretaria");
        miEmpleado = new Empleado("Marta", "Prado", "Secretaria", "45026121");
        instance = new Nomina();
        expResult = 1000000;
        result = instance.calcularSueldoBruto(miEmpleado);
        assertEquals(expResult, result, 0.0);
        System.out.println("camino 3 vendedor");
        miEmpleado = new Empleado("Camilo", "Gutierrez", "Vendedor", "444226121");
        instance = new Nomina();
        expResult = 1520000;
        result = instance.calcularSueldoBruto(miEmpleado);
        assertEquals(expResult, result, 0.0);
        System.out.println("camino 4 operador");
        miEmpleado = new Empleado("James", "Prado", "Operador", "444226121");
        instance = new Nomina();
        expResult = 845000;;
        result = instance.calcularSueldoBruto(miEmpleado);
        assertEquals(expResult, result, 0.0);
        System.out.println("camino 5 Jefe planta");
        miEmpleado = new Empleado("Juan Diego", "Prado", "Jefe planta", "444226121");
        instance = new Nomina();
        expResult = 900000;
        result = instance.calcularSueldoBruto(miEmpleado);
        assertEquals(expResult, result, 0.0);
        System.out.println("camino 6 otros casos");
        miEmpleado = new Empleado("Juan Diego", "Prado", "casdcd", "444226121");
        instance = new Nomina();
        expResult = -1;
        result = instance.calcularSueldoBruto(miEmpleado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularSueldoReal method, of class Nomina.
     */
    @Test
    public void testCalcularSueldoReal() {
        System.out.println("calcularSueldoReal ");
        Empleado miEmpleado = new Empleado("Juan Diego", "Prado", "Gerente", "444226121");
        Nomina instance = new Nomina();
        double expResult = 4600000;
        double result = instance.calcularSueldoReal(miEmpleado);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularSueldoEmpleados method, of class Nomina.
     */
    @Test
    public void testCalcularSueldoEmpleados() {
        System.out.println("calcularSueldoEmpleados");
        Empleado miEmpleado1 = new Empleado("Juan Diego", "Prado", "Gerente", "444226121");
        Empleado miEmpleado2 = new Empleado("Camilo", "Prado", "Operador", "444226121");
        Empleado[] listaEmpleados = new Empleado[2];
        listaEmpleados[0] = miEmpleado1;
        listaEmpleados[1] = miEmpleado2;
        Nomina instance = new Nomina();
        double[] expResult = new double[2];
        expResult[0] = 4600000.0;
        expResult[1] = 777400.0;
        double[] result = instance.calcularSueldoEmpleados(listaEmpleados);
        assertArrayEquals(expResult, result, 0);
        System.out.println("Camino 2");
        listaEmpleados = null;
        instance = new Nomina();
        expResult = null;
        result = instance.calcularSueldoEmpleados(listaEmpleados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPromedioSueldos method, of class Nomina.
     */
    @Test
    public void testCalcularPromedioSueldos() {
        System.out.println("calcularPromedioSueldos");
        System.out.println("Camino 1");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0;
        double result = instance.calcularPromedioSueldos(listaEmpleados);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("Camino 2");
        Empleado miEmpleado1 = new Empleado("Juan Diego", "Prado", "Gerente", "444226121");
        Empleado miEmpleado2 = new Empleado("Camilo", "Prado", "Operador", "444226121");
        listaEmpleados = new Empleado[2];
        listaEmpleados[0] = miEmpleado1;
        listaEmpleados[1] = miEmpleado2;
        instance = new Nomina();
        expResult = 2688700;
        result = instance.calcularPromedioSueldos(listaEmpleados);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of obtenerIdEmplados method, of class Nomina.
     */
    @Test
    public void testObtenerIdEmplados() {
        System.out.println("obtenerIdEmplados");
        System.out.println("Camino 1");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        String[] expResult = null;
        String[] result = instance.obtenerIdEmplados(listaEmpleados);
        assertArrayEquals(expResult, result);
        //fail("The test case is a prototype.");
        System.out.println("Camino 2");
        Empleado miEmpleado1 = new Empleado("Juan Diego", "Prado", "Gerente", "444226121");
        Empleado miEmpleado2 = new Empleado("Camilo", "Prado", "Operador", "112120142");
        listaEmpleados = new Empleado[2];
        listaEmpleados[0] = miEmpleado1;
        listaEmpleados[1] = miEmpleado2;
        instance = new Nomina();
        expResult = new String[2];
        expResult[0] = "444226121";
        expResult[1] = "112120142";
        result = instance.obtenerIdEmplados(listaEmpleados);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcularTotalAPagar method, of class Nomina.
     */
    @Test
    public void testCalcularTotalAPagar() {
        System.out.println("calcularTotalAPagar");
        System.out.println("Camino 1");
        Empleado[] listaEmpleados = null;
        Nomina instance = new Nomina();
        double expResult = 0.0;
        double result = instance.calcularTotalAPagar(listaEmpleados);
        assertEquals(expResult, result, 0.0);
        System.out.println("Camino 2");
        Empleado miEmpleado1 = new Empleado("Juan Diego", "Prado", "Gerente", "444226121");
        Empleado miEmpleado2 = new Empleado("Camilo", "Prado", "Operador", "112120142");
        listaEmpleados = new Empleado[2];
        listaEmpleados[0] = miEmpleado1;
        listaEmpleados[1] = miEmpleado2;
        instance = new Nomina();
        expResult = 5845000;
        result = instance.calcularTotalAPagar(listaEmpleados);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
