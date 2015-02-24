package com.codeabby.ReverseString;

import java.util.Scanner;

/**
 * Quite a simple task - just to start learning strings...
 *
 * Input data will contain a single string of small latin letters and few spaces.
 * Answer should contain the string of the same length with the same characters but in reverse order.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            for (int i = 1; i < str.length()+1; i++) {
                char c = str.charAt(str.length()-i);
                result.append(c);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
