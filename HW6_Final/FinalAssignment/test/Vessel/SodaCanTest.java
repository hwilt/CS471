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
public class SodaCanTest {
    
    public SodaCanTest() {
    }
    
    
    @Test
    @DisplayName("addFill(): Soda Can No Overflow")
    public void testAddFillWhiteBox1() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        double result = sc1.addFill(15);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    @Test
    @DisplayName("addFill(): Soda Can Overflow")
    public void testAddFillWhiteBox2() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        double result = sc1.addFill(1600);
        double expected = 80.317;
        assertEquals(expected, result, 3);
    }
    @Test
    @DisplayName("pourOut(): Soda Can No overflow")
    public void testPourOutWhiteBox1() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        sc1.addFill(1600);
        double result = sc1.pourOut(15);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    @DisplayName("pourOut(): Soda Can overflow")
    public void testPourOutWhiteBox2() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        double result = sc1.pourOut(1600);
        double expected = 1600;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCaseAddFill1() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        double result = sc1.addFill(1519.683);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    @Test
    public void testEdgeCaseAddFill2() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        double result = sc1.addFill(1519.682);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    @Test
    public void testEdgeCaseAddFill3() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        double result = sc1.addFill(1519.684);
        double expected = 0.001;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCasePourOut1() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        sc1.addFill(1519.683);
        double result = sc1.pourOut(1519.683);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCasePourOut2() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        sc1.addFill(1519.683);
        double result = sc1.pourOut(1519.684);
        double expected = 0.001;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testEdgeCasePourOut3() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        sc1.addFill(1519.683);
        double result = sc1.pourOut(1519.685);
        double expected = 0.0;
        assertEquals(expected, result, 3);
    }
    
    @Test
    public void testisEmpty1() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        boolean result = sc1.isEmpty();
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    public void testisEmpty2() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        sc1.addFill(15.566);
        sc1.pourOut(15);
        boolean result = sc1.isEmpty();
        boolean expected = false;
        assertEquals(expected, result);
    }
    @Test
    public void testisEmpty3() {
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        sc1.addFill(15.566);
        sc1.pourOut(16);
        boolean result = sc1.isEmpty();
        boolean expected = false;
        assertEquals(expected, result);
    }
}
