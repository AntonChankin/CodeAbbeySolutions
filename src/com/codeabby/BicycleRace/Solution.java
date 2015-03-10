package com.codeabby.BicycleRace;

import java.util.Scanner;

/**
 * Two bicyclist start moving from different cities heading to meet each other somewhere in the middle (not exactly since they travel with different speed).
 *
 *  The road is laid in straight line between two cities.
 *
 * You will be given the distance between cities S (in kilometers) and speed values for two bicyclists (A and B in kilometers per hour). Your task is to find their meeting point (its distance from the first of cities).
 *
 * Input data will have the number of test-cases in the first line.
 * Next lines will contain three values each S A B.
 * Answer should contain the distances between first city and rendezvous point (i.e. distance travelled by first cyclist before they meet), separated with spaces.
 */
public class Solution {

    public static double calculateDistance(int distance, int firstSpeed, int secondSpeed) {
        return ((double)distance * firstSpeed) / (firstSpeed + secondSpeed);
    }

    public static void main(String[] args) {
        System.out.println("data:");
        StringBuilder answer = new StringBuilder();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int S = in.nextInt();
                int v1 = in.nextInt();
                int v2 = in.nextInt();
                double tempAnswer = calculateDistance(S, v1, v2);
                answer.append(tempAnswer).append(' ');
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(answer);
    }

}
