/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.beans;

import java.util.Date;
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
public class HealthCheckIdTest {
    
    public HealthCheckIdTest() {
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
     * Test of getLatinName method, of class HealthCheckId.
     */
    @Test
    public void testGetLatinName() {
        System.out.println("getLatinName");
        HealthCheckId instance = new HealthCheckId();
        String expResult = "Canis lupus";
        instance.setLatinName(expResult);
        String result = instance.getLatinName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLatinName method, of class HealthCheckId.
     */
    @Test
    public void testSetLatinName() {
        System.out.println("setLatinName");
        String latinName = "";
        HealthCheckId instance = new HealthCheckId();
        instance.setLatinName(latinName);
    }

    /**
     * Test of getAnimalName method, of class HealthCheckId.
     */
    @Test
    public void testGetAnimalName() {
        System.out.println("getAnimalName");
        HealthCheckId instance = new HealthCheckId();
        String expResult = "Bob";
        instance.setAnimalName(expResult);
        String result = instance.getAnimalName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAnimalName method, of class HealthCheckId.
     */
    @Test
    public void testSetAnimalName() {
        System.out.println("setAnimalName");
        String animalName = "";
        HealthCheckId instance = new HealthCheckId();
        instance.setAnimalName(animalName);
    }

    /**
     * Test of getRecordDate method, of class HealthCheckId.
     */
    @Test
    public void testGetRecordDate() {
        System.out.println("getRecordDate");
        HealthCheckId instance = new HealthCheckId();
        Date expResult = null;
        instance.setRecordDate(expResult);
        Date result = instance.getRecordDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecordDate method, of class HealthCheckId.
     */
    @Test
    public void testSetRecordDate() {
        System.out.println("setRecordDate");
        Date recordDate = null;
        HealthCheckId instance = new HealthCheckId();
        instance.setRecordDate(recordDate);
    }
   
}
