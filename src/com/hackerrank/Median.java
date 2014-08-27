package com.hackerrank;

import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.*;


public class Median {

     PriorityQueue<Integer> upperQ;
     PriorityQueue<Integer> lowerQ;
     ArrayList<Integer> l;
    public Median(int n){
        lowerQ = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        upperQ = new PriorityQueue<Integer>();
        upperQ.add(Integer.MAX_VALUE);
        lowerQ.add(Integer.MIN_VALUE);
        l = new ArrayList<>();
    }

    public double getMedianAfterAdd(Integer num){
        l.add(num);

        if(num>=upperQ.peek())
            upperQ.add(num);
        else
            lowerQ.add(num);

        if(upperQ.size()-lowerQ.size()==2)
            lowerQ.add((upperQ.poll()));
        else if(lowerQ.size()-upperQ.size()==2)
            upperQ.add(lowerQ.poll());

        if(upperQ.size()==lowerQ.size()){
                 long sum=0;
                 sum += upperQ.peek();
                 sum += lowerQ.peek();

            return sum/2.0;
        }
        else if(upperQ.size()>lowerQ.size()){
            return upperQ.peek();
        }
        else{

            return lowerQ.peek();
        }
    }

    public double getMedianAfterRemove(Integer num){

        if(l.contains(num)){
            l.remove(num);
        }


        if(upperQ.contains(num))
            upperQ.remove(num);
        else if(lowerQ.contains(num))
            lowerQ.remove(num);

        if(upperQ.size()-lowerQ.size()==2)
            lowerQ.add((upperQ.poll()));
        else if(lowerQ.size()-upperQ.size()==2)
            upperQ.add(lowerQ.poll());

        if(upperQ.size()==lowerQ.size()){

            long sum = 0;
            sum += upperQ.peek();
            sum += lowerQ.peek();
            return sum/2.0;

        }
        else if(upperQ.size()>lowerQ.size()){
            return upperQ.peek();
        }
        else{
            return lowerQ.peek();
        }
    }


    public static void main(String[] args) throws Exception {

		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new FileReader("in"));
		int N;
		N = in.nextInt();
        Median m = new Median(N);

        String s[] = new String[N];
	    int x[] = new int[N];

		for(int i=0; i<N; i++){
			s[i] = in.next();
			x[i] = in.nextInt();
		}
		for (int i=0;i<N;i++){

			if(s[i].equals("a")){
	    		 Integer val = x[i];
	    		 System.out.println(new DecimalFormat("#.##").format(m.getMedianAfterAdd(val)));

	    	 }else if(s[i].equals("r")){
	    		 Integer val = x[i];
                 if(m.l.contains(val)){
                    if(m.l.size()<=1){
                        System.out.println("Wrong!");

                    }else{

                        System.out.println(new DecimalFormat("#.##").format(m.getMedianAfterRemove(val)));

                    }
                }else{
                    System.out.println("Wrong!");
                }
	    	 }


	        }


	}




}


