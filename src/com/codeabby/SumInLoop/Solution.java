package com.codeabby.SumInLoop;

import java.util.Scanner;

/**
 * Created by chankin on 21.01.2015.
 */
public class Solution {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                result += in.nextInt();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.printf("" + result);
    }
}
