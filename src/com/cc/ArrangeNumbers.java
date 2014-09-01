package com.cc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saikat on 01/09/14.
 */
public class ArrangeNumbers {

    static void arrange(int[] a){

        List<Integer> mlist = new ArrayList<Integer>();
        List<Integer> plist = new ArrayList<Integer>();


        for(int i=0;i<a.length;++i){

            if(a[i]>0){
                plist.add(a[i]);
            }
            if(a[i]<0){
                mlist.add(a[i]);
            }
        }

        int i=0;
        List<Integer> alist = new ArrayList<Integer>();
        while(i<a.length){

            if(i<mlist.size()){
                System.out.println("i "+i);
                System.out.println("mlist.get("+i+")"+mlist.get(i));
                alist.add(mlist.get(i));

            }

            if(i<plist.size()){
                System.out.println("i "+i);
                System.out.println("plist.get("+i+")"+plist.get(i));
                alist.add(plist.get(i));


            }
            i++;
        }




        for(int j:alist){
            System.out.print(j+" ");
        }

    }

    public static void main(String[] args){
        int a[] = {1, 2, 3, -4, -1, 4};
        ArrangeNumbers.arrange(a);
    }
}
