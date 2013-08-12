package com.gen;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/13/13
 * Time: 12:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class MaxKMinHeap {

    public static void main(String[] args){

        int[] arr = {1, 4, 5, 16, 11, 18};
        int[] result = getTopElem(arr,2);

        for(int i : result){
            System.out.println(i);
        }
    }

    static private int[] getTopElem(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            if(minHeap.size()<k){
                minHeap.add(arr[i]);
            }else if(arr[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        int[] res = new int[minHeap.size()];
        int index = 0;
        while(!minHeap.isEmpty()){
            res[index++] = minHeap.poll();
        }
      return res;
    }


}
