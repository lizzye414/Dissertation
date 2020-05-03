/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Liz
 */
public class SpeciesTest {
    
    public SpeciesTest() {
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
     * Test of getLatinName method, of class Species.
     */
    @Test
    public void testGetLatinName() {
        System.out.println("getLatinName");
        Species instance = new Species();
        instance.setLatinName("Canis lupus");
        String expResult = "Canis lupus";
        String result = instance.getLatinName();
        Species instance2 = new Species();
        instance2.setLatinName("Rattus rattus");
        String expResult2 = "Canis lupus";
        String result2 = instance2.getLatinName();
        assertEquals(expResult, result);
        assertNotEquals(expResult2, result2);
    }

    /**
     * Test of setLatinName method, of class Species.
     */
    @Test
    public void testSetLatinName() {
        System.out.println("setLatinName");
        String latinName = "Canis lupus";
        Species instance = new Species();
        instance.setLatinName(latinName);
        assertEquals(latinName, instance.getLatinName());
    }

    /**
     * Test of getCleaning method, of class Species.
     */
    @Test
    public void testGetCleaning() {
        System.out.println("getCleaning");
        Species instance = new Species();
        Cleaning cleaning = new Cleaning(1);
        instance.setCleaning(cleaning);
        Cleaning expResult = cleaning;
        Cleaning result = instance.getCleaning();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCleaning method, of class Species.
     */
    @Test
    public void testSetCleaning() {
        System.out.println("setCleaning");
        Cleaning cleaning = new Cleaning(1);
        Species instance = new Species();
        instance.setCleaning(cleaning);
        assertEquals(cleaning, instance.getCleaning());
    }

    /**
     * Test of getFeeding method, of class Species.
     */
    @Test
    public void testGetFeeding() {
        System.out.println("getFeeding");
        Species instance = new Species();
        Feeding feeding = new Feeding(1);
        instance.setFeeding(feeding);
        Feeding expResult = feeding;
        Feeding result = instance.getFeeding();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFeeding method, of class Species.
     */
    @Test
    public void testSetFeeding() {
        System.out.println("setFeeding");
        Feeding feeding = new Feeding(2);
        Species instance = new Species();
        instance.setFeeding(feeding);
        assertEquals(feeding, instance.getFeeding());
    }

    /**
     * Test of getCommonName method, of class Species.
     */
    @Test
    public void testGetCommonName() {
        System.out.println("getCommonName");
        Species instance = new Species();
        instance.setCommonName("Bob");
        String expResult = "Bob";
        String result = instance.getCommonName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCommonName method, of class Species.
     */
    @Test
    public void testSetCommonName() {
        System.out.println("setCommonName");
        String commonName = "Fred";
        Species instance = new Species();
        instance.setCommonName(commonName);
        assertEquals("Fred", instance.getCommonName());
    }

    /**
     * Test of getInfo method, of class Species.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        Species instance = new Species();
        String expResult = null;
        String result = instance.getInfo();
        assertEquals(expResult, result);

    }

    /**
     * Test of setInfo method, of class Species.
     */
    @Test
    public void testSetInfo() {
        System.out.println("setInfo");
        String info = "Some info";
        Species instance = new Species();
        instance.setInfo(info);
        assertEquals("Some info", instance.getInfo());
    }

    /**
     * Test of getAnimals method, of class Species.
     */
    @Test
    public void testGetAnimals() {
        System.out.println("getAnimals");
        Species instance = new Species();
        Set<Animal> animals = new HashSet<>();
        AnimalId animalId1 = new AnimalId("Canis lupus", "James");
        AnimalId animalId2 = new AnimalId("Gorilla gorilla", "Rambo");
        Animal animal1 = new Animal(animalId1);
        Animal animal2 = new Animal(animalId2);
        animals.add(animal1);
        animals.add(animal2);
        instance.setAnimals(animals);
        Set expResult = animals;
        Set result = instance.getAnimals();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAnimals method, of class Species.
     */
    @Test
    public void testSetAnimals() {
        System.out.println("setAnimals");
        Set animals = null;
        Species instance = new Species();
        instance.setAnimals(animals);
    }

    /**
     * Test of saveSpecies method, of class Species.
     */
    @Test
    public void testSaveSpecies() {
        System.out.println("saveSpecies");
        Species instance = new Species();
        String expResult = "CentreMgt";
        String result = instance.saveSpecies();
        assertEquals(expResult, result);

    }

    /**
     * Test of hashCode method, of class Species.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Species instance = new Species();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Species.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Species instance = new Species();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }
    
}
