package com.tao;

import org.junit.jupiter.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public class LeapYearCheckerShould {

    @Test
    public void detectLeapYear(){

        assertEquals(true, LeapYearChecker.isLeapYear(1996));
    }

    @Test
    public void detectCommonYear(){

        assertEquals(false, LeapYearChecker.isLeapYear(2001));
    }

    @Test
    public void detectAtypicalCommonYear(){

        assertEquals(false, LeapYearChecker.isLeapYear(1900));
    }

    @Test
    public void detectAtypicalLeapYear(){

        assertEquals(true, LeapYearChecker.isLeapYear(2000));
    }


}
