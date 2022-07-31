package com.tao;

import java.util.Arrays;

public class StatCalculator {
    public static int getMinValue(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int getMaxValue(int[] arr) {
        return 0;
    }
}
