package ru.job4j.calculator;

public class Calculator {

    public static int plus1(int first, int second) {
        int result1 = first + second;
        return result1;
    }

    public static int plus2(int first, int second) {
        int result2 = first + second;
        return result2;
    }

    public static int func1(int x) {
        return x;
    }

    public static void main(String[] args) {
    int onePlusTwo = Calculator.plus1(1, 2);
    int thenPlusEleven = Calculator.plus2(10, 11);
    int func1 = Calculator.func1(100);
    int result3 = onePlusTwo + thenPlusEleven + func1;
        System.out.println(result3);
    }
}