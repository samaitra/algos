import java.io.File;
import java.util.Date;
import java.util.Scanner;


public class Candies {

	public static void main(String[] args) throws Exception{

		Date starttime = new Date();
		File f =  new File("./Candies/input00.txt");
		Scanner in = new Scanner(f);

		//Scanner in = new Scanner(System.in);
		int N;
		N = in.nextInt();
	
		int x[] = new int[N];
			
		for(int i=0; i<N; i++){
			x[i] = in.nextInt();
		}
		
		
		
		Date endtime = new Date();
		long time=endtime.getTime()-starttime.getTime();
		System.out.println("Time taken "+time+"milisecs");
				

		
	}

}
