/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liz
 */
public class AccommodationTest {
    
    public AccommodationTest() {
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
     * Test of getIdentity method, of class Accommodation.
     */
    @Test
    public void testGetIdentity() {
        System.out.println("getIdentity");
        Accommodation instance = new Accommodation();
        String expResult = "Mammals 1";
        String area = "Mammals";
        int number = 1;
        instance.setArea(area);
        instance.setNumber(number);
        String result = instance.getIdentity();
        assertEquals(expResult, result);
        }

    /**
     * Test of getAccommId method, of class Accommodation.
     */
    @Test
    public void testGetAccommId() {
        System.out.println("getAccommId");
        Accommodation instance = new Accommodation();
        int expResult = 1;
        instance.setAccommId(1);
        int result = instance.getAccommId();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setAccommId method, of class Accommodation.
     */
    @Test
    public void testSetAccommId() {
        System.out.println("setAccommId");
        int accommId = 2;
        Accommodation instance = new Accommodation();
        instance.setAccommId(accommId);
        int result = instance.getAccommId();
        int expResult = 2;
        assertEquals(expResult, result);
    }

    /**
     * Test of getArea method, of class Accommodation.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Accommodation instance = new Accommodation();
        String expResult = "Mammals";
        instance.setArea("Mammals");
        String result = instance.getArea();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArea method, of class Accommodation.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        String area = "Mammals";
        Accommodation instance = new Accommodation();
        String expResult = "Mammals";
        instance.setArea(area);
        String result = instance.getArea();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumber method, of class Accommodation.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Accommodation instance = new Accommodation();
        Integer expResult = 1;
        instance.setNumber(1);
        Integer result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class Accommodation.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        Integer number = 1;
        Accommodation instance = new Accommodation();
        instance.setNumber(number);
    }
    
}
