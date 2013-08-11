package com.gen;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/12/13
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Median {

      PriorityQueue<Integer> upperQ;
      PriorityQueue<Integer> lowerQ;

    public Median(){
        lowerQ = new PriorityQueue<Integer>(20, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        upperQ = new PriorityQueue<Integer>();
        upperQ.add(Integer.MAX_VALUE);
        lowerQ.add(Integer.MIN_VALUE);
    }

    public double getMedian(int num){
        if(num>=upperQ.peek())
            upperQ.add(num);
        else
            lowerQ.add(num);

        if(upperQ.size()-lowerQ.size()==2)
            lowerQ.add((upperQ.poll()));
        else if(lowerQ.size()-upperQ.size()==2)
            upperQ.add(lowerQ.poll());

        if(upperQ.size()==lowerQ.size())
            return ((upperQ.peek()+lowerQ.peek())/2.0);
        else if(upperQ.size()>lowerQ.size())
            return upperQ.peek();
        else
            return lowerQ.peek();
    }

    public static void main(String[] args){
        Random random = new Random();
        Median median = new Median();
        System.out.println("num\tmedian");
        for(int i=0;i<50;++i)
        {
            int num=random.nextInt(100);
            System.out.print(num);
            System.out.print("\t");
            System.out.println(median.getMedian(num));
        }
    }



}
