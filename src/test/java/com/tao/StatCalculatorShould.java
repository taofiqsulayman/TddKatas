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

    @Test
    public void giveMaxValueOfArray2(){

        int[] arr = {6, 9, 15, -3, 90, 11};
        int maxValue = StatCalculator.getMaxValue(arr);
        Assertions.assertEquals(90, maxValue);
    }

    @Test
    public void giveNumberOfElementsInArray(){

        int[] arr = {6, 9, 15, -3, 92, 11};
        int size = StatCalculator.getSize(arr);
        Assertions.assertEquals(6, size);
    }

    @Test
    public void giveNumberOfElementsInArray2(){

        int[] arr = {6, 9, 15, -3, 92, 11, 12, 1, 3};
        int size = StatCalculator.getSize(arr);
        Assertions.assertEquals(9, size);
    }

    @Test
    public void giveAverageValueInArray(){

        int[] arr = {6, 9, 15, -2, 92, 11};
        double average = StatCalculator.getAverage(arr);
        Assertions.assertEquals(21.833333, average);
    }

    @Test
    public void giveAverageValueInArray2(){

        int[] arr = {6, 9, 15, -3, 92, 11, 10};
        double average = StatCalculator.getAverage(arr);
        Assertions.assertEquals(20, average);
    }

}
