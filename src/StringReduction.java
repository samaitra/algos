import java.io.File;
import java.util.HashMap;
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
		    String a="";
		    for(int j=0;j<s.length()-1;j++){
			  System.out.println("initial string "+s);
                 if(s.charAt(j)!=s.charAt(j+1)){
                	 char d = getchar(s.charAt(j),s.charAt(j+1)); 
                	 String xx = s.substring((s.indexOf(s.charAt(j+1))+1));
                	 s=d+xx;  
                		
                	     
                  	 	int k=j;
                        System.out.println("k ==="+k);
                  	 	while(k>0 && s.charAt(k)!=s.charAt(k-1)){
                        	d = getchar(s.charAt(k),s.charAt(k-1)); 
                        	xx = s.substring((s.indexOf(s.charAt(k-1))+1));
                       	 	s=d+xx;  
                       	    k--;
                        }
                        
                        System.out.println("s=============="+ s);
                }
        
		}
		   
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