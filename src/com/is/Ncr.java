package com.is;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;


public class Ncr {

	static HashMap<BigInteger, BigInteger> factorialMap = new HashMap<BigInteger, BigInteger>();
	
	public static void main(String[] args) throws IOException {

		//BufferedReader bufferedReader = new BufferedReader(new FileReader("./nCr_testcases/input00.txt"));
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int numTestcases = Integer.parseInt(bufferedReader.readLine());
			
		for(int l=0;l<numTestcases;l++){
			
			String line = bufferedReader.readLine();
			String[] as = line.split(" ");
        	int[] a = new int[as.length];
			
        	for(int k=0;k<as.length;k++){
        		a[k]=Integer.parseInt(as[k]);
        	}
			
        	int n = a[0];
			int r = a[1];
			
			for(int i=1;i<=n;i++){
				BigInteger ibig = new BigInteger(String.valueOf(i));
				BigInteger fact = factorial(ibig);
				factorialMap.put(ibig,fact);
			}
			
			
			BigInteger nfact = factorialMap.get(new BigInteger(as[0]));
			BigInteger rfact = factorialMap.get(new BigInteger(as[1]));
			int x=n-r;
			
			BigInteger dfact = factorialMap.get(new BigInteger(String.valueOf(x)));
			BigInteger mul = dfact.multiply(rfact);
			BigInteger result = nfact.divide(mul);
			result = result.mod(new BigInteger("142857"));
			System.out.println(result);
			
			
			
			}
		}

	public static BigInteger factorial(BigInteger value) {
	    BigInteger total = BigInteger.ONE;
	    for (int i = 0; value.compareTo(BigInteger.ONE) == 1; i++) {
	        total = total.multiply(value);
	        value = value.subtract(BigInteger.ONE);
	    }
	    return total;
	    }
	  }
	

