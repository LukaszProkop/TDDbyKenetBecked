package com.github.lukaszprokop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MoneyTest {

    @Test
    public void testEquality(){
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

}