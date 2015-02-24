package com.codeabby.WeightedSumOfDigits;

import java.util.Scanner;

/**
 * Created by chankin on 09.02.2015.
 */
public class Solution {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.nextLine();
            String line = in.nextLine();
            String[] strs = line.split(" ");
            for (int j = 0; j < n; j++) {
                String str = strs[j];
                double result = 0;
                for (int i = 0; i < str.length(); i++) {
                    result += Integer.parseInt(str.substring(i, i+1)) * (i + 1);
                }
                builder.append((int)result).append(" ");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(builder.toString());
    }
}
