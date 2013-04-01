package com.hr;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


public class Median {

	public static void main(String[] args) throws Exception {
		
//		Date starttime = new Date();
//		File f =  new File("./Median/input00.txt");
//		
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(f);
		int N;
		N = in.nextInt();
	
		String s[] = new String[N];
		int x[] = new int[N];
			
		for(int i=0; i<N; i++){
			s[i] = in.next();
			x[i] = in.nextInt();
		}
	    float median; 
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i=0;i<N;i++){
			//System.out.println("s[i]  "+s[i]+"  x[i]  "+x[i]);
			
			if(s[i].equals("a")){
	    		 Integer val = x[i];
	    		 alist.add(val);
	    		 printMedian(alist);
	 	    	 
	    	 }else if(s[i].equals("r")){
	    		 Integer o = x[i];
	 	    	 if(find(alist,o)){
	    		 alist.remove(o);
	    		 printMedian(alist);
	 	    	   if(alist.size()==0){
	    			   System.out.println("Wrong!");
	    		   }
	 	    	 }else{
	 	    		 System.out.println("Wrong!");
	 	    	}
	    	 } 
			 
	    	 
	        }
	   
//		Date endtime = new Date();
//		long time=endtime.getTime()-starttime.getTime();
//		System.out.println("Time taken "+time+"milisecs");
//				
		
	}
	
	public static void printMedian(ArrayList<Integer> alist){
		 Collections.sort(alist);
		 
		    if (alist.size() % 2 == 1)
			System.out.println(alist.get((alist.size()+1)/2-1));
		    else
		    {
		    try{	
			double lower = alist.get(alist.size()/2-1);
			double upper = alist.get(alist.size()/2);
		    
			double median = ((lower + upper) / 2.0);
			System.out.println(new DecimalFormat("#.##").format(median));
		    }catch(Exception e){
		    	//e.printStackTrace();
		    }
		    }	
		
		
	}
	public static boolean find(ArrayList<Integer> alist,Integer o){
		
		Collections.sort(alist);
		
		if (alist.size() == 0) {
		      return false;
		    }
		
		    int low = 0;
		    int high = alist.size()-1;

		    while(low <= high) {
		      int middle = (low+high) /2; 
		      if (o > alist.get(middle)){
		        low = middle +1;
		      } else if (o < alist.get(middle)){
		        high = middle -1;
		      } else { // The element has been found
		        return true; 
		      }
		    }
		    return false;
		  }
	
}


