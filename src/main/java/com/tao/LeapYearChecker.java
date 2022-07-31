package com.tao;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {

        if (year % 100 == 0 && year % 400 != 0)
            return false;
        return year % 4 == 0 || year % 400 == 0;
    }
}
