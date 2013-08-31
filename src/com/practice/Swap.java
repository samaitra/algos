import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Swap{
	
	static int[] a = {0,1,2};
	static int[] b = {0,2,1};
	static int misMatchedIndex = -1;
	static int zeroedIndex = -1;


	public static void main(String[] args){

		
		for(int i=0;i<a.length;i++){

			if(a[i]==0){
				 zeroedIndex = 0;
			}

			if(a[i]!=b[i]){

				misMatchedIndex = i;

			}

			if(misMatchedIndex>-1 && zeroedIndex>-1){
				

				swap(a,misMatchedIndex,zeroedIndex);
				int targetVal = b[misMatchedIndex];

				for(int j=0;j<a.length;j++){
					if(a[j]==targetVal){
						swap(a,j,misMatchedIndex);
					}
				}	



			}


		}
		
		for(int i =0;i<a.length;i++){
		System.out.print(a[i]+" ");
		}	
	}
	
	public static void swap(int[] a,int misMatchedIndex,int zeroedIndex){
		int temp = a[misMatchedIndex];
		a[misMatchedIndex] = a[zeroedIndex];
		a[zeroedIndex] = temp;

	}

}
