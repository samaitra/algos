import java.io.FileReader;
import java.util.*;


public class FindStrings {
    static HashMap<String,Integer> map  = new HashMap<>();

    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(new FileReader("FindStrings/input05.txt"));
            int n = in.nextInt();
            for (int i=0;i<n;i++){

                String str = in.next();
                getSuffixArray(str);


            }
            String a[] = new String[map.size()];
            int c=0;
            for(Map.Entry<String,Integer> entry : map.entrySet()){
               a[c] = entry.getKey();
               c++;
            }
            Arrays.sort(a);

            int q = in.nextInt();
            for(int i=0;i<q;i++){
                int k = in.nextInt();
                int len = a.length;
                if(len<k){
                    System.out.println("INVALID");
                }else{
                System.out.println(a[k]);
                }
            }

        }catch(Exception e){
            e.printStackTrace();


        }


    }

    private static void getSuffixArray(String str){
        int n = str.length();

        for(int i=0;i<n;i++){
            map.put(str.substring(0,i),0);
            map.put(str.substring(i,n),0);

        }

    }

}
