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

    @Test
    public void giveMinValueOfArray2(){

        int[] arr = {6, 9, 15, -3, 92, 11};
        int minValue = StatCalculator.getMinValue(arr);
        assertEquals(-3, minValue);
    }

    @Test
    public void giveMaxValueOfArray(){

        int[] arr = {6, 9, 15, -3, 92, 11};
        int maxValue = StatCalculator.getMaxValue(arr);
        assertEquals(92, maxValue);
    }

}
