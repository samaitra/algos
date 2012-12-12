import java.io.File;
import java.util.Scanner;


public class StringReduction {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		int n;
		File f = new File("./StringReduction/input00.txt");
		Scanner in = new Scanner(f);
		n = in.nextInt();
		
		for(int i=0;i<n;i++){
	    
			String s= in.next();
		    String x=""; 
		    for(int j=0;i<s.length();j++){
			  if(j>0){
                 if(s.charAt(j)!=s.charAt(j+1))
                     x=x+getchar(s.charAt(j),s.charAt(j+1));   
                 else{
                        int k=j;
                        while(k>0 && x.charAt(k)<rating[j-1]){
                                candies[j-1]=max(candies[j-1],candies[j]+1);
                                j--;
                        }
                }
        }
		}
		
	}


}
}
public static char getchar(char x,char y){
	
if(x=='a'){
	if(y=='b'){
		return 'c';
	}
}

if(x=='b'){
	if(y=='c'){
		return 'a';
	}
}

if(x=='c'){
	if(y=='a'){
		return 'b';
	}
}

}
