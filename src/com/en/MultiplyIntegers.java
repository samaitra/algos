package com.en;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 28/07/13
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultiplyIntegers {
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new FileReader("multiplyintegers/in"));
      //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
    	int globalVal = 1;
    	int[] a = new int[N];
    	int numZeros=0;
        for(int i=0;i<N;i++){
    		int num = Integer.parseInt(br.readLine());
    		a[i] = num;

            if(num==0){
                numZeros++;
            }

            if(numZeros>=2){
              globalVal=0;
            }
            else if(num!=0){
    		  globalVal = globalVal * num;
            }
    	}
    	for(int i=0;i<N;i++){
    		if(a[i]==0){
                System.out.println(globalVal);
            }else if(a[i]!=0 && numZeros==1){
                System.out.println(0);
            }
            else{
            System.out.println(globalVal/a[i]);
            }
          }
    }


}
