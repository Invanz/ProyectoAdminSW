/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProductoControllerTest {
    
    public ProductoControllerTest() {
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
     * Test of init method, of class ProductoController.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        ProductoController instance = new ProductoController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        ProductoController instance = new ProductoController();
        instance.init();
        
        boolean result = instance.guardarProducto();
        boolean expResult=true;
        assertEquals(expResult, result);
        if(result!=expResult)
            fail("Error al guardar producto.");
    }

    /**
     * Test of cargarListas method, of class ProductoController.
     */
    @Test
    public void testCargarListas() {
        System.out.println("cargarListas");
        ProductoController instance = new ProductoController();
        instance.cargarListas();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarProductoxID method, of class ProductoController.
     */
    @Test
    public void testConsultarProductoxID() {
        System.out.println("consultarProductoxID");
        ProductoController instance = new ProductoController();
        instance.consultarProductoxID();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardarProducto method, of class ProductoController.
     */
    @Test
    public void testGuardarProducto() {
        System.out.println("guardarProducto");
        ProductoController instance = new ProductoController();
        boolean expResult = true;
        boolean result = instance.guardarProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
