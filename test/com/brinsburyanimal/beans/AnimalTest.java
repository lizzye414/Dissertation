/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.beans;

import java.util.Date;
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
public class AnimalTest {
    
    public AnimalTest() {
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
     * Test of getId method, of class Animal.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Animal instance = new Animal();
        AnimalId expResult = null;
        AnimalId result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Animal.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        AnimalId id = null;
        Animal instance = new Animal();
        instance.setId(id);
    }

    /**
     * Test of getAccommodation method, of class Animal.
     */
    @Test
    public void testGetAccommodation() {
        System.out.println("getAccommodation");
        Animal instance = new Animal();
        Accommodation expResult = null;
        Accommodation result = instance.getAccommodation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccommodation method, of class Animal.
     */
    @Test
    public void testSetAccommodation() {
        System.out.println("setAccommodation");
        Accommodation accommodation = null;
        Animal instance = new Animal();
        instance.setAccommodation(accommodation);
    }

    /**
     * Test of getSpecies method, of class Animal.
     */
    @Test
    public void testGetSpecies() {
        System.out.println("getSpecies");
        Animal instance = new Animal();
        Species expResult = null;
        Species result = instance.getSpecies();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSpecies method, of class Animal.
     */
    @Test
    public void testSetSpecies() {
        System.out.println("setSpecies");
        Species species = null;
        Animal instance = new Animal();
        instance.setSpecies(species);
    }

    /**
     * Test of getIdNo method, of class Animal.
     */
    @Test
    public void testGetIdNo() {
        System.out.println("getIdNo");
        Animal instance = new Animal();
        String expResult = "";
        instance.setIdNo(expResult);
        String result = instance.getIdNo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdNo method, of class Animal.
     */
    @Test
    public void testSetIdNo() {
        System.out.println("setIdNo");
        String idNo = "";
        Animal instance = new Animal();
        instance.setIdNo(idNo);
    }

    /**
     * Test of getDob method, of class Animal.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Animal instance = new Animal();
        Date expResult = null;
        Date result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDob method, of class Animal.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        Date dob = null;
        Animal instance = new Animal();
        instance.setDob(dob);
    }

    /**
     * Test of getSex method, of class Animal.
     */
    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Animal instance = new Animal();
        String expResult = "";
        instance.setSex(expResult);
        String result = instance.getSex();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSex method, of class Animal.
     */
    @Test
    public void testSetSex() {
        System.out.println("setSex");
        String sex = "";
        Animal instance = new Animal();
        instance.setSex(sex);
    }

    /**
     * Test of getDistFeatures method, of class Animal.
     */
    @Test
    public void testGetDistFeatures() {
        System.out.println("getDistFeatures");
        Animal instance = new Animal();
        String expResult = "";
        instance.setDistFeatures(expResult);
        String result = instance.getDistFeatures();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDistFeatures method, of class Animal.
     */
    @Test
    public void testSetDistFeatures() {
        System.out.println("setDistFeatures");
        String distFeatures = "";
        Animal instance = new Animal();
        instance.setDistFeatures(distFeatures);
    }

    /**
     * Test of getLatinName method, of class Animal.
     */
    @Test
    public void testGetLatinName() {
        System.out.println("getLatinName");
        Animal instance = new Animal();
        String expResult = "";
        instance.setLatinName(expResult);
        String result = instance.getLatinName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLatinName method, of class Animal.
     */
    @Test
    public void testSetLatinName() {
        System.out.println("setLatinName");
        String latinName = "";
        Animal instance = new Animal();
        instance.setLatinName(latinName);
    }

    /**
     * Test of getAnimalName method, of class Animal.
     */
    @Test
    public void testGetAnimalName() {
        System.out.println("getAnimalName");
        Animal instance = new Animal();
        String expResult = "";
        instance.setAnimalName(expResult);
        String result = instance.getAnimalName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAnimalName method, of class Animal.
     */
    @Test
    public void testSetAnimalName() {
        System.out.println("setAnimalName");
        String animalName = "";
        Animal instance = new Animal();
        instance.setAnimalName(animalName);
    }

    /**
     * Test of getInCollection method, of class Animal.
     */
    @Test
    public void testGetInCollection() {
        System.out.println("getInCollection");
        Animal instance = new Animal();
        Boolean expResult = true;
        Boolean result = instance.getInCollection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInCollection method, of class Animal.
     */
    @Test
    public void testSetInCollection() {
        System.out.println("setInCollection");
        Boolean inCollection = null;
        Animal instance = new Animal();
        instance.setInCollection(inCollection);
    }

    /**
     * Test of getSloughs method, of class Animal.
     */
    @Test
    public void testGetSloughs() {
        System.out.println("getSloughs");
        Animal instance = new Animal();
        Set expResult = null;
        instance.setSloughs(expResult);
        Set result = instance.getSloughs();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSloughs method, of class Animal.
     */
    @Test
    public void testSetSloughs() {
        System.out.println("setSloughs");
        Set sloughs = null;
        Animal instance = new Animal();
        instance.setSloughs(sloughs);
    }

    /**
     * Test of getHealthChecks method, of class Animal.
     */
    @Test
    public void testGetHealthChecks() {
        System.out.println("getHealthChecks");
        Animal instance = new Animal();
        Set expResult = null;
        instance.setHealthChecks(expResult);
        Set result = instance.getHealthChecks();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHealthChecks method, of class Animal.
     */
    @Test
    public void testSetHealthChecks() {
        System.out.println("setHealthChecks");
        Set healthChecks = null;
        Animal instance = new Animal();
        instance.setHealthChecks(healthChecks);
    }

    /**
     * Test of hashCode method, of class Animal.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Animal instance = new Animal();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Animal.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Animal instance = new Animal();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }
    
}
