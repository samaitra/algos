package com.topcoder;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 6/18/13
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class SwappingDigits {

    public String minNumber(String num){
        char[] chars = num.toCharArray();
        int n = num.length();
        String minNum = num;
        BigInteger b = null;
        for(int i=0;i<n;i++)
        {    char[] x = chars;
            for(int j=0;j<n;j++){

                x = chars;
                char temp = x[i];
                x[i]=x[j];
                x[j]=temp;

                String newMin = new String(x);
                System.out.println("i "+i);
                System.out.println("j "+j);

                BigInteger b1 = new BigInteger(newMin);
                BigInteger b2 = new BigInteger(minNum);
                b = (b1.min(b2));
                //minNum = newMin;
                //System.out.println("newMin = "+newMin);

            }
        }


       String str = String.valueOf(b);

        return str;
    }

    public static void main(String[] args){
      String s = new SwappingDigits().minNumber("93218910471211292416");
      System.out.println("s "+s);

    }
}
