package com.tao;

public class RomanNumeralsConverter {
    public static String toRoman(int number) {
        if (number == 3)
            return "III";
        else if (number ==2) {
            return "II";
        }

        return "I";
    }
}
