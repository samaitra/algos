import java.io.File;
import java.util.HashMap;
import java.util.Scanner;


public class StringReduction {

	public static void main(String[] args) throws Exception{
	
		int n;
		File f = new File("./StringReduction/input01.txt");
		Scanner in = new Scanner(f);
		//Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(int i=0;i<n;i++){
			String s= in.next();
			
			for(int j=0;j<s.length()-1;j++){
			  
                     if (s.charAt(j)!=s.charAt(j+1)){
                	 char d = getchar(s.charAt(j),s.charAt(j+1)); 
                	 String xx = s.substring((s.indexOf(s.charAt(j+1))+1));
                	 s=d+xx;  
                	 		for(int k=0;k<s.length()-1;k++){
                	 		
                	 		  if (s.charAt(k)!=s.charAt(k+1)){
                	 			char dy = getchar(s.charAt(k),s.charAt(k+1)); 
                	 			String xy = s.substring((s.indexOf(s.charAt(k+1))+1));
                	 			s=dy+xy;
                	 			
                	 		}
                	 		
                	 		}
                        }
                }
		    System.out.println(s);
		}
		   
	}

public static char getchar(char x,char y){

    if(x=='a' && y=='b')
        return 'c';
    else if(x=='b' && y=='c')
        return 'a';
    else if(x=='c' && y=='a')
        return 'b';
    else if(x=='a' && y=='c')
        return 'b';
    else if (x=='b' && y=='a')
    	return 'c';
    else if (x=='c' && y=='b')
        return 'a';
	return 'z';



}
}