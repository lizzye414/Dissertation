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
public class BirdMammalRecordIdTest {
    
    public BirdMammalRecordIdTest() {
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
     * Test of getAccommId method, of class BirdMammalRecordId.
     */
    @Test
    public void testGetAccommId() {
        System.out.println("getAccommId");
        BirdMammalRecordId instance = new BirdMammalRecordId();
        int expResult = 0;
        int result = instance.getAccommId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccommId method, of class BirdMammalRecordId.
     */
    @Test
    public void testSetAccommId() {
        System.out.println("setAccommId");
        int accommId = 0;
        BirdMammalRecordId instance = new BirdMammalRecordId();
        instance.setAccommId(accommId);
    }

    /**
     * Test of getRecordDate method, of class BirdMammalRecordId.
     */
    @Test
    public void testGetRecordDate() {
        System.out.println("getRecordDate");
        BirdMammalRecordId instance = new BirdMammalRecordId();
        Date expResult = null;
        Date result = instance.getRecordDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecordDate method, of class BirdMammalRecordId.
     */
    @Test
    public void testSetRecordDate() {
        System.out.println("setRecordDate");
        Date recordDate = null;
        BirdMammalRecordId instance = new BirdMammalRecordId();
        instance.setRecordDate(recordDate);
    }

    /**
     * Test of getRecordTime method, of class BirdMammalRecordId.
     */
    @Test
    public void testGetRecordTime() {
        System.out.println("getRecordTime");
        BirdMammalRecordId instance = new BirdMammalRecordId();
        String expResult = "";
        instance.setRecordTime(expResult);
        String result = instance.getRecordTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRecordTime method, of class BirdMammalRecordId.
     */
    @Test
    public void testSetRecordTime() {
        System.out.println("setRecordTime");
        String recordTime = "";
        BirdMammalRecordId instance = new BirdMammalRecordId();
        instance.setRecordTime(recordTime);
    }

    /**
     * Test of equals method, of class BirdMammalRecordId.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        BirdMammalRecordId instance = new BirdMammalRecordId();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
    }
   
}
