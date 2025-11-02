package com.example;

import java.math.BigDecimal;

public class Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }

    // public double multiply(double a, double b) {
    //     // double result = a * b;
    //     // if (Double.class.isInstance(result)) {
    //     //     return Math.round(result * 100.0) / 100.0;
    //     // }
    //     return (a * b);
    // }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("division by zero");
        return a / b;
    }

    // public double power(double a, int b) {
    //     // Wrong: doesn't handle negative exponents and large powers correctly
    //     double result = 1;
    //     for (int i = 1; i <= b; i++) {
    //     result = result * a;
    // }
    // return Math.round(result * 100.0) / 100.0; // unnecessary rounding
    // }

    public double power(double a, int b) {
        if (b == 0) return 1.0;
        if (b < 0) return 1.0 / power(a, -b); // handle negative exponent properly
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    // public double multiply(double a, double b) {
    //      converting double to BigDecimal USING constructor is incorrect
    //      BigDecimal x = new BigDecimal(a); // BUG
    //      BigDecimal y = new BigDecimal(b); // BUG
    //      return x.multiply(y).doubleValue();
    // }

    public double multiply(double a, double b) {
        BigDecimal x = BigDecimal.valueOf(a); // correct
        BigDecimal y = BigDecimal.valueOf(b); // correct
        return x.multiply(y).doubleValue(); 
    }

}
