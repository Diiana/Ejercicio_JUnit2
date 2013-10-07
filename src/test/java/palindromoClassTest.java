/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana
 */
public class palindromoClassTest {
    
    public palindromoClassTest() {
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

     @Test
    public void testGetSuma() {
        System.out.println("test: getSuma");
        palindromoClass oPalindromoClass = new palindromoClass();
        assertNotNull("objeto palindromo creado", oPalindromoClass);
        assertEquals("Debe devolver oso", oPalindromoClass.getPalindromo("oso"), "oso");
        assertTrue("Debe devolver oso", "oso" == oPalindromoClass.getPalindromo("oso"));
        if ("oso" != oPalindromoClass.getPalindromo("oso")) {
            fail("Debe devolver oso");
        }
        assertSame("prueba getReference", oPalindromoClass, oPalindromoClass.getReference());
        palindromoClass palindromoClass2 = new palindromoClass();
        assertNotSame("no son el mismo objeto", oPalindromoClass, palindromoClass2);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
