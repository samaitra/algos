/*
 Enter your code here. Read input from STDIN. Print output to STDOUT
 Your class should be named Solution
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class Pairs {

	public static void main(String[] args) throws Exception {
		
		//Date starttime = new Date();
		
		//File f =  new File("./Pairs/input02.txt");
		try {
			//BufferedReader br = new BufferedReader(new FileReader(f));
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String firstline = (br.readLine());
		    String a[] = firstline.split(" ");
		    int n = Integer.parseInt(a[0]);
		    int k = Integer.parseInt(a[1]);
		    //System.out.println("n == "+n);
		    //System.out.println("k === "+k);
		    
		    String secondline = br.readLine();
		    String num[] = secondline.split(" ");
		    int arr[]=new int[num.length];
		    
		    for(int i=0;i<num.length;i++){
		      arr[i] = Integer.parseInt(num[i]);	
		    }
		    Arrays.sort(arr);
		    //System.out.println("length of num "+num.length);
		    int c=0;
		    for(int i=0;i<arr.length;i++){
		    	int num1 = arr[i]+k;	
		    	if(contains(arr,num1)){
		    	c=c+1;
		    	}
		    }
		System.out.println(c);
		
		//Date endtime = new Date();
		//long time=endtime.getTime()-starttime.getTime();
		//System.out.println("Time taken "+time+"milisecs");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	
	
	}
	public static boolean contains(int[] a, int b) {
	    if (a.length == 0) {
	      return false;
	    }
	    int low = 0;
	    int high = a.length-1;

	    while(low <= high) {
	      int middle = (low+high) /2; 
	      if (b> a[middle]){
	        low = middle +1;
	      } else if (b< a[middle]){
	        high = middle -1;
	      } else { // The element has been found
	        return true; 
	      }
	    }
	    return false;
	  }
}
