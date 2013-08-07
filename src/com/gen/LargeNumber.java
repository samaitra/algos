package com.gen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 07/08/13
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class LargeNumber {

    public static void main(String[] args){
        int a = 3124;
        makeLarge(a);

    }

    static void makeLarge(int a){
    String in = String.valueOf(a);
        List<Integer> d = new ArrayList<>();

        for(int i=0;i<in.length();i++){
        Integer dig = Integer.parseInt(in.substring(i, i + 1));
        d.add(dig);
        }

       int ri = -1;
       int li = -1;

       for(int i=d.size()-1;i>0&&ri==-1;i--){
           for(int j=i-1;j>0&&li==-1;j--){
               if(d.get(i)>d.get(j)){
                   ri=i;
                   li=j;
                   break;
               }
           }
       }
       swap(d,ri,li);
       sort(d,li+1,d.size()-1);
       for(int i:d){
          System.out.print(i);
       }
   }

    static void swap(List<Integer> d, int i, int j){

        Integer temp = d.get(i);
        d.set(i,d.get(j));
        d.set(j,temp);

    }
    static void sort(List<Integer> d,int start, int end){
        if(start==end){
            return;
        }
        for(int i=start;i<end;i++){
            for(int j=start+1;j<end;j++){
                if(d.get(i)>d.get(j))
                    swap(d,i,j);
            }
        }
    }
}
