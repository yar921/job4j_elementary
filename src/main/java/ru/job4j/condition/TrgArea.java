package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}