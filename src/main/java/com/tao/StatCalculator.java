package com.tao;

import java.util.Arrays;
import java.util.Formatter;
import java.util.OptionalDouble;

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

        Formatter formatter = new Formatter();

        double sum = 0;
        double size = getSize(arr);

        for (int j : arr) sum += j;

        String average = String.valueOf(formatter.format("%.6f", sum / size));

        return Double.parseDouble(average);
    }
}
