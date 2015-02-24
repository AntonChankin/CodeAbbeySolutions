package com.codeabby.SumOfDigits;

import java.util.Scanner;

/**
 * Created by chankin on 11.02.2015.
 */
public class Solution {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                // A * B + C
                int inter = a * b + c;
                int result = 0;
                while (inter / 10 != 0) {
                    result += inter % 10;
                    inter = inter / 10;
                }
                result += inter;
                builder.append(result).append(" ");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(builder.toString());
    }
}
