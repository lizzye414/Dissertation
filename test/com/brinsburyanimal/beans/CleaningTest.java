/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.beans;

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
 * @author eliza
 */
public class CleaningTest {
    
    public CleaningTest() {
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
     * Test of getCleaningId method, of class Cleaning.
     */
    @Test
    public void testGetCleaningId() {
        System.out.println("getCleaningId");
        Cleaning instance = new Cleaning();
        int expResult = 0;
        instance.setCleaningId(expResult);
        int result = instance.getCleaningId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCleaningId method, of class Cleaning.
     */
    @Test
    public void testSetCleaningId() {
        System.out.println("setCleaningId");
        int cleaningId = 0;
        Cleaning instance = new Cleaning();
        instance.setCleaningId(cleaningId);
    }

    /**
     * Test of getDescript method, of class Cleaning.
     */
    @Test
    public void testGetDescript() {
        System.out.println("getDescript");
        Cleaning instance = new Cleaning();
        String expResult = "";
        instance.setDescript(expResult);
        String result = instance.getDescript();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescript method, of class Cleaning.
     */
    @Test
    public void testSetDescript() {
        System.out.println("setDescript");
        String descript = "";
        Cleaning instance = new Cleaning();
        instance.setDescript(descript);
    }

    /**
     * Test of getSpecieses method, of class Cleaning.
     */
    @Test
    public void testGetSpecieses() {
        System.out.println("getSpecieses");
        Cleaning instance = new Cleaning();
        Set expResult = null;
        instance.setSpecieses(expResult);
        Set result = instance.getSpecieses();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSpecieses method, of class Cleaning.
     */
    @Test
    public void testSetSpecieses() {
        System.out.println("setSpecieses");
        Set specieses = null;
        Cleaning instance = new Cleaning();
        instance.setSpecieses(specieses);
    }

    /**
     * Test of hashCode method, of class Cleaning.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Cleaning instance = new Cleaning();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Cleaning.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Cleaning instance = new Cleaning();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }
    
}
