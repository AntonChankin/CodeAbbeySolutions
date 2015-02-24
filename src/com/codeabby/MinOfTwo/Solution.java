package com.codeabby.MinOfTwo;


import java.util.Scanner;

/**
 * Created by chankin on 22.01.2015.
 */
public class Solution {
    public static void main(String[] args) {
        int result = 0;
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                result = 0;
                int a = in.nextInt();
                int b = in.nextInt();
                if (a < b) {
                    result = a;
                } else {
                    result = b;
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
