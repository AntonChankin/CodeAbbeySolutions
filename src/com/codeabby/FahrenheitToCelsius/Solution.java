package com.codeabby.FahrenheitToCelsius;

import java.util.Scanner;

/**
 * Created by chankin on 28.01.2015.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int fahrenheit = in.nextInt();
                fahrenheit -= 32;
                fahrenheit *= 5;
                int celsius = (int) Math.round((double) fahrenheit / 9);
                builder = builder.append(celsius).append(" ");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.printf(builder.toString());
    }
}
