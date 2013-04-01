package com.google;

import sun.awt.SunToolkit;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 01/04/13
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class StoreCredit {

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new FileReader("StoreCredit/A-large-practice.in"));
        int n = in.nextInt();

        for(int i=0;i<n;i++){
           int storeCredit = in.nextInt();
           int numItems = in.nextInt();
            int itemList[] = new int[numItems];
            for(int j=0;j<numItems;j++){
               itemList[j]=in.nextInt();
           }

          OutLoop :for(int k=0;k<numItems;k++){
//              int item1 = itemList[k];
//              System.out.println("item1 "+item1);
//              int diff = storeCredit - item1;
//               System.out.println("diff "+diff);
//
//               int item2Pos = search(itemList,diff);
//               if(item2Pos>=0){
//                  System.out.println("Case #"+ (i+1) + ": " + (k+1) + " "+(item2Pos+1));
//
//                   break MyLoop;
//
//               }
              InLoop :for(int l=k+1;l<numItems;l++){
                  if(itemList[k]+itemList[l]==storeCredit){
                      System.out.println("Case #"+ (i+1) + ": " + (k+1) + " "+(l+1));
                      break OutLoop;
                  }
              }

           }

           }




        }
    public static int search(int[] a, int b) {

        if (a.length == 0) {
            return -1;
        }
        int low = 0;
        int high = a.length-1;

        while(low <= high) {
            int middle = (low+high) /2;
            if (b> a[middle]){
                low = middle + 1;
            } else if (b< a[middle]){
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
