import java.io.FileReader;
import java.util.*;


public class FindStrings {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<String>();

        try{
            Scanner in = new Scanner(new FileReader("FindStrings/input.txt"));
            int n = in.nextInt();
            System.out.println("n "+n);

            for (int i=0;i<n;i++){

                String str = in.next();
                findSubString(stringSet,str);

            }

            int q = in.nextInt();
            for(int i=0;i<q;i++){
                int k = in.nextInt();

            }

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("INVALID");

        }

        stringSet.clear();
    }

    private static String[] getSuffixArray(String str){
        int n = str.length();
        String[] suffixes = new String[n];

        for(int i=0;i<n;i++){
            suffixes[i]=str.substring(i);
        }
        Arrays.sort(suffixes);
        return suffixes;


    }

}
