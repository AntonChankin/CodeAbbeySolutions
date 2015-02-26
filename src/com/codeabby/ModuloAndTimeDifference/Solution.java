package com.codeabby.ModuloAndTimeDifference;

import java.util.Scanner;

/**
 * Dealing with remainders may cause heavy headache to novice programmers. Let us write a simple program which has this operation for its core to study integer division better. At the same time we'll have some practice in handing dates - which sometimes gives headache even to experienced coders.
 *
 *  In arithmetic, the remainder (or modulus) is the amount "left over" after performing the division of two integers which do not divide evenly (from Wiki). This task will provide further practice with modulo operation.
 *
 *  Suppose, you are given two timestamps - for example, when the train or ferry boat starts its travel and when it finishes. This may look like:
 *
 * start: May 3, 17:08:30
 * end  : May 8, 12:54:15
 * and you are curious to know, how much time (in days, hours, minutes and seconds) is spent in traveling (perhaps, to choose faster variant). How this could be achieved?
 *
 * One of the easiest way is:
 *
 * convert both timestamps to big numbers, representing seconds from the beginning of the month (or year, or century);
 * calculate their difference - i.e. travel time in seconds;
 * convert this difference back to days, hours, minutes and seconds.
 * First operation could be performed by multiplying minutes by 60 and hours by 60*60 etc. and summing all values up.
 * The third operation should be performed on contrary by several divisions with keeping remainders.
 *
 * In this task you will be given several pair of timestamps. We suppose that both dates in the pair are always in the same month, so only number of day will be given. You are to calculate difference between timestamps in each pair.
 *
 * Input data: the first line contains number of test-cases, other lines contain test-cases themselves.
 * Each test-case contains 8 numbers, 4 for each timestamp: day1 hour1 min1 sec1 day2 hour2 min2 sec2 (second timestamp will always be later than first).
 * Answer: for each test-case you are to output difference as following (days hours minutes seconds) - please note brackets - separated by spaces.
 */
public class Solution {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        System.out.println("data:");
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int day1 = in.nextInt();
                int hour1 = in.nextInt();
                int min1 = in.nextInt();
                int sec1 = in.nextInt();

                int day2 = in.nextInt();
                int hour2 = in.nextInt();
                int min2 = in.nextInt();
                int sec2 = in.nextInt();

                long time1 = sec1 + 60 * min1 + 3600 * hour1 + 86400 * day1;
                long time2 = sec2 + 60 * min2 + 3600 * hour2 + 86400 * day2;

                time2 -= time1;

                sec2 = (int)time2 % 60;
                time2 /= 60;
                min2 = (int)time2 % 60;
                time2 /= 60;
                hour2 = (int)time2 % 24;
                time2 /= 24;
                day2 = (int)time2;
                result.append('(').append(day2).append(' ').append(hour2).append(' ').append(min2).append(' ').append(sec2).append(')').append(' ');
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("answer:");
        System.out.println(result);
    }
}
