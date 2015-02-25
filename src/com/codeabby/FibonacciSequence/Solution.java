package com.codeabby.FibonacciSequence;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Even beginner programmers are usually acquainted with the Fibonacci Sequence which is generated as following:
 *
 *  0-th value is 0;
 * 1-st value is 1;
 *  all next values are sum of two immediately preceeding.
 * So we have:
 *
 *  0: 0
 *  1: 1
 * 2: 1 = 0 + 1
 *  3: 2 = 1 + 1
 *  4: 3 = 1 + 2
 *  5: 5 = 2 + 3
 * 6: 8 = 3 + 5
 * and so on, so if you continue calculations yourself, you get the the beginning of the sequence like this:
 *
 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, ...
 *  One easily notes that values grow fast! The 17-th value already exceeds thousand, the 31-st is larger than million.
 *
 *  Problem statement
 *
 *  You will be given several Fibonacci numbers. Your task is to tell their indices in the sequence.
 *
 *  Input data contain the amount of Fibonacci numbers to process.
 *  Next lines contain one Fibonacci number each (from the first 1000 values).
 *  Answer should contain their indices in the sequence, separated by spaces.
 *
 *  Example:
 *
 *  input data:
 *  5
 *  610
 *  34
 *  0
 * 1346269
 * 10946
 *
 *  answer:
 *  15 9 0 31 21
 * Take care: values could be of hundred or more digits long!
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            long[] indexes = new long[n];
            BigInteger[] numbers = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = new BigInteger(in.next());
            }
            BigInteger fibonacciPrev = BigInteger.ONE;
            BigInteger fibonacci = BigInteger.ONE;
            long index = 0;
            int found = 0;
            while (found < numbers.length) {
                BigInteger newVal;
                if (index == 0) {
                    newVal = BigInteger.ZERO;
                } else if (index == 1 || index == 2) {
                    newVal = BigInteger.ONE;
                } else {
                    newVal = fibonacci.add(fibonacciPrev);
                    fibonacciPrev = fibonacci;
                    fibonacci = newVal;
                }
                for (int i = 0; i < numbers.length; i++) {
                    if (newVal.equals(numbers[i])) {
                        found++;
                        indexes[i] = index;
                        break;
                    }
                }
                index++;
            }
            for (int i = 0; i < n; i++) {
                result.append(indexes[i]).append(' ');
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
