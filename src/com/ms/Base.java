package com.ms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Base {

	static char[] symbols;
	
	static int initializeBase(File baseFile){
		try{
			FileReader f1 = new FileReader(baseFile);
			BufferedReader bufferedReader = new BufferedReader(f1);
			String line;
			while((line=bufferedReader.readLine())!=null){
			line = line.replaceAll("\\s", "");
			symbols = line.toCharArray();
			}
			}catch (Exception e) {
			}

		return symbols.length;
		
	}
	static int lookup(char c){
		
		for (int i=0;i<symbols.length;i++){
			if(symbols[i]==c){
				return i;
			}
		
		}
		return -1;
	}
	
	
}	
	
	
	
