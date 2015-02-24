package com.codeabby.MaximumOfArray;

import java.util.Scanner;

/**
 * Created by chankin on 23.01.2015.
 */
public class Solution {
    final static int NUMBER_OF_ELEMENTS = 300;
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int maximum = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;
            for (int j = 0; j < NUMBER_OF_ELEMENTS; j++) {
                int a = in.nextInt();
                if (a < minimum) {
                    minimum = a;
                }
                if (a > maximum) {
                    maximum = a;
                }
            }
            builder = builder.append(maximum).append(" ").append(minimum);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.printf(builder.toString());
    }
}
