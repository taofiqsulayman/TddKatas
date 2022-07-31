package com.tao;

public class RomanNumeralsConverter {
    public static String toRoman(int number) {

        StringBuilder roman = new StringBuilder();


        for (Numeral numeral : Numeral.values()){
            while (number >= numeral.arabic){
                roman.append(numeral.roman);
                number -= numeral.arabic;
            }
        }


        return roman.toString();
    }


    private enum Numeral {
        TEN (10, "X"),
        NINE (9, "IX"),
        FIVE (5, "V"),
        FOUR (4, "IV"),
        ONE (1, "I");

        private final int arabic;
        private final String roman;

        Numeral(int arabic, String roman) {

            this.arabic = arabic;
            this.roman = roman;
        }
    }
}
