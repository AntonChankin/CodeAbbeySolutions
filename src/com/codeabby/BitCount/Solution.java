package com.codeabby.BitCount;

import java.util.Scanner;

/**
 * As you probably know, all values inside a computer are represented in binary system. In this simple task you are to write a program which counts the number of non-zero bits in a given value.
 *
 * We are using 32-bit integer values, so there should be from 0 to 32 non-zero bits.
 *
 * Please note that unlike most languages Python pretends that numbers are infinite-length (this will not prevent you from solving this task, though some of methods usable for other languages may not work as expected).
 *
 * For example:
 *
 * value             binary                count
 * 1   00000000000000000000000000000001      1
 * 100   00000000000000000000000001100100      3
 * -1   11111111111111111111111111111111     32
 * Input data will contain a number of values to process.
 * Next line will contain the values themselves, each in range -2 000 000 000 .. 2 000 000 000.
 * Answer should contain the counts of bits set to 1 for each of values, separated by spaces.
 */
public class Solution {

    public static final int INT_SIZE = 32;

    public static void main(String[] args) {
        System.out.println("data:");
        StringBuilder answer = new StringBuilder();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int val = in.nextInt();
                int count = 0;
                int mask = 1;
                for (int j = 0; j < INT_SIZE; j++) {
                    if ((val & mask) > 0) {
                        count++;
                    }
                    mask = mask << 1;
                }
                if (val < 0) count++;
                answer.append(count).append(' ');
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(answer);
    }
}
