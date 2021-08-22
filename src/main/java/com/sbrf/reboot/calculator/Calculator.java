package com.sbrf.reboot.calculator;

public class Calculator {
    public static int getAddition(int i, int b) {
        return i + b;
    }

    public static int getSubtraction(int i, int b) {
        return i - b;
    }

    public static int getMultiplication(int i, int b) {
        return i * b;
    }

    public static int getDivision(int i, int b) {
        return i / b;
    }

    public static int getSqr(int i) {
        return i * i;
    }

    public static int getMod(int i, int b) {
        return i % b;
    }

    public static int getFactorial(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result = result * j;
        }
        return result;
    }
}
