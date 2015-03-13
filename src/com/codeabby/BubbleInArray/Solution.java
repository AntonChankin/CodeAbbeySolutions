package com.codeabby.BubbleInArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This problem provides an exercise for learning core idea of infamous ordering algorithm - bubble sort - which you are supposed to program bit later.
 *
 * Given integer array, you are to iterate through all pairs of neighbor elements, starting from beginning - and swap members of each pair where first element is greater than second.
 *
 * For example, let us consider small array of elements 1 4 2 3 6 5, marking which pairs are swapped and which are not:
 *
 * (1  4) 3  2  6  5  - pass
 * 1 (4  3) 2  6  5  - swap
 * 1  3 (4  2) 6  5  - swap
 * 1  3  2 (4  6) 5  - pass
 * 1  3  2  4 (6  5) - swap
 * 1  3  2  4  5  6  - end
 * This operation moves some greater elements right (to the end of array) and some smaller elements left (to the beginning).
 * What is the most important: biggest element is necessarily moved to the last position.
 *
 * Input data contain sequence of elements of the array, all positive. After this value -1 follows to mark the end (it should not be included into an array).
 * Answer should contain two values - number of performed swaps and checksum of the array after processing (separated by spaces).
 * Checksum should be calculated with exactly the same method as in the task Array Checksum
 */
public class Solution {
    final static int SEED = 113;
    final static int LIMIT = 10000007;

    private static long calcChecksum( int[] a) {
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result = (result + a[i]) * SEED;
            result = result > LIMIT ? result % LIMIT : result;
        }
        return result;
    }
    
    private static int bubbleArray(int[] a) {
        int swaps = 0;
        for (int i = 0; i < a.length -1; i++) {
            if (a[i] > a[i+1]) {
                int t = a[i+1];
                a[i+1] = a[i];
                a[i] = t;
                swaps++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            List<Integer> ints = new ArrayList<Integer>();
            int next = in.nextInt();
            while (next != -1) {
                ints.add(next);
                next = in.nextInt();
            }
            int[] a = new int[ints.size()];
            int idx = 0;
            for (Integer i : ints) {
                a[idx] = i;
                idx++;
            }
            answer.append(bubbleArray(a)).append(' ').append(calcChecksum(a));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(answer);
    }
}
