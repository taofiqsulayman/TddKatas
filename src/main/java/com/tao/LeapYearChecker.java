package com.tao;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;
        return false;
    }
}
