package com.tao;

import java.util.Arrays;

public class StatCalculator {
    public static int getMinValue(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
