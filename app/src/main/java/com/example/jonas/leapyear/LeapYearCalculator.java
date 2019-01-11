package com.example.jonas.leapyear;

public final class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear;

        if(year % 400 == 0){
            isLeapYear = true;
        } else if (year % 100 == 0){
            isLeapYear = false;
        } else if (year % 4 == 0){
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        return isLeapYear;
    }
}
