package com.codeabby.SumOfTwo;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[2];
        try {
            Scanner in = new Scanner(System.in); //Import java.util.Scanner for it
            for (int j = 0; j < array.length ; j++) {
                int k = in.nextInt();
                array[j] = k;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        int result = array[0] + array[1];
        System.out.printf("" + result);
    }
}
