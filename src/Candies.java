import java.io.File;
import java.util.Date;
import java.util.Scanner;


public class Candies {

	public static void main(String[] args) throws Exception{

//		Date starttime = new Date();
//		File f =  new File("./Candies/input01.txt");
//		Scanner in = new Scanner(f);

        Scanner in = new Scanner(System.in);
		int N;
		N = in.nextInt();
	
		int x[] = new int[N];
			
		for(int i=0; i<N; i++){
			x[i] = in.nextInt();
		}
		int minCandies = 1;
		int candies = 1;
		
		for(int i=1;i<N;i++){
			//System.out.println("i "+i);
			//System.out.println("x[i] "+x[i]);
			
			if(x[i]>x[i-1]){
				minCandies=minCandies+1;
				candies=candies+minCandies;
				
			}else{
				minCandies=1;
				candies=candies+minCandies;
				
			}
			//if(minCandies<=0)
				//System.out.println("minCandies "+minCandies);
			//System.out.println("candies "+candies);
		}
		System.out.println(candies);
//		Date endtime = new Date();
//		long time=endtime.getTime()-starttime.getTime();
//		System.out.println("Time taken "+time+"milisecs");
//				

		
	}

}
