package com.tao;

public class RomanNumeralsConverter {
    public static String toRoman(int number) {

        String roman = "";

        if (number == 4)
            roman += "IV";
            number -= 4;

        for (int i = 0; i < number; i++)
            roman += "I";

        return roman;
    }
}
