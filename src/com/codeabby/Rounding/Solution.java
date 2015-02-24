package com.codeabby.Rounding;

import java.util.Scanner;

/**
 * Created by chankin on 27.01.2015.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int num = in.nextInt();
                int divisor = in.nextInt();
                int result = (int) Math.round((double) num / divisor);
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
