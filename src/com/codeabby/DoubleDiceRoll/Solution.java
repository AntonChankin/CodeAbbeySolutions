package com.codeabby.DoubleDiceRoll;

import java.util.Scanner;

/**
 * If you solved the Dice Rolling, you already know how to convert fractional value to an integer number from specific range - for example to one of numbers existing on the side of a die (from 1 to 6).
 *
 * However, many programming languages (like C/C++, PHP, Pascal) use random number generator which on contrary gives only integer values in the range from 0 to some (very large) maximum. How to convert such numbers to dice points?
 *
 * It happens that this case is even simpler. We can use the following approach:
 *
 * Divide the random value R by the N (number of distinct values we want - e.g. 6 for dice) and take the remainder. This remainder is necessarily the integer value in the range from 0 to N - 1.
 * Now to shift it to the necessary range, simply add 1 (i.e. the minimum of the range we want) - and you'll get the value in the range from 1 to N.
 * This method is not well precise if N is not small enough in compare to max of the generator. However it will be all right for most everyday needs (tossing coins, rolling dice, shuffling cards etc.)
 *
 * To have practice, let us proceed with the following exercise:
 *
 * Input data will contain the number of test-cases (dice throws) in the first line.
 * Next lines will have test-cases - each consisting of two random integer numbers - for throwing a pair of dice. These numbers are non-negative (from 0 to some value above 2,000,000,000) and they should be converted to dice points using the algorithm proposed above.
 * Answer should contain the sum of each throw of the pair of dice, values should be separated with spaces.
 *
 */
public class Solution {
    public static final int NUM_SIDES = 6;

    public static long rollTheDice(long randomValue) {
        return (randomValue % NUM_SIDES) + 1;
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                long randomDiceRoll1 = in.nextLong();
                long randomDiceRoll2 = in.nextLong();
                result.append(rollTheDice(randomDiceRoll1) + rollTheDice(randomDiceRoll2)).append(' ');
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }

}
