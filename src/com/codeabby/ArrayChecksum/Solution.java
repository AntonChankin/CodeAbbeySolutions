package com.codeabby.ArrayChecksum;

import java.util.Scanner;

/**
 * Created by chankin on 12.02.2015.
 */
public class Solution {
    final static int SEED = 113;
    final static int LIMIT = 10000007;

    public static void main(String[] args) {
        long result = 0;
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                result = (result + num) * SEED;
                result = result > LIMIT ? result % LIMIT : result;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
