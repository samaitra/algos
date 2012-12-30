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

            int j=1;
            while(j<(s.length())){

                int a=0;
                int b=0;
                int c=0;
                int k=0;
                while(k<s.length()){
                    if(s.charAt(k)=='a')
                        a++;
                    else if (s.charAt(k)=='b')
                        b++;
                    else if (s.charAt(k)=='c')
                        c++;
                    k++;
                }
                char x = getReductionChar(a,b,c);
                //System.out.println("x ============   " +x);
                if(x==s.charAt(j) && s.charAt(j)!=s.charAt(j-1)){
                    String oldStr = String.valueOf(s.charAt(j-1))+String.valueOf(s.charAt(j));
                    String newStr = String.valueOf(getchar(s.charAt(j-1),s.charAt(j)));
                    //System.out.println("oldStr ===========  "+oldStr);
                    //System.out.println("newStr ===========  "+newStr);

                    s = s.replace(oldStr,newStr);

                    j=0;
                }
                try{
                if(x==s.charAt(j) && s.charAt(j)!=s.charAt(j+1)){
                    String oldStr = String.valueOf(s.charAt(j))+String.valueOf(s.charAt(j+1));
                    String newStr = String.valueOf(getchar(s.charAt(j),s.charAt(j+1)));
                    //System.out.println("oldStr ===========  "+oldStr);
                    //System.out.println("newStr ===========  "+newStr);

                    s = s.replace(oldStr,newStr);

                    j=0;
                }

                }catch (Exception e){

                }


                j++;
                //System.out.println(s);
                }

             j=1;





            while(j<(s.length())){

                if(s.charAt(j)!=s.charAt(j-1)){
                    String oldStr = String.valueOf(s.charAt(j-1))+String.valueOf(s.charAt(j));
                    String newStr = String.valueOf(getchar(s.charAt(j-1),s.charAt(j)));
                    //System.out.println("oldStr ===========  "+oldStr);
                    //System.out.println("newStr ===========  "+newStr);

                    s = s.replace(oldStr,newStr);

                    j=0;
                }
                j++;
                //System.out.println(s);
            }
            //System.out.println(s);
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
    int max = Math.max(c,Math.max(a,b));
    if(max==a){
        return 'a';
    }else if (max==b){
        return 'b';

    }else if(max==c){
        return 'c';
    }else
        return '0';
}
}