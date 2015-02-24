package com.codeabby.CollatzSequence;

import java.util.Scanner;

/**
 * This is one of the most mysterious math problems of the last century - both because its statement is extremely simple - and because the proof is still unknown. However it offers good programming exercise for beginners.
 *
 * Suppose we select some initial number X and then build the sequence of values by the following rules:
 *
 * if X is even (i.e. X modulo 2 = 0) then
 *     Xnext = X / 2
 * else
 *     Xnext = 3 * X + 1
 * I.e. if X is odd, sequence grows - and if it is even, sequence decreases. For example, with X = 15 we have sequence:
 *
 * 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
 * After the sequence reaches 1 it enters the loop 1 4 2 1 4 2 1....
 *
 * The intrigue is in the fact that any starting number X gives the sequence which sooner or later reaches 1 - however though this Collatz Conjecture was expressed in 1937, up to now no one could find a proof that it is really so for any X or could not find a counterexample (i.e. number for which sequence did not end with 1 - either entering some bigger loop or growing infinitely).
 *
 * Your task is for given numbers to calculate how many steps are necessary to come to 1.
 *
 * Input data contains number of test-cases in the first line.
 * Second line contains the test-cases - i.e. the values for which calculations should be performed.
 * Answer should contain the same amount of results, each of them being the count of steps for getting Collatz Sequence to 1.
 */
public class Solution {
    public static int getNextInCollatzSequence(int current) {
        return current % 2 == 0 ? current /2 : (3 * current) + 1;
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int steps = 0;
                int x = in.nextInt();
                while (x != 1) {
                    x = getNextInCollatzSequence(x);
                    steps++;
                }
                result = result.append(steps).append(' ');
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
