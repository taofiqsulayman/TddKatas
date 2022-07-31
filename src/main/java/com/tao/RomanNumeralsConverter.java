package com.tao;

public class RomanNumeralsConverter {
    public static String toRoman(int number) {

        String roman = "";
        for (int i = 0; i < number; i++)
            roman += "I";

        return roman;
    }
}
