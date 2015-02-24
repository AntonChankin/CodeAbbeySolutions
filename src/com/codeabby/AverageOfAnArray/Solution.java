package com.codeabby.AverageOfAnArray;

import java.util.Scanner;

/**
 * Created by chankin on 10.02.2015.
 */
public class Solution {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.nextLine();
            for (int k = 0; k < n; k++) {
                int num = 0;
                int count = 0;
                int elem = in.nextInt();
                while (elem != 0) {
                    num += elem;
                    elem = in.nextInt();
                    count++;
                }
                int divisor = count;
                int result = (int) Math.round((double) num / divisor);
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
