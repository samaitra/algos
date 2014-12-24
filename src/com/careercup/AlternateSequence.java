package com.careercup;

import java.util.Arrays;

public class AlternateSequence {

	private int[] order(int a[]){
		Arrays.sort(a);
	
		int b[] = new int[a.length];
		int i=0,j=a.length-1,k=0;
		while(i<a.length){
			if(k<a.length){
			b[k]=a[i];
			k++;
			}
			if(k<a.length){
			b[k]=a[j];
			k++;
			}
			i++;
			j--;
		}
		
		
		
		return b;
	}
	
	public static void main(String[] args){
	int a[] = {1,5,9,8,10}; 
	a = new AlternateSequence().order(a);
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	}
}
