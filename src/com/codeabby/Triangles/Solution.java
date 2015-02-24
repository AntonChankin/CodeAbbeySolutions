package com.codeabby.Triangles;

import java.util.Scanner;

/**
 * Triangle is an object built of three line segments (sides of triangle), connected by ends.
 * Wiki on triangles provides more detailed explanation.
 *  If we have three line segments with lengths A B C - we either can built a triangle with them
 * (for example with 3 4 5 or 3 4 7 - though this is with zero area) or we found it impossible
 * (for example 1 2 4).
 *
 * You are given several triplets of values representing lengths of the sides of triangles.
 * You should tell from which triplets it is possible to build triangle and for which it is not.
 *
 * Input data: First line will contain number of triplets.
 * Other lines will contain triplets themselves (each in separate line.
 * Answer: You should output 1 or 0 for each triplet (1 if triangle could be built and 0 otherwise).
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                boolean isPossible = true;
                int firstValue = in.nextInt();
                int secondValue = in.nextInt();
                int thirdValue = in.nextInt();
                if (firstValue > secondValue + thirdValue) isPossible = false;
                if (secondValue > firstValue + thirdValue) isPossible = false;
                if (thirdValue > firstValue + secondValue) isPossible = false;

                if (isPossible) {
                    result.append(1).append(' ');
                } else {
                    result.append(0).append(' ');
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }

}
