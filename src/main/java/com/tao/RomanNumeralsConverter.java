package com.tao;

public class RomanNumeralsConverter {
    public static String toRoman(int number) {

        StringBuilder roman = new StringBuilder();

        if (number >= 5) {
            roman.append("V");
            number -= 5;
        } else if (number == 4) {
            roman.append("IV");
            number -= 4;
        }


        for (int i = 0; i < number; i++)
            roman.append("I");

        return roman.toString();
    }
}
