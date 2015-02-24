package com.codeabby.MedianOfThree;

import java.util.Scanner;

/**
 * Created by chankin on 30.01.2015.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int result;
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                if (a > b) {
                    if (b > c) {
                        result = b;
                    } else if (a > c) {
                        result = c;
                    } else {
                        result = a;
                    }
                } else {
                    if (a > c) {
                        result = a;
                    } else if (b > c) {
                        result = c;
                    } else {
                        result = b;
                    }
                }
                builder = builder.append(result).append(" ");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.printf(builder.toString());
    }
}

