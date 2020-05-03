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
public class BirdMammalRecordTest {
    
    public BirdMammalRecordTest() {
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
     * Test of getId method, of class BirdMammalRecord.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        BirdMammalRecord instance = new BirdMammalRecord();
        BirdMammalRecordId expResult = null;
        BirdMammalRecordId result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class BirdMammalRecord.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        BirdMammalRecordId id = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setId(id);
    }

    /**
     * Test of getAccommodation method, of class BirdMammalRecord.
     */
    @Test
    public void testGetAccommodation() {
        System.out.println("getAccommodation");
        BirdMammalRecord instance = new BirdMammalRecord();
        Accommodation expResult = null;
        Accommodation result = instance.getAccommodation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccommodation method, of class BirdMammalRecord.
     */
    @Test
    public void testSetAccommodation() {
        System.out.println("setAccommodation");
        Accommodation accommodation = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setAccommodation(accommodation);
    }

    /**
     * Test of getFed method, of class BirdMammalRecord.
     */
    @Test
    public void testGetFed() {
        System.out.println("getFed");
        BirdMammalRecord instance = new BirdMammalRecord();
        Fed expResult = null;
        Fed result = instance.getFed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFed method, of class BirdMammalRecord.
     */
    @Test
    public void testSetFed() {
        System.out.println("setFed");
        Fed fed = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setFed(fed);
    }

    /**
     * Test of getStudentName method, of class BirdMammalRecord.
     */
    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        BirdMammalRecord instance = new BirdMammalRecord();
        String expResult = "";
        instance.setStudentName(expResult);
        String result = instance.getStudentName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentName method, of class BirdMammalRecord.
     */
    @Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String studentName = "";
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setStudentName(studentName);
    }

    /**
     * Test of getFullClean method, of class BirdMammalRecord.
     */
    @Test
    public void testGetFullClean() {
        System.out.println("getFullClean");
        BirdMammalRecord instance = new BirdMammalRecord();
        Boolean expResult = null;
        Boolean result = instance.getFullClean();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFullClean method, of class BirdMammalRecord.
     */
    @Test
    public void testSetFullClean() {
        System.out.println("setFullClean");
        Boolean fullClean = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setFullClean(fullClean);
    }

    /**
     * Test of getWater method, of class BirdMammalRecord.
     */
    @Test
    public void testGetWater() {
        System.out.println("getWater");
        BirdMammalRecord instance = new BirdMammalRecord();
        Boolean expResult = null;
        Boolean result = instance.getWater();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWater method, of class BirdMammalRecord.
     */
    @Test
    public void testSetWater() {
        System.out.println("setWater");
        Boolean water = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setWater(water);
    }

    /**
     * Test of getConcreteSwept method, of class BirdMammalRecord.
     */
    @Test
    public void testGetConcreteSwept() {
        System.out.println("getConcreteSwept");
        BirdMammalRecord instance = new BirdMammalRecord();
        Boolean expResult = null;
        Boolean result = instance.getConcreteSwept();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConcreteSwept method, of class BirdMammalRecord.
     */
    @Test
    public void testSetConcreteSwept() {
        System.out.println("setConcreteSwept");
        Boolean concreteSwept = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setConcreteSwept(concreteSwept);
    }

    /**
     * Test of getEnrichment method, of class BirdMammalRecord.
     */
    @Test
    public void testGetEnrichment() {
        System.out.println("getEnrichment");
        BirdMammalRecord instance = new BirdMammalRecord();
        String expResult = "";
        instance.setEnrichment(expResult);
        String result = instance.getEnrichment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnrichment method, of class BirdMammalRecord.
     */
    @Test
    public void testSetEnrichment() {
        System.out.println("setEnrichment");
        String enrichment = "";
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setEnrichment(enrichment);
    }

    /**
     * Test of getSecurityCheck method, of class BirdMammalRecord.
     */
    @Test
    public void testGetSecurityCheck() {
        System.out.println("getSecurityCheck");
        BirdMammalRecord instance = new BirdMammalRecord();
        Boolean expResult = null;
        Boolean result = instance.getSecurityCheck();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSecurityCheck method, of class BirdMammalRecord.
     */
    @Test
    public void testSetSecurityCheck() {
        System.out.println("setSecurityCheck");
        Boolean securityCheck = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setSecurityCheck(securityCheck);
    }

    /**
     * Test of getWeeding method, of class BirdMammalRecord.
     */
    @Test
    public void testGetWeeding() {
        System.out.println("getWeeding");
        BirdMammalRecord instance = new BirdMammalRecord();
        Boolean expResult = null;
        Boolean result = instance.getWeeding();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWeeding method, of class BirdMammalRecord.
     */
    @Test
    public void testSetWeeding() {
        System.out.println("setWeeding");
        Boolean weeding = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setWeeding(weeding);
    }

    /**
     * Test of getComments method, of class BirdMammalRecord.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        BirdMammalRecord instance = new BirdMammalRecord();
        String expResult = "";
        instance.setComments(expResult);
        String result = instance.getComments();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComments method, of class BirdMammalRecord.
     */
    @Test
    public void testSetComments() {
        System.out.println("setComments");
        String comments = "";
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setComments(comments);
    }

    /**
     * Test of getRecordTime method, of class BirdMammalRecord.
     */
    @Test
    public void testGetRecordTime() {
        System.out.println("getRecordTime");
        BirdMammalRecord instance = new BirdMammalRecord();
        String expResult = "";
        instance.setRecordTime(expResult);
        String result = instance.getRecordTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecordTime method, of class BirdMammalRecord.
     */
    @Test
    public void testSetRecordTime() {
        System.out.println("setRecordTime");
        String recordTime = "";
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setRecordTime(recordTime);
    }

    /**
     * Test of getFood method, of class BirdMammalRecord.
     */
    @Test
    public void testGetFood() {
        System.out.println("getFood");
        BirdMammalRecord instance = new BirdMammalRecord();
        String expResult = "";
        instance.setFood(expResult);
        String result = instance.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFood method, of class BirdMammalRecord.
     */
    @Test
    public void testSetFood() {
        System.out.println("setFood");
        String food = "";
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setFood(food);
    }

    /**
     * Test of getAmount method, of class BirdMammalRecord.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        BirdMammalRecord instance = new BirdMammalRecord();
        Integer expResult = null;
        Integer result = instance.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmount method, of class BirdMammalRecord.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        Integer amount = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setAmount(amount);
    }

    /**
     * Test of getFruitVeg method, of class BirdMammalRecord.
     */
    @Test
    public void testGetFruitVeg() {
        System.out.println("getFruitVeg");
        BirdMammalRecord instance = new BirdMammalRecord();
        String expResult = "";
        instance.setFruitVeg(expResult);
        String result = instance.getFruitVeg();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFruitVeg method, of class BirdMammalRecord.
     */
    @Test
    public void testSetFruitVeg() {
        System.out.println("setFruitVeg");
        String fruitVeg = "";
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setFruitVeg(fruitVeg);
    }

    /**
     * Test of getAte method, of class BirdMammalRecord.
     */
    @Test
    public void testGetAte() {
        System.out.println("getAte");
        BirdMammalRecord instance = new BirdMammalRecord();
        Boolean expResult = null;
        Boolean result = instance.getAte();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAte method, of class BirdMammalRecord.
     */
    @Test
    public void testSetAte() {
        System.out.println("setAte");
        Boolean ate = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setAte(ate);
    }

    /**
     * Test of getAmountLeft method, of class BirdMammalRecord.
     */
    @Test
    public void testGetAmountLeft() {
        System.out.println("getAmountLeft");
        BirdMammalRecord instance = new BirdMammalRecord();
        Integer expResult = null;
        Integer result = instance.getAmountLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmountLeft method, of class BirdMammalRecord.
     */
    @Test
    public void testSetAmountLeft() {
        System.out.println("setAmountLeft");
        Integer amountLeft = null;
        BirdMammalRecord instance = new BirdMammalRecord();
        instance.setAmountLeft(amountLeft);
    }
    
}
