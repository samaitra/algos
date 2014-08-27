package com.topcoder;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 06/04/13
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheNumberGameDivTwo {

    public String find(int a){
        int start = a;
        int c=0;
        for(int i=start;i>0;i--){
            if(a%i==0){
                a=i;
                c++;
            }
        }


        if(c%2==0){
        return "Brus";
        }else{return "John";}
    }

    public static void main(String[] args){
        TheNumberGameDivTwo x = new TheNumberGameDivTwo();
        System.out.println(x.find(128));
    }

}
