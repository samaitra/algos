package com.hackerrank;
import com.sun.istack.internal.Nullable;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Saikat on 28-05-2016.
 */
public class SparseArrays {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(new FileReader("in"));
        int n = Integer.parseInt(in.nextLine());
        HashMap<String,Integer> sMap = new HashMap<>();
        for(int i=0;i<n;i++){
            String key = in.nextLine();
            if(sMap.containsKey(key)){
                int value = sMap.get(key);
                value++;
                sMap.put(key,value);
            }else{
                sMap.put(key,1);
            }
        }
        int q = Integer.parseInt(in.nextLine());
        for(int i=0;i<q;i++){
            String key = in.nextLine();
            if(sMap.containsKey(key)){
                System.out.println(sMap.get(key));
            }else{
                System.out.println(0);
            }

        }
    }


}

