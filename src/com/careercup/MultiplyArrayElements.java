package com.careercup;

import java.util.Arrays;

/**
	input [2,3,1,4]
	output [12,8,24,6]
	
	Multiply all fields except it's own position.
	
	Restrictions:
	1. no use of division
	2. complexity in O(n)
**/
public class MultiplyArrayElements {

	
	static int[] multiplyAll(int[] a){
		int[] pre = new int[a.length];
		int[] post = new int[a.length];
		int[] res  = new int[a.length];
 		pre[0] = 1;
		post[(post.length-1)] = 1;
		
		for(int i=1;i<a.length;i++)
			pre[i] = pre[i-1]*a[i-1];
		for(int i=post.length-2;i>=0;i--)
			post[i] = post[i+1]*a[i+1];
		for(int i=0;i<a.length;i++)
			res[i] = pre[i]*post[i];
		
		return res;
		
		
	}
	
	public static void main(String[] args){
		 int[] a = {2,3,1,4};
		 int[] resArray = new MultiplyArrayElements().multiplyAll(a);
		 for(int i:resArray){
			 System.out.print(i+" ");
		 }		
	}
}
