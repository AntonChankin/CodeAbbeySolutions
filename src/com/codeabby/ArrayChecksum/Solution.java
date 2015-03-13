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
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            result = calcChecksum(a);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }

    private static long calcChecksum( int[] a) {
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result = (result + a[i]) * SEED;
            result = result > LIMIT ? result % LIMIT : result;
        }
        return result;
    }
}
