package com.github.lukaszprokop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5, "USD");
        assertEquals(five.times(2), new Dollar(10, "USD"));
        assertEquals(five.times(3), new Dollar(15, "USD"));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5, "USD").equals(new Dollar(5, "USD")));
        assertFalse(new Dollar(5, "USD").equals(new Dollar(6, "USD")));
    }
}