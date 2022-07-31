package com.tao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatCalculatorShould {

    @Test
    public void giveMinValueOfArray(){

        int[] arr = {6, 9, 15, -2, 92, 11};
        int minValue = StatCalculator.getMinValue(arr);
        Assertions.assertEquals(-2, minValue);
    }

    @Test
    public void giveMinValueOfArray2(){

        int[] arr = {6, 9, 15, -3, 92, 11};
        int minValue = StatCalculator.getMinValue(arr);
        Assertions.assertEquals(-3, minValue);
    }

    @Test
    public void giveMaxValueOfArray(){

        int[] arr = {6, 9, 15, -3, 92, 11};
        int maxValue = StatCalculator.getMaxValue(arr);
        Assertions.assertEquals(92, maxValue);
    }

}
