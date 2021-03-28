package com.jacoco.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddCalculatorTest {

    private EvenOddCalculator classUnderTest = new EvenOddCalculator();

    @Test
    public void check_if_a_number_is_even(){
        assertEquals("Even", classUnderTest.determineEvenOrOdd(4));

    }

    @Test
    public void check_if_a_number_is_odd(){
        assertEquals("Odd", classUnderTest.determineEvenOrOdd(5));

    }
}
