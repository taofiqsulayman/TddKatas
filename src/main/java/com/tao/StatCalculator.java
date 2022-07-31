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

        for (int i = 0; i<arr.length; i++)
            sum += arr[i];

        double average = sum / arr.length;

        return Double.parseDouble(String.valueOf(formatter.format("%.6f", average)));
    }
}
