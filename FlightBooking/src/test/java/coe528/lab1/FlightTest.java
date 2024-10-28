/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eddy Perez Macias
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getflightNum method, of class Flight.
     */
    
    
    
    @Test
    public void testConstructor() {
        // Arrange
        // Replace yourArguments with valid arguments for your Flight constructor
        int flightNum = 123;
        String origin = "Origin";
        String destination = "Destination";
        String depTime = "12:00 PM";
        int cap = 150;
        int numSeatsL = 50;
        double originalPrice = 200.0;

        
        Flight instance = new Flight(flightNum, origin, destination, depTime, cap, originalPrice);

        
        assertNotNull(instance);
        
    }
    
     @Test
    public void testInvalidConstructor() {
        
        int invalidFlightNum = -1;
        String origin = "Origin";
        String destination = "Destination";
        String depTime = "12:00 PM";
        int cap = 150;
        int numSeatsL = 50;
        double originalPrice = 200.0;

        
        assertThrows(IllegalArgumentException.class, () -> {
            new Flight(invalidFlightNum, origin, destination, depTime, cap, originalPrice);
        });
    }
    
    @Test
    public void testGetflightNum() {
        System.out.println("getflightNum");
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        int expResult = 2468;
        int result = instance.getflightNum();
        assertEquals(expResult, result);
    }

    /**
     * Test of setflightNum method, of class Flight.
     */
    @Test
    public void testSetflightNum() {
        System.out.println("setflightNum");
        int flightnum = 1234;
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        instance.setflightNum(flightnum);
        int expResult = 1234;
        int result = instance.getflightNum();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String ori = "Madagascar";
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        instance.setOrigin(ori);
        String expResult = "Madagascar";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getdestination method, of class Flight.
     */
    @Test
    public void testGetdestination() {
        System.out.println("getdestination");
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        String expResult = "New York";
        String result = instance.getdestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of setdestination method, of class Flight.
     */
    @Test
    public void testSetdestination() {
        System.out.println("setdestination");
        String des = "Florida";
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        instance.setdestination(des);
        String expResult = "Florida";
        String result = instance.getdestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getdepTime method, of class Flight.
     */
    @Test
    public void testGetdepTime() {
        System.out.println("getdepTime");
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        String expResult = "08/12/24 2:00 am";
        String result = instance.getdepTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setdepTime method, of class Flight.
     */
    @Test
    public void testSetdepTime() {
        System.out.println("setdepTime");
        String depTime = "crazy";
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        instance.setdepTime(depTime);
        String expResult = "crazy";
        String result = instance.getdepTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getcap method, of class Flight.
     */
    @Test
    public void testGetcap() {
        System.out.println("getcap");
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        int expResult = 200;
        int result = instance.getcap();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setcap method, of class Flight.
     */
    @Test
    public void testSetcap() {
        System.out.println("setcap");
        int cap = 300;
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        instance.setcap(cap);
        int expResult = 300;
        int result = instance.getcap();
        assertEquals(expResult, result);
    }

    /**
     * Test of getnumOfSeatsL method, of class Flight.
     */
    @Test
    public void testGetnumOfSeatsL() {
        System.out.println("getnumOfSeatsL");
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        int expResult = 200;
        int result = instance.getnumOfSeatsL();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setnumOfSeatsL method, of class Flight.
     */
    @Test
    public void testSetnumOfSeatsL() {
        System.out.println("setnumOfSeatsL");
        int numOSL = 80;
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        instance.setnumOfSeatsL(numOSL);
        int expResult = 80;
        int result = instance.getnumOfSeatsL();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance =new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        double expResult = 500.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double oriPrice = 300.0;
        Flight instance = new Flight(2468, "Toronto", "New York", "08/12/24 2:00 am", 200, 500);
        instance.setOriginalPrice(oriPrice);
        double expResult = 300.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);
    }

   
    
}
