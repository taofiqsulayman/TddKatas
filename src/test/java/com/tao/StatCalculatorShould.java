package com.tao;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StatCalculatorShould {

    @Test
    public void giveMinValueOfArray(){

        int[] arr = {6, 9, 15, -2, 92, 11};
        int minValue = StatCalculator.getMinValue(arr);
        assertEquals(-2, minValue);
    }
}
