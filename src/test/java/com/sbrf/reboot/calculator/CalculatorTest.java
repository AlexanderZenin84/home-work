package com.sbrf.reboot.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getAddition() {
        assertEquals(9, Calculator.getAddition(4, 5));
    }

    @Test
    void getSubtraction() {
        assertEquals(-1, Calculator.getSubtraction(4, 5));
    }

    @Test
    void getMultiplication() {
        assertEquals(20, Calculator.getMultiplication(4, 5));
    }

    @Test
    void getDivision() {
        assertEquals(3, Calculator.getDivision(9, 3));
    }

    @Test
    void getSqr() {
        assertEquals(9, Calculator.getSqr(3));
    }

    @Test
    void getMod() {
        assertEquals(1, Calculator.getMod(3, 2));
    }

    @Test
    void getFactorial() {
        assertEquals(6, Calculator.getFactorial(3));
    }

    @Test
    void classHasSevenMethods() {
        assertEquals(7, Calculator.class.getMethods().length - Object.class.getMethods().length);
    }
}