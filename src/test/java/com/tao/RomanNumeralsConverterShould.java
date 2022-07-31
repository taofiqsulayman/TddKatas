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

    @Test
    public void turn5toRoman(){
        String result = RomanNumeralsConverter.toRoman(5);
        assertEquals("V", result);
    }

    @Test
    public void turn6toRoman(){
        String result = RomanNumeralsConverter.toRoman(6);
        assertEquals("VI", result);
    }

    @Test
    public void turn9toRoman(){
        String result = RomanNumeralsConverter.toRoman(9);
        assertEquals("IX", result);
    }

    @Test
    public void turn10toRoman(){
        String result = RomanNumeralsConverter.toRoman(10);
        assertEquals("X", result);
    }

    @Test
    public void turn11toRoman(){
        String result = RomanNumeralsConverter.toRoman(11);
        assertEquals("XI", result);
    }

    @Test
    public void turn33toRoman(){
        String result = RomanNumeralsConverter.toRoman(33);
        assertEquals("XXXIII", result);
    }

}
