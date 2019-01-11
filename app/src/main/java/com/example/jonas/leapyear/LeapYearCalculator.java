package com.example.jonas.leapyear;

public final class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear;

        isLeapYear = year % 400 == 0;

        return isLeapYear;
    }
}
