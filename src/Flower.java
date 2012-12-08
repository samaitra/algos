
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Flower {

	public static void main(String[] args) throws Exception {
		
		//Date starttime = new Date();
		
		//File f =  new File("./Flower/input01.txt");
		try {
			Scanner in = new Scanner(System.in);
			//Scanner in = new Scanner(f);
			int N, K;
			N = in.nextInt();
			K = in.nextInt();
			//System.out.println("K "+K);
			int C[] = new int[N];
			
			for(int i=0; i<N; i++){
				C[i] = in.nextInt();
				
			}
			
			Arrays.sort(C);
			int x=0;
			int price=0; 
			int c=1;
			
			for(int j=N-1;j>=0;j--){		
		      	//System.out.println("x "+x);			
				price=price+((x+1)*C[j]); 
			    
				
			    if(c==K){
					x=x+1;
					c=0;
			    }
			    c=c+1;
			    

			}
			
		System.out.println(price);
		//Date endtime = new Date();
		//long time=endtime.getTime()-starttime.getTime();
		//System.out.println("Time taken "+time+"milisecs");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	
	
	}
	}