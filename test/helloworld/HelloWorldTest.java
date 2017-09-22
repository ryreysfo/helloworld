/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vagrant
 */
public class HelloWorldTest {
    
    public HelloWorldTest() {
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

//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void helloTest() {
        HelloWorld hello = new HelloWorld("Jack", "Sprat");
        hello.sayHello();
     }
     @Test
     public void getFullNameTest() {
        HelloWorld hello = new HelloWorld("John", "Doe");
        String expected = "John Doe";
        String actual = hello.getFullName();
        assertEquals(expected, actual);
     }
}
