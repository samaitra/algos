package com.hr;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Candies {

	public static void main(String[] args) throws Exception{

		 int n, i, j, sum=0;
		 File f = new File("./Candies/input01.txt");
		 Scanner in = new Scanner(f);
		 //Scanner in = new Scanner(System.in);
		 
		 n = in.nextInt(); 
         int rating[] = new int[n];
         int candies[] = new int[n];
        for(i=0;i<n;i++)
                rating[i]=in.nextInt();
        for(i=0;i<n;i++){
                candies[i]=1;
                if(i>0){
                        if(rating[i]>rating[i-1])
                                candies[i]=candies[i-1]+1;
                        else{
                                j=i;
                                while(j>0 && rating[j]<rating[j-1]){
                                        candies[j-1]=max(candies[j-1],candies[j]+1);
                                        j--;
                                }
                        }
                }
        }
        for(i=0;i<n;i++)
                sum+=candies[i];
    System.out.println(sum);
    }

	public static int max(int x,int y){
		return x>y?x:y;
	}
}
