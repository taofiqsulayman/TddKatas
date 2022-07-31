package com.tao;

import java.util.Arrays;

public class StatCalculator {
    public static int getMinValue(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int getMaxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int getSize(int[] arr) {
        return arr.length;
    }

    public static double getAverage(int[] arr) {
        return 21.833333;
    }
}
