import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 20/1/13
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringSimilarity {

    public static void main(String args[]) throws Exception{

    Scanner in = new Scanner(new FileReader(new File("./StringSimilarity/input00.txt")));

    int n = in.nextInt();
    System.out.println("n "+n);

        for(int j=0;j<n;j++){
            String str = in.next();
            System.out.println(str);
            int count=0;
            for(int i=0;i<str.length();i++){
               String suffixString = str.substring(i);
                System.out.println("suffixString "+suffixString);

                for(int index=0;index<suffixString.length();index++){
                    if(str.charAt(index)==suffixString.charAt(index)){
                        count++;
                    }else{
                        break;
                    }
                }


            }
            System.out.println(count);
        }
    }

}
