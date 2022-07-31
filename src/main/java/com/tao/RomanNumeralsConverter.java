package com.tao;

public class RomanNumeralsConverter {
    public static String toRoman(int number) {

        StringBuilder roman = new StringBuilder();

        if (number == 11){
            roman.append("XI");
            number -= 11;
        } else if (number == 10) {
            roman.append("X");
            number -= 10;

        }

        for (Numeral numeral : Numeral.values()){
            if (number >= numeral.arabic){
                roman.append(numeral.roman);
                number -= numeral.arabic;
            }
        }

        for (int i = 0; i < number; i++)
            roman.append("I");

        return roman.toString();
    }


    private enum Numeral {
        NINE (9, "IX"),
        FIVE (5, "V"),
        FOUR (4, "IV");

        private final int arabic;
        private final String roman;

        Numeral(int arabic, String roman) {

            this.arabic = arabic;
            this.roman = roman;
        }
    }
}
