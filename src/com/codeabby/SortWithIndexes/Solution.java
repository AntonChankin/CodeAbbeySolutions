package com.codeabby.SortWithIndexes;

import java.util.Scanner;

/**
 * After solving the task Bubble Sort you are supposed to learn about sorting arrays. Now we have a bit more complicated programming problem for you, since it is important to have practice in sorting and handling not only primitive values but also more complex objects.
 *
 *  As previously, you are given an array of numbers. It should be sorted and then for each value (in non-decreasing order) its initial index should be printed (indexes should start from 1).
 *
 *  I.e., suppose we have an array 50 98 17 79 which after sorting becomes 17 50 79 98. Now:
 *
 *  17 was at 3-rd place initially
 *  50 was at 1-st place initially
 *  79 was at 4-th place initially
 *  98 was at 2-nd place initially
 *
 *  so result is
 *   3 1 4 2
 * Initial data will contain array size at first line and array values itself in the second (integers separated by spaces).
 * Answer should contain initial indexes of the array members disturbed by sorting.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            int[] indxs = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                indxs[i] = i+1;
            }
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < n-1; i++) {
                    if (!(a[i] <= a[i+1])) {
                        int t = a[i];
                        int idx = indxs[i];
                        a[i] = a[i+1];
                        indxs[i] = indxs[i+1];
                        a[i+1] = t;
                        indxs[i+1] = idx;
                        sorted = false;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                result.append(indxs[i]).append(' ');
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
