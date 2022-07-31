package com.tao;

import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.gen5.api.Assertions.assertEquals;

public class LeapYearCheckerShould {

    @Test
    public void detectLeapYear(){

        LeapYearChecker checker = new LeapYearChecker();
        assertEquals(true, checker.isLeapYear(1996));
    }


}
