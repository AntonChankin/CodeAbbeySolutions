package com.codeabby.LinearFunction;

import java.util.Scanner;

/**
 * Very common problem in computational programming is to determine the underlying law to which some phenomenon obeys. For learning purpose let us practice a simple variant - discovering linear dependence by two given observations (for example, how the price for some product depends on its size, weight etc.)
 *
 *  Linear function is defined by an equation:
 *
 *  y(x) = ax + b
 *  Where a and b are some constants.
 * For example, with a=3, b=2 function will yield values y = 2, 5, 8, 11...
 * for x = 0, 1, 2, 3...
 *
 *  Your task is to determine a and b by two points, belonging to the function.
 * I.e. you are told two pairs of values (x1, y1), (x2, y2) which satisfy the function equation - and you should restore the equation itself.
 *
 *  Input data have the number of test-cases in the first line
 *  and then test-cases themselves in separate lines.
 *  Each case contains 4 integers (x1 y1 x2 y2).
 * Answers should be integer too and you are to write them in line, separating with spaces and enclosing each pair in parenthesis.
 */
public class Solution {

    public static int calcXMultiplier(int x1, int y1, int x2, int y2) {
        return (y1 - y2) / (x1 - x2);
    }

    public static int calcBias(int x1, int y1, int x2, int y2) {
        return (x1 * y2 - y1 * x2) / (x1 - x2);
    }

    public static void main(String[] args) {
        System.out.println("data:");
        StringBuilder result = new StringBuilder();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int x1 = in.nextInt();
                int y1 = in.nextInt();
                int x2 = in.nextInt();
                int y2 = in.nextInt();
                result.append('(').append(calcXMultiplier(x1, y1, x2, y2)).append(' ').append(calcBias(x1, y1, x2, y2)).append(')').append(' ');
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
