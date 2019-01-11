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

    @Test
    public void leapYear4Rule(){
        testYear(true, 2008);
    }

    @Test
    public void extraTest400Rule(){
        testYear(true, 2000);
    }

    @Test
    public void extraTest100Rule(){
        testYear(false, 2100);
    }

    @Test
    public void extraTest4Rule(){

        testYear( true, 2016);
    }

    private void testYear(boolean expectedResult, int year){
        assertEquals(expectedResult, LeapYearCalculator.isLeapYear(year));
    }
}
