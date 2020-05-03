/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.beans;

import java.util.List;
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
public class AnimalIdTest {
    
    public AnimalIdTest() {
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
     * Test of getLatinName method, of class AnimalId.
     */
    @Test
    public void testGetLatinName() {
        System.out.println("getLatinName");
        AnimalId instance = new AnimalId();
        String expResult = "";
        instance.setLatinName(expResult);
        String result = instance.getLatinName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLatinName method, of class AnimalId.
     */
    @Test
    public void testSetLatinName() {
        System.out.println("setLatinName");
        String latinName = "";
        AnimalId instance = new AnimalId();
        instance.setLatinName(latinName);
    }

    /**
     * Test of getAnimalName method, of class AnimalId.
     */
    @Test
    public void testGetAnimalName() {
        System.out.println("getAnimalName");
        AnimalId instance = new AnimalId();
        String expResult = "";
        instance.setAnimalName(expResult);
        String result = instance.getAnimalName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAnimalName method, of class AnimalId.
     */
    @Test
    public void testSetAnimalName() {
        System.out.println("setAnimalName");
        String animalName = "";
        AnimalId instance = new AnimalId();
        instance.setAnimalName(animalName);
    }

    /**
     * Test of equals method, of class AnimalId.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        AnimalId instance = new AnimalId();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
    }
    
}
