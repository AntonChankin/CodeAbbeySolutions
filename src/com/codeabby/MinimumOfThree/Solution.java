package com.codeabby.MinimumOfThree;

import java.util.Scanner;

/**
 * Created by chankin on 23.01.2015.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                if (a < b) {
                    b = a;
                }
                if (b < c) {
                    c = b;
                }
                builder = builder.append(c).append(" ");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.printf(builder.toString());
    }
}
