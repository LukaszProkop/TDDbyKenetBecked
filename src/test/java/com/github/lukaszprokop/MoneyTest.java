package com.github.lukaszprokop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MoneyTest {

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(new Franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testDollarMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(five.times(2), Money.dollar(10));
        assertEquals(five.times(3), Money.dollar(15));
    }

    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(five.times(2), Money.franc(10));
        assertEquals(five.times(3), Money.franc(15));
    }

}