package com.codeabby.GCDandLCM;

import java.util.Scanner;

/**
 * It looks like none of beginner's courses on programming avoids practicing Euclid's algorithm for calculation of the greatest common divisor of two numbers. Let us not deviate from this popular trend and study this puzzle too, though it is mostly important in number theory (which in its turn has great importance in cryptography).
 *
 *  For explanation of the algorithm needed for this task please refer to the GCD and LCM article.
 */
public class Solution {
    /*
        while A and B are not equal to 0
            substitute bigger with remainder (bigger % smaller)

        when one becomes 0 - the other would containt the value of GCD
     */
    public static long calcGCD(final long A, final long B) {
        long a = A;
        long b = B;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = (a % b);
            } else {
                b = (b % a);
            }
        }
        return a > b ? a : b;
    }

    /*
        GCD(A, B) * LCM(A, B) = A * B
     */
    public static long calcLCM(final long A, final long B) {
        return (A * B) / calcGCD(A, B);
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                result = result.append('(').append(calcGCD(a, b)).append(' ').append(calcLCM(a ,b)).append(") ");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
