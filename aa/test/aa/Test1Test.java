/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package aa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author davsan03
 */
public class Test1Test {
    
    public Test1Test() {
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
     * Test of multiplica method, of class Test1.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 0;
        int b = 0;
        Test1 instance = new Test1();
        int expResult = 0;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Test1.
     */
    @Ignore
    @Test
     public void testMain() {
        System.out.println("main");
        String[] args = null;
        Test1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 
      @Test(timeout=1)
    public void testMultiplicaTimeOut() {
        System.out.println("multiplica");
        int a = 15000;
        int b = 15000;
        Test1 instance = new Test1();
        int expResult = 0;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
