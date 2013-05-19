package com.ms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Driver {

	static File fout;
	
	public static void main(String[] argv){
		
		File f1 = new File(argv[0]);
		File f2 = new File(argv[1]);
		int k = Integer.parseInt(argv[2]);
		fout = new File(argv[3]);
		
		Base.initializeBase(f1);
		Number num = new Number();
		try{
	    BufferedReader bufferedReader = new BufferedReader(new FileReader(f2));
	    BufferedReader bufReader = new BufferedReader(new FileReader(f2));
	    
	    String line;
	    int numLines=0;
	    while((line=bufferedReader.readLine())!=null){
	    	numLines++;
	    }
	    Number list[] = new Number[numLines];
	    int index=0;
	    //bufferedReader.reset();
	    while((line=bufReader.readLine())!=null){
	    	//System.out.println(line);
	    	
	    	list[index]=num.createNumber(line);
	    	//num.convert(list[index],10);
	    	index++;
	    	
	    }
	    
	    Number n = num.quickselect(list, list.length, k);
	    num.printNumber(n);
	    
	    
	    
	   // num.convert(n, 10);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
	}
	
}
