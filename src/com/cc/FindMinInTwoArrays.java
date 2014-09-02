package com.cc;

import java.util.Arrays;

public class FindMinInTwoArrays {

	
	public int findMin(int a[],int b[]){
	
		int i=0,j=0;
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		while(i<a.length-1 && j<b.length-1){
			
			if(a[i]<b[j])
				i++;
			if(a[i]>b[j])
				j++;
				
			if(a[i]==b[j])
				return a[i];
				
			
		}
		
		return -1;
	}
	
	public static void main(String args[]){
		int a[] = {1,4,7,8,10};
		int b[] = {3,5,6,9,10};
		System.out.println(new FindMinInTwoArrays().findMin(a, b));
	}
	
}
