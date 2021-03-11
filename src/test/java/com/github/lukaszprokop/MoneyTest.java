package com.github.lukaszprokop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MoneyTest {

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testDollarMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(five.times(2), Money.dollar(10));
        assertEquals(five.times(3), Money.dollar(15));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality(){
        assertTrue(new Money(10, "CHF").equals(new Money(10, "CHF")));
    }

    @Test
    public void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        assertEquals(Money.dollar(10), sum);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

}