package com.hr;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 17/09/13
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class LonelyInteger {

    public static void main(String[] args) throws Exception{

        //Scanner in = new Scanner(new FileReader("in"));
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = in.nextInt();
            if(map.containsKey(num)){
                int val = map.get(num);
                val = val+1;
                map.put(num,val);
            }else{
                map.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
            }
        }


    }

}
