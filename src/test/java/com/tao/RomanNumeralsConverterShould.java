package com.tao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterShould {
    
    @Test
    public void turn1toRoman(){
        String result = RomanNumeralsConverter.toRoman(1);
        assertEquals("I", result);
    }

    @Test
    public void turn2toRoman(){
        String result = RomanNumeralsConverter.toRoman(2);
        assertEquals("II", result);
    }

    @Test
    public void turn3toRoman(){
        String result = RomanNumeralsConverter.toRoman(3);
        assertEquals("III", result);
    }

    @Test
    public void turn4toRoman(){
        String result = RomanNumeralsConverter.toRoman(4);
        assertEquals("IV", result);
    }
}
