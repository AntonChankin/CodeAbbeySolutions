package com.codeabby.SmoothingTheWeather;

import java.util.Scanner;

/**
 * Little Merlin wants to become a meteorologist. He measures the temperature of the air each hour so that after several days he has a long sequence of values.
 *
 *  However, his instruments are not ideal so the measurements are not exact - they randomly jump up and down by several degrees from the real values.
 *
 * Observing this, Merlin decided to make his data more smooth. To achieve this he only needs every value to be substituted by the average of it and its two neighbors. For example, if he have the sequence of 5 values like this:
 *
 * 3 5 6 4 5
 * Then the second (i.e. 5) should be substituted by (3 + 5 + 6) / 3 = 4.66666666667,
 * the third (i.e. 6) should be substituted by (5 + 6 + 4) / 3 = 5,
 * the fourth (i.e. 4) should be substituted by (6 + 4 + 5) / 3 = 5.
 * By agreement, the first and the last values will remain unchanged.
 *
 * At the picture above the blue line shows unprocessed data while red represents the smoothing.
 *
 * You are to write the program which helps Little Merlin in this whimsical algorithm of digital signal processing.
 *
 * Input data will contain the length of the sequence in the first line.
 * The second line will contain the measurements itself.
 * Answer should contain the processed sequence. All values should be calculated to precision of 1e-7 or better.
 */
public class Solution {

    public static double normalize(double prevInLine, double current, double nextInLine) {
        return (prevInLine + current + nextInLine) /3;
    }


    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n =in.nextInt();
            double[] numbers = new double[n];
            double[] answer = new double[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = in.nextDouble();
            }
            answer[0] = numbers[0];
            result.append(answer[0]).append(' ');
            for (int i = 1; i < n-1; i++) {
                answer[i] = normalize(numbers[i-1], numbers[i], numbers[i+1]);
                result.append(answer[i]).append(' ');
            }
            answer[n-1] = numbers[n-1];
            result.append(answer[n-1]);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
