package com.example.jonas.leapyear;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LeapYearCalculatorTest {

    @Test
    public void leapYear400Rule(){
        testYear(true, 1600);
    }

    @Test
    public void leapYear100Rule() {
        testYear(false, 1700);
    }

    private void testYear(boolean expectedResult, int year){
        assertEquals(expectedResult, LeapYearCalculator.isLeapYear(year));
    }

}
