package com.codeabby.PrimeNumbersGeneration;

import java.util.Scanner;

/**
 * In this task you are to implement the primes generator, which is described in the article on Prime Numbers.
 *
 * Create the array (or list) of prime numbers in ascending order, i.e.:
 *
 * [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...]
 * And then print the primes corresponding to the indices given in the input data.
 *
 * Input data will contain the amount of primes to print in the first line.
 * Next line will contain indices of array of primes for which values should be printed. They will be in range from 1 to 200000.
 * Answer should contain prime numbers corresponding the specified positions of the array.
 *
 * Note that for this task we start indexing an array from 1 rather than 0 (this may help you in checking your program with many lists of primes which could be found online).
 */
public class Solution {
    private static int MAX_PRIME_INDEX = 200000;

    public static String getPrimeNumbers(int[] indexes) {
        StringBuilder answer = new StringBuilder();
        long[] primes = new long[MAX_PRIME_INDEX];
        primes[0] = 2;
        int status = 1, num = 3;
        for ( int count = 2 ; count <= MAX_PRIME_INDEX ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                primes[count-1] = num;
                count++;
            }
            status = 1;
            num++;
        }
        for (int i = 0; i < indexes.length; i++) {
            answer.append(primes[indexes[i]-1]).append(' ');
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String result = null;
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] indexes = new int[n];
            for (int i = 0; i < n; i++) {
                indexes[i] = in.nextInt();
            }
            result = getPrimeNumbers(indexes);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }

}
