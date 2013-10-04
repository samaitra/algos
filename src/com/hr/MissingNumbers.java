package com.hr;

import java.io.FileReader;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 04/10/13
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissingNumbers {

    public static void main(String args[]) throws Exception{

        Scanner in = new Scanner(new FileReader("in"));
        //Scanner in = new Scanner(System.in);

        HashMap<Integer,Integer> aMap = new HashMap<>();
        int n = in.nextInt();
        for(int i=0;i<n;i++){

            int num = in.nextInt();
            if(aMap.containsKey(num)){

                int count = aMap.get(num);
                aMap.put(num,count+1);

            }else{
                aMap.put(num,1);
            }
        }

        HashMap<Integer,Integer> bMap = new HashMap<>();

        n = in.nextInt();
        for(int i=0;i<n;i++){

            int num = in.nextInt();
            if(bMap.containsKey(num)){

                int count = bMap.get(num);
                bMap.put(num,count+1);

            }else{
                bMap.put(num,1);
            }
        }
        List<Integer> numbers = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : bMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(aMap.containsKey(key)){
               int aVal = aMap.get(key);
               if(value!=aVal){
                   numbers.add(key);
               }
            }else{
                numbers.add(key);
            }


        }
        Object[] a = numbers.toArray();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }

}
