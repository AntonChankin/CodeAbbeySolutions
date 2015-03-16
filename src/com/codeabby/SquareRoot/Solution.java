package com.codeabby.SquareRoot;

import java.util.Scanner;

/**
 * Many mathematical problems are solved in programming not precisely, but approximately, by several computations of the result, each of which is more and more close to the goal.
 *
 * Let us practice the method of approximate calculation of the square root. Refer to Square Root Approximation article for details on the Heron's Method.
 *
 * You will be given values for which to perform calculations and number of steps to perform.
 * Use r = 1 at the beginning, and output resulting approximation.
 *
 * Input data will give the number of test-cases in first line.
 * Next lines will contain test-cases themselves, each containing the value for which square root should be calculated and the number of calculation steps.
 * Answer should contain calculated approximations for each case, separated by space.
 */
public class Solution {

    public static double calcSqrt(int value, int steps) {
        double r = 1;
        for (int i = 0; i < steps; i++) {
            double d = (double) value / r;
            r = (r + d) /2;
        }
        return r;
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int value = in.nextInt();
                int steps = in.nextInt();
                double answer = calcSqrt(value, steps);
                result.append(answer).append(' ');
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }

}
