import java.io.File;
import java.util.Scanner;


public class StringReduction {

	public static void main(String[] args) throws Exception{
	
		int n;
		File f = new File("./StringReduction/input01.txt");
		Scanner in = new Scanner(f);
		//Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(int i=0;i<n;i++){
			String s = in.next();
			int j=0;
			//System.out.println(s);
			  while(j<s.length()-1){
                     if (s.charAt(j)!=s.charAt(j+1)){
                	 char d = getchar(s.charAt(j),s.charAt(j+1)); 
                	 String before = s.substring(0,j);
                	 //System.out.println("before "+before);
                	 String after = s.substring(j+2,s.length());
                	 //System.out.println("d "+d);
                	 //System.out.println("after "+after);
                	 String sx = before+d+after;
                	 String sy = "";
                	 int k=s.length()-2;
                	 while (k>=0){
                		 if(s.charAt(k)!=s.charAt(k+1)){
                			 char d1 = getchar(s.charAt(k),s.charAt(k+1));
                			 String before1 = s.substring(0,k);
                			 //System.out.println("before1 "+before1);
                			 String after1 = s.substring(k+2,s.length());
                			 //System.out.println("d1 "+d1);
                			 //System.out.println("after1 "+after1);
                			 k=s.length()-2;
                			 sy = before1+d1+after1;
                			 break;
                		 }else{
                			 k--;
                		 }
                		 
                	 }
                	 if(sx.length()>sy.length()){
                		 s=sx;
                	 }else{
                		 s=sy;
                	 }
                	 
                	 //System.out.println("s == "+s);
                	 j=0;
                     
                     }else{
                    	 j++;
                    }
                }
		    System.out.println(s.length());
		}
		 in.close();  
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