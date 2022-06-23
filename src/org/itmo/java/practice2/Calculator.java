package org.itmo.java.practice2;

public class Calculator {
    // addition
    public static int addition(int x, int y) {
        return (x + y);
    }

    public static double addition(double x, double y) {
        return (x + y);
    }

    public static long addition(long x, long y) {
        return (x + y);
    }

    // division
    public static double division(int x, int y) {
        double answer = 0;
        if (y == 0) {
            System.out.print("Division by zero isn't possible ");
        } else {
            answer = (double) x / y;
        }
        return answer;
    }

    public static double division(double x, double y) {
        double answer = 0;
        if (y == 0) {
            System.out.print("Division by zero isn't possible ");
        } else {
            answer = x / y;
        }
        return answer;
    }

    public static double division(long x, long y) {
        double answer = 0;
        if (y == 0) {
            System.out.print("Division by zero isn't possible ");
        } else {
            answer = (double) x / y;
        }
        return answer;
    }

    //multiplication
    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static long multiplication(long x, long y) {
        return x * y;
    }

    //subtraction
    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static long subtraction(long x, long y) {
        return x - y;
    }
}
