package com.codeabby.ArrayCounters;

import java.util.Scanner;

/**
 * Created by chankin on 16.02.2015.
 */
public class Solution {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int m = in.nextInt();
            int n = in.nextInt();
            int[] counter = new int[n+1];
            for (int j = 0; j < n; j++) {
                counter[j] = 0;
            }
            for (int i = 0; i < m; i++) {
                int num = in.nextInt();
                counter[num]++;
            }
            for (int k = 1; k < n + 1; k++) {
                result.append(counter[k]).append(' ');
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
