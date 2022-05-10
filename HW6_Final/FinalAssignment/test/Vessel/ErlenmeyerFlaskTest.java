/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vessel;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wilth
 */
public class ErlenmeyerFlaskTest {
    
    public ErlenmeyerFlaskTest() {
    }
    
    @Test
    @DisplayName("addFill(): Erlenmeyer Flask No Overflow")
    public void testAddFillWhiteBox1() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        double result = eF1.addFill(15);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    @DisplayName("addFill(): Erlenmeyer Flask Overflow")
    public void testAddFillWhiteBox2() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        double result = eF1.addFill(16);
        double expected = 3.433;
        assertEquals(expected, result, 3);
    }
    
    @Test
    @DisplayName("pourOut(): Erlenmeyer Flask No overflow")
    public void testPourOutWhiteBox1() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        eF1.addFill(15);
        double result = eF1.pourOut(15);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    @DisplayName("pourOut(): Erlenmeyer Flask overflow")
    public void testPourOutWhiteBox2() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        double result = eF1.pourOut(1600);
        double expected = 1600;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCaseAddFill1() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        double result = eF1.addFill(12.566);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    @Test
    public void testEdgeCaseAddFill2() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        double result = eF1.addFill(12.567);
        double expected = 0.001;
        assertEquals(expected, result, 3);
    }
    @Test
    public void testEdgeCaseAddFill3() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        double result = eF1.addFill(12.566);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCasePourOut1() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        eF1.addFill(15.566);
        double result = eF1.pourOut(15.566);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCasePourOut2() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        eF1.addFill(15.566);
        double result = eF1.pourOut(15.567);
        double expected = 0.001;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCasePourOut3() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        eF1.addFill(15.566);
        double result = eF1.pourOut(15.565);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testisEmpty1() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        boolean result = eF1.isEmpty();
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    public void testisEmpty2() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        eF1.addFill(15.566);
        eF1.pourOut(15);
        boolean result = eF1.isEmpty();
        boolean expected = false;
        assertEquals(expected, result);
    }
    @Test
    public void testisEmpty3() {
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(5, 2, 10, 1);
        eF1.addFill(15.566);
        eF1.pourOut(16);
        boolean result = eF1.isEmpty();
        boolean expected = false;
        assertEquals(expected, result);
    }
}
