package com.codeabby.SumsInLoop;

import java.util.Scanner;

/**
 * Created by chankin on 21.01.2015.
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
                for (int k = 0; k < 2; k++) {
                    result += in.nextInt();
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
