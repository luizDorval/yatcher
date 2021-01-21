/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luiz Dorval
 * @since 04/07/2019
 * @version 1.0.1 beta C56
 */
public class YachtTest {
    
    private static final Yacht YACHT = new Yacht();
    
    public YachtTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        YACHT.setIdYacht(1);
        YACHT.setImo(0123456);
        YACHT.setModel("sla");
        YACHT.setColor("azul");
        YACHT.setType("Motorizado");
        YACHT.setMaterial("Madeira");
        YACHT.setWidth(30);
        YACHT.setHeight(30);
        YACHT.setWeight(15);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        YACHT.setIdYacht(1);
        YACHT.setImo(0123456);
        YACHT.setModel("sla");
        YACHT.setColor("azul");
        YACHT.setType("Motorizado");
        YACHT.setMaterial("Madeira");
        YACHT.setWidth(30);
        YACHT.setHeight(30);
        YACHT.setWeight(15);
    }
    
    @After
    public void tearDown() {
        YACHT.toString();
    }

    /**
     * Test of getIdYacht method, of class Yacht.
     */
    @Test
    public void testGetIdYacht() {
    }

    /**
     * Test of setIdYacht method, of class Yacht.
     */
    @Test
    public void testSetIdYacht() {
    }

    /**
     * Test of getImo method, of class Yacht.
     */
    @Test
    public void testGetImo() {
    }

    /**
     * Test of setImo method, of class Yacht.
     */
    @Test
    public void testSetImo() {
    }

    /**
     * Test of getModel method, of class Yacht.
     */
    @Test
    public void testGetModel() {
    }

    /**
     * Test of setModel method, of class Yacht.
     */
    @Test
    public void testSetModel() {
    }

    /**
     * Test of getColor method, of class Yacht.
     */
    @Test
    public void testGetColor() {
    }

    /**
     * Test of setColor method, of class Yacht.
     */
    @Test
    public void testSetColor() {
    }

    /**
     * Test of getType method, of class Yacht.
     */
    @Test
    public void testGetType() {
    }

    /**
     * Test of setType method, of class Yacht.
     */
    @Test
    public void testSetType() {
    }

    /**
     * Test of getMaterial method, of class Yacht.
     */
    @Test
    public void testGetMaterial() {
    }

    /**
     * Test of setMaterial method, of class Yacht.
     */
    @Test
    public void testSetMaterial() {
    }

    /**
     * Test of getWidth method, of class Yacht.
     */
    @Test
    public void testGetWidth() {
    }

    /**
     * Test of setWidth method, of class Yacht.
     */
    @Test
    public void testSetWidth() {
    }

    /**
     * Test of getHeight method, of class Yacht.
     */
    @Test
    public void testGetHeight() {
    }

    /**
     * Test of setHeight method, of class Yacht.
     */
    @Test
    public void testSetHeight() {
    }

    /**
     * Test of getWeight method, of class Yacht.
     */
    @Test
    public void testGetWeight() {
    }

    /**
     * Test of setWeight method, of class Yacht.
     */
    @Test
    public void testSetWeight() {
    }

    /**
     * Test of calculatePeopleCapacity method, of class Yacht.
     */
    @Test
    public void testCalculatePeopleCapacity() {
        assertEquals(60, YACHT.calculatePeopleCapacity(), 0.0);
        YACHT.setHeight(15);
        YACHT.setWidth(15);
        assertEquals(15, YACHT.calculatePeopleCapacity(), 0.0);
    }

    /**
     * Test of calculateWeightCapacity method, of class Yacht.
     */
    @Test
    public void testCalculateWeightCapacity() {
        assertEquals(4080, YACHT.calculateWeightCapacity(), 0.0);
        YACHT.setHeight(15);
        YACHT.setWidth(15);
        assertEquals(1020, YACHT.calculateWeightCapacity(), 0.0);
    }

    /**
     * Test of toString method, of class Yacht.
     */
    @Test
    public void testToString() {
    }
    
}
