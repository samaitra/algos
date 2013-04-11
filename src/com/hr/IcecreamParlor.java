package com.hr;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IcecreamParlor {


    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        for(int i=0;i<n;i++){
            int storeCredit = in.nextInt();
            int numItems = in.nextInt();
            int itemList[] = new int[numItems];
            for(int j=0;j<numItems;j++){
                itemList[j]=in.nextInt();
            }


            OutLoop :for(int k=0;k<numItems;k++){

                InLoop :for(int l=k+1;l<numItems;l++){
                    if(itemList[k]+itemList[l]==storeCredit){
                        System.out.println((k+1) + " "+ (l+1));
                        break OutLoop;
                    }
                }


            }


        }


    }
}