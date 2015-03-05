package com.codeabby.Palindromes;

import java.util.Scanner;

/**
 * The word or whole phrase which has the same sequence of letters in both directions is called a palindrome. Here are few examples:
 *
 *  Stats
 *  Amore, Roma
 *  No 'x' in Nixon
 *  Was it a cat I saw?
 *  As you see, case of the letters is ignored. Spaces and punctuations are ignored too.
 *
 *  Your goal in this programming exercise is to determine, whether the phrase represents a palindrome or not.
 *
 *  Input data contains number of phrases in the first line.
 *  Next lines contain one phrase each.
 * Answer should have a single letter (space separated) for each phrase: Y if it is a palindrome and N if not.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("data:");
        StringBuilder result = new StringBuilder();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.nextLine();
            for (int i = 0; i < n; i++) {
                boolean isPalindrome = true;
                String chars = in.nextLine();
                int revIdx = chars.length() -1;
                for (int j = 0; j < chars.length(); j++) {
                    while (j < chars.length() && !Character.isLetter(chars.charAt(j))) {
                        j++;
                    }
                    while (0 <= revIdx && !Character.isLetter(chars.charAt(revIdx))) {
                        revIdx--;
                    }
                    if (j < chars.length()) {
                        String beginning = chars.substring(j,j+1);
                        String ending = chars.substring(revIdx, revIdx+1);
                        if (!beginning.equalsIgnoreCase(ending)) {
                            isPalindrome = false;
                            break;
                        }
                        revIdx--;
                    }
                }

                if (isPalindrome) {
                    result.append("Y ");
                } else {
                    result.append("N ");
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
