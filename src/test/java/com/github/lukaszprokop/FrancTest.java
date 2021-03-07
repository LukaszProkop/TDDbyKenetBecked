package com.github.lukaszprokop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrancTest {

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5, "CHF");
        assertEquals(five.times(2), new Franc(10, "CHF"));
        assertEquals(five.times(3), new Franc(15, "CHF"));
    }

    @Test
    public void testEquality(){
        assertTrue(new Franc(5, "CHF").equals(new Franc(5, "CHF")));
        assertFalse(new Franc(5, "CHF").equals(new Franc(6,"CHF")));
    }
}