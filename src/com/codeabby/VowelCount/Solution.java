package com.codeabby.VowelCount;

import java.util.Scanner;

/**
 * Created by chankin on 29.01.2015.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.useDelimiter("\n");
            for (int j = 0; j < n; j++) {
                int result = 0;
                String line = in.next();
                for (int i = 0; i < line.length(); i++) {
                    char z = line.charAt(i);
                    if (z =='a' || z=='e' || z=='i' || z=='o' || z=='u' || z=='y') {
                        result++;
                    }
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
