package com.hackerrank;

import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 9/29/13
 * Time: 8:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindTheMedian {

    PriorityQueue<Integer> upperQ;
    PriorityQueue<Integer> lowerQ;

    public FindTheMedian(int n){
        lowerQ = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        upperQ = new PriorityQueue<Integer>();
        upperQ.add(Integer.MAX_VALUE);
        lowerQ.add(Integer.MIN_VALUE);

    }
    public void add(Integer num){
        if(num>=upperQ.peek())
            upperQ.add(num);
        else
            lowerQ.add(num);

    }
    public double getMedian(Integer num){
        if(num>=upperQ.peek())
            upperQ.add(num);
        else
            lowerQ.add(num);

        if(upperQ.size()-lowerQ.size()==2)
            lowerQ.add((upperQ.poll()));
        else if(lowerQ.size()-upperQ.size()==2)
            upperQ.add(lowerQ.poll());

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



    public static void main(String[] args) throws Exception {

        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new FileReader("in"));
        int N;
        N = in.nextInt();
        FindTheMedian m = new FindTheMedian(N);


        for (int i=0;i<N;i++){

            Integer val = in.nextInt();
            if(i==N-1){
            System.out.println(new DecimalFormat("#.##").format(m.getMedian(val)));
            }else{
                m.getMedian(val);
            }
            }



    }
}