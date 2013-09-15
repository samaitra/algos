package com.cc;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 15/09/13
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxDiff {

    public static void main(String[] args){

        int[] a = {2, -1, -2, 1, -4, 2, 8};

        int d = computeMaxDiff(a);
        System.out.println(d);
    }
    public static int computeMaxDiff(int[] A) {
        int[] max = new int[A.length];
        int[] min = new int[A.length];
        max[0] = A[0];
        min[0] = A[0];
        int len = A.length-1;
        int currentMax = max[0];
        int currentMin = -min[0];
        for(int i = 1; i <= len; i++) {
            currentMax += A[i];
            if(currentMax > 0) {
                max[i] = Math.max(currentMax, max[i-1]);
            } else {
                max[i] = max[i-1];
                currentMax = 0;
            }

            currentMin += -A[i];
            if(currentMin > 0) {
                min[i] = -Math.max(currentMin, -min[i-1]);
            } else {
                min[i] = A[i];
                if(A[i] < 0) {
                    currentMin = -A[i];
                } else {
                    currentMin = 0;
                }
            }
        }

        int[] revMax = new int[A.length];
        int[] revMin = new int[A.length];
        revMax[0] = A[len];
        min[0] = A[len];

        currentMax = revMax[0];
        currentMin = -revMin[0];
        for(int i = len-1; i >= 0; i--) {
            currentMax += A[i];
            if(currentMax > 0) {
                revMax[len-i] = Math.max(currentMax, revMax[len-i-1]);
            } else {
                revMax[len-1] = revMax[len-i-1];
                currentMax = 0;
            }

            currentMin += -A[i];
            if(currentMin > 0) {
                revMin[len-i] = -Math.max(currentMin, -revMin[len-i-1]);
            } else {
                revMin[len-i] = A[i];
                if(A[i] < 0) {
                    currentMin = -A[i];
                } else {
                    currentMin = 0;
                }
            }
        }

        int maxDiff = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            int currMax = Math.max(Math.abs(max[i] - revMin[i]), Math.abs(min[i]-revMax[i]));
            if(currMax > maxDiff) {
                maxDiff = currMax;
            }
        }
        return maxDiff;
    }
}
