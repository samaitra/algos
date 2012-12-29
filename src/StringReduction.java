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
			int countA=0;
            int countB=0;
            int countC=0;
            int k=0;

             while(k<s.length()){
                if(s.charAt(k)=='a')
                    countA++;
                else if (s.charAt(k)=='b')
                    countB++;
                else if (s.charAt(k)=='c')
                    countC++;
                k++;

             }
             int j=0;
            while(j<(s.length()-1)){
              char x = getReductionChar(countA,countB,countC);
                //System.out.println("char to reduce   "+x);
                //System.out.println("j "+j);
                if(x==s.charAt(j) || x==s.charAt(s.length()-1) ||x==s.charAt(0)){
                    if (s.charAt(j)!=s.charAt(j+1)){
                      //System.out.println("I am here");
                     char d = getchar(s.charAt(j),s.charAt(j+1));

                     if(s.charAt(j)=='a'){
                         countA--;
                     }else if(s.charAt(j)=='b'){
                         countB--;
                     }else if (s.charAt(j)=='c'){
                         countC--;
                     }

                        if(s.charAt(j+1)=='a'){
                            countA--;
                        }else if(s.charAt(j+1)=='b'){
                            countB--;
                        }else if (s.charAt(j+1)=='c'){
                            countC--;
                        }

                        if(d=='a'){
                            countA++;
                        }else if(d=='b'){
                            countB++;
                        }else if (d=='c'){
                            countC++;
                        }

                     String before = s.substring(0,j);
                	 String after = s.substring(j+2,s.length());
                	 s = before+d+after;
                     //System.out.println("In if "+s);
                     j=0;
                    } else if(j>0){
                       if (s.charAt(j-1)!=s.charAt(j)){

                        char d = getchar(s.charAt(j),s.charAt(j-1));

                        if(s.charAt(j)=='a'){
                            countA--;
                        }else if(s.charAt(j)=='b'){
                            countB--;
                        }else if (s.charAt(j)=='c'){
                            countC--;
                        }

                        if(s.charAt(j-1)=='a'){
                            countA--;
                        }else if(s.charAt(j-1)=='b'){
                            countB--;
                        }else if (s.charAt(j-1)=='c'){
                            countC--;
                        }

                        if(d=='a'){
                            countA++;
                        }else if(d=='b'){
                            countB++;
                        }else if (d=='c'){
                            countC++;
                        }

                        String before = s.substring(0,j-1);
                        String after = s.substring(j+1,s.length());
                        s = before+d+after;
                        //System.out.println("In else "+s);
                        j=0;
                    }
                   }
                  }
                  j++;
                }
             if(s.length()==2 && s.charAt(0)!=s.charAt(1)){
                 char d = getchar(s.charAt(0),s.charAt(1));
                    s = String.valueOf(d);
             }
             System.out.println(s.length());
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

    public static char getReductionChar(int a,int b,int c){
        if(a>=b && a>=c)
            return 'a';
        else if(b>=c && b>=a)
            return 'b';
        else
            return 'c';
    }



}