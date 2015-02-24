package com.codeabby.DiceRolling;

import java.util.Scanner;

/**
 * Created by chankin on 05.02.2015.
 */
public class Solution {
    public static final int DICE_MAX_VALUE = 6;

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                double random = in.nextDouble();
                int result = (int)((random * DICE_MAX_VALUE) + 1);
                builder.append(result).append(" ");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.printf(builder.toString());
    }
}
