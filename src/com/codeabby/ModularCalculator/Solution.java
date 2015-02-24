package com.codeabby.ModularCalculator;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This task provides practice for core property of remainder taking operation in arithmetic - persisting of the remainder over addition and multiplication. This important property is often used for checking results of calculations, in competitive programming, in calculation checksums and especially for encryption.
 *  See Modular arithmetic for thorough explanations.
 *
 * A kind of long arithmetic calculation is given to you and the answer should contain the result modulo some number.
 *
 * If you are curious why modular arithmetic is that important, you can see Public Key Cryptography Intro and RSA Cryptography exercises.
 *
 * Input data will have:
 *
 * initial integer number in the first line;
 * one or more lines describing operations, in form sign value where sign is either + or * and value is an integer;
 * last line in the same form, but with sign % instead and number by which the result should be divided to get the remainder.
 * Answer should give remainder of the result of all operations applied sequentially (starting with initial number) divided by the last number.
 */
public class Solution {
    public static void main(String[] args) {
        BigInteger number = null;
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            number = BigInteger.valueOf(in.nextInt());
            char operation = in.next().charAt(0);
            while (operation != '%') {
                if (operation == '+') {
                    number = number.add(BigInteger.valueOf(in.nextInt()));
                } else if (operation == '*') {
                    number = number.multiply(BigInteger.valueOf(in.nextInt()));
                } else {
                    System.out.println("What?! " + operation);
                }
                operation = in.next().charAt(0);
            }
            number = number.remainder(BigInteger.valueOf(in.nextInt()));

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(number);
    }
}