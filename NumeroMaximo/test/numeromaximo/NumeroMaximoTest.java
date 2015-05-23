/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromaximo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alvaromartinez
 */
public class NumeroMaximoTest {
    
    public NumeroMaximoTest() {
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
     * Test of calcularMaximo method, of class NumeroMaximo.
     */
    @Test
    public void testCalcularMaximo() {
        System.out.println("calcularMaximo");
        System.out.println("camino 1 mayor x");
        int x = 6;
        int y = 3;
        int z = 2;
        int expResult = x;
        int result = NumeroMaximo.calcularMaximo(x, y, z);
        assertEquals(expResult, result);
        System.out.println("camino 2 mayor y");
        x = 1;
        y = 5;
        z = 4;
        expResult = y;
        result = NumeroMaximo.calcularMaximo(x, y, z);
        assertEquals(expResult, result);
        System.out.println("camino 3 mayor z");
        x = 2;
        y = 4;
        z = 10;
        expResult = z;
        result = NumeroMaximo.calcularMaximo(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class NumeroMaximo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NumeroMaximo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
