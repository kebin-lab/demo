package com.example.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoneyTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
