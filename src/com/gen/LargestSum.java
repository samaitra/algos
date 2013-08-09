package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/9/13
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class LargestSum {

    static int[] a = {1, 3, 4, -7, 12};

    public static void main(String[] args){

        int cs = 0;
        int ce = 0;
        int tempsum = 0;

        int ms = 0;
        int me = 0;
        int maxsum = 0;

        while (ce!=a.length){

            tempsum += a[ce];

            if(tempsum>maxsum){
             ms = cs;
             me = ce;
             maxsum = tempsum;
            }

            if(tempsum<=0){
                cs = ce+1;
                tempsum=0;
            }
          ce++;
        }

        System.out.println("mx sum "+maxsum);
        System.out.println("Indexes( " + ms + "," + me + " )");

    }
}
