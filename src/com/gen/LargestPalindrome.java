package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/9/13
 * Time: 8:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class LargestPalindrome {

    public static void main(String[] args){

        String str = "abccbabacbcacba";

        int centers = 2*str.length()-1;
        int radii = str.length()-1;
        int maxCen = 0;
        int maxRad = 0;

        for(int cen=0;cen<centers;cen++){
            for(int rad=0;rad<radii;rad++){

                if(cen-rad<0||cen+rad>centers)
                    break;
                else if((cen+rad)%2==1)
                    continue;
                else if(str.charAt((cen-rad)/2) != str.charAt((cen+rad)/2))
                    break;
                else{
                    if(rad>maxRad){
                        maxRad = rad;
                        maxCen = cen;
                    }
                }



            }
        }

        System.out.println(str.substring((maxCen-maxRad)/2,(maxCen+maxRad)/2+1));


    }

}
