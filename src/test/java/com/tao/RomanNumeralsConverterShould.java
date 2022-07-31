package com.tao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterShould {
    
    @Test
    public void turn1toRoman(){
        String result = RomanNumeralsConverter.toRoman(1);
        assertEquals("I", result);
    }
}
