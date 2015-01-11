package com.careercup;

/**
 * Created by saikat on 1/11/2015.
 * A string is called sstring if it consists of lowercase english letters and no two of its consecutive characters are the same.

 * given string s of length n. Calculate the number of sstrings of length that are not lexicographically greater than s.
 * Input format
 * The only line of input contains the string s. It's length is not greater than 100.
 * All characters of input are lowercase english letters.

 * Output format:
 * Print the answer of test modulo 1009 to the only line of output.

 * Sample input:
 * bcd

 * Sample output:
 * 653
 *
 *
 */
public class Sstring {
    static int MOD = 1009;
    int calculateSstring(String s)
    {
        int[] a = new int[s.length()];
        a[0] = 1;
        for (int i = 1; i < a.length; i++)
        {
            a[i] = (a[i - 1] * 25) % MOD;
        }

        int result = 0;

        for (int i = 0; i < s.length(); i++)
        {
            for (char ch = 'a'; ch < s.charAt(i); ch++)
            {
                //System.out.println(ch);
                if (i > 0 && s.charAt(i - 1) == ch) continue;

                result = (result + a[s.length() - i - 1]) % MOD;
            }
        }

        return (result + 1) % MOD;
    }

    public static void main(String[] args){
        System.out.print(new Sstring().calculateSstring("bcd"));

    }
}
