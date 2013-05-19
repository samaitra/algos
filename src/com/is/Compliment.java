package com.is;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Compliment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader bufferedReader = new BufferedReader(new FileReader("./2s-complement_testcases/input01.txt"));

		int numTestcases = Integer.parseInt(bufferedReader.readLine());
			
		for(int l=0;l<numTestcases;l++){
			
			String line = bufferedReader.readLine();
			//System.out.println(line);
			String[] as = line.split(" ");
        	int[] a = new int[as.length];
			for(int k=0;k<as.length;k++){
        		a[k]=Integer.parseInt(as[k]);
        	}
			int start = a[0];
			int end = a[1];
			int sum = 0;
			for(int i=start;i<=end;i++){
			    
				String binary = Integer.toBinaryString(i);
			    char[] b = binary.toCharArray();
			    for(char c: b){
			    	if (c=='1'){
			    		sum=sum+1;
			    	}
			    }
			    //System.out.println("i "+i);
				//System.out.println("binary "+binary);
			}
			System.out.println(sum);
			
			//System.out.println("start "+start);
			//System.out.println("end "+end);
			
				
				
		}
		
		}
	}

		
		
		


