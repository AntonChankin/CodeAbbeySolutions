package com.codeabby.BodyMassIndex;

import java.util.Scanner;

/**
 * Created by chankin on 04.02.2015.
 */
public class Solution {
    public static final double UNDERWEIGHT_HIGH = 18.5;
    public static final double NORMAL_HIGH = 25;
    public static final double OVERWEIGHT_HIGH = 30;


    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                int weight = in.nextInt();
                double height = in.nextDouble();
                double bmi = weight / Math.pow(height, 2);
                if (bmi < UNDERWEIGHT_HIGH) {
                    builder = builder.append("under").append(" ");
                } else if (bmi < NORMAL_HIGH) {
                    builder = builder.append("normal").append(" ");
                } else if (bmi < OVERWEIGHT_HIGH) {
                    builder = builder.append("over").append(" ");
                } else {
                    builder = builder.append("obese").append(" ");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.printf(builder.toString());
    }
}
