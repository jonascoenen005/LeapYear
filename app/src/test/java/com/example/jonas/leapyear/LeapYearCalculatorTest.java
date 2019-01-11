package com.example.jonas.leapyear;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LeapYearCalculatorTest {

    @Test
    public void leapYear400Rule(){
        assertEquals(true, LeapYearCalculator.isLeapYear(1600));
    }

    @Test
    public void leapYear100Rule(){
        assertEquals(false, LeapYearCalculator.isLeapYear(1700));
    }
}