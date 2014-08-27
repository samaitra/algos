package com.topcoder;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 06/04/13
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheSwapsDivTwo {
   public int find(int[] a){
   int count=1;
       if(a.length==2){
           return 1;
       }else{
       for(int i=0;i<a.length;i++){

           for(int j=i+1;j<a.length;j++){

               if(a[i]!=a[j]){
                   count++;
               }


           }

       }
       }


   return count;
   }
   public static void main(String[] args){

       int a[] = {1, 47};
       TheSwapsDivTwo t = new TheSwapsDivTwo();
       int x = t.find(a);
       System.out.println(x);

   }
}
