/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Federico
 */
public class TerritorioTest {
    
    public TerritorioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setJugador method, of class Territorio.
     */
    @Test
    public void testSetJugador() {
        System.out.println("setJugador");
        Jugador p = new Jugador("agu", 1);
        Territorio instance = new Territorio(2, "Argentina");
        instance.setJugador(p);
        String expResult = "Argentina";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of setEjercito method, of class Territorio.
     */
    @Test
    public void testSetEjercito() {
        System.out.println("setEjercito");
        int a = 5;
        Territorio instance = new Territorio(1, "Peru");
        instance.setEjercito(a);
        // TODO review the generated test code and remove the default call to fail.
       assertNotNull(instance.getEjercitos());
    }

 
    /**
     * Test of getId method, of class Territorio.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Territorio instance = new Territorio(5, "Mexico");
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

}
