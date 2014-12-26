package com.careercup;

/**
 * Created by saikat on 26/12/14.
 * A k-palindrome is a string which transforms into a palindrome on removing at most k characters.

 Given a string S, and an interger K, print "YES" if S is a k-palindrome; otherwise print "NO".
 Constraints:
 S has at most 20,000 characters.
 0<=k<=30

 Sample Test Case#1:
 Input - abxa 1
 Output - YES
 Sample Test Case#2:
 Input - abdxa 1
 Output - No
 */
public class KPalindrome {

    public static boolean checkPalindrome(String s, int k){

        int len = s.length();
        StringBuffer s1,s2;
        if(len%2==0) {
             s1 = new StringBuffer(s.substring(0, len / 2));
             s2 = new StringBuffer(s.substring(len/2,len)).reverse();
        }else
        {
             s1 = new StringBuffer(s.substring(0, (len / 2)+1));
             s2 = new StringBuffer(s.substring(len/2+1,len)).reverse();
        }

        while(k!=0){

                s1.deleteCharAt((s1.length()-1));
                k--;
                if(k==0){
                    break;
                }
                s2.deleteCharAt((s2.length()-1));
                k--;
                if(k==0){
                    break;
                }
            }

            if(s1.length()>s2.length()){
                s1.deleteCharAt(s1.length()-1);
            }
            else if(s1.length()<s2.length()){
                s2.deleteCharAt(s2.length()-1);
            }

        if(s1.toString().equals(s2.toString())){
                return true;
            }

        return false;
    }

    public static int modifiedEditDistance(String a,String b, int k){
        int i, j, n = a.length();
        // for simplicity. we should use only a window of size 2*k+1 or
        // dp[2][MAX] and alternate rows. only need row i-1
        int dp[][] = new int [n+1][n+1];
        for (i = 0 ; i < n; i++)
            dp[i][0] = dp[0][i] = i;

        for (i = 1; i <= n; i++) {
            int from = Math.max(1, i - k), to = Math.min(i + k, n);
            for (j = from; j <= to; j++) {
                if (a.charAt(i-1) == b.charAt(j-1))			// same character
                    dp[i][j] = dp[i-1][j-1];
                // note that we don't allow letter substitutions

                dp[i][j] = Math.min(dp[i][j], 1 + dp[i][j - 1]); // delete character j
                dp[i][j] = Math.min(dp[i][j], 1 + dp[i - 1][j]); // insert character i
            }
        }
        return dp[n][n];
    }

    public static void main(String args[]){
        System.out.println(new KPalindrome().checkPalindrome("abxa",1));
        System.out.println(new KPalindrome().modifiedEditDistance("abxa", "axba", 1));

    }



}
