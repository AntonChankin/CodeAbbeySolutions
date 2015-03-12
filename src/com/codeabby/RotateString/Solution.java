package com.codeabby.RotateString;

import java.util.Scanner;

/**
 * To rotate string by K characters means to cut these characters from the beginning and transfer them to the end. If K is negative, characters, on contrary should be transferred from the end to the beginning.
 *
 * Input data will contain the number of test-cases in the first line.
 * Following lines will contain number K and some string S separated by space - one pair in each line.
 * String S will contain only small latin letters. K will not exceed half the length of S by absolute value.
 * Answer should contain strings rotated in accordance with the rule above, separated by spaces. For example:
 *
 * input data:
 * 2
 * 3 forwhomthebelltolls
 * -6 verycomplexnumber
 *
 * answer:
 * whomthebelltollsfor numberverycomplex
 * The task could be easily solved by creating new instance of string concatenating two substrings. However, if you want more serious challenge, you are encouraged to perform rotation "in-place", moving bytes of original string (i.e. without allocating memory for new instance). This could be done with the help of a loop and only one temporary variable.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int shift = in.nextInt();
                String str = in.next().trim();
                char[] chars = str.toCharArray();
                if (shift > 0) {
                    for (int j = shift; j < chars.length; j++) {
                        result.append(chars[j]);
                    }
                    for (int j = 0; j < shift; j++) {
                        result.append(chars[j]);
                    }
                    result.append(' ');
                } else {
                    for (int j = chars.length + shift; j < chars.length; j++) {
                        result.append(chars[j]);
                    }
                    for (int j = 0; j < chars.length + shift; j++) {
                        result.append(chars[j]);
                    }
                    result.append(' ');
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}

/**
 Author's notes on this problem
 Though the task could be written in a single line using cool string manipulation functions in Python and similar languages, of course it is a kind of cheating: really you are creating new string consisting of two parts of old one.

 Proper challenge arose when you will try to rotate the string "in place", i.e. without creating new one, only substituting characters in it.

 Good approach is to revert the string twice - around the center and then around some other point so that you will get the nicely rotated string:

 Rotate by 6 letters:

 initial: A B C D E F G H I J K L M N O P

 1st rev: P O N M L K J I H G F E D C B A
 ^-- center 1
 2nd rev: K L M N O P A B C D E F G H I J
 ^-- center 2
 The only trick is therefore to find out the position of the second center :)
 */
