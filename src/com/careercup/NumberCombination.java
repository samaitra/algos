package com.careercup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saikat on 29/12/14.
 *
 * Given a number N, write a
 * program that returns all possible
 * combinations of numbers that
 * add up to N, as lists. (Exclude the N+0=N)
 *
 * For example, if N=4 return {{1,1,1,1},{1,1,2},{2,2},{1,3}}
 */
public class NumberCombination {


    void reduce(List<List<Integer>> results, List<Integer> list, int sum, int last, int target, boolean isFirst){

        if(sum==target){
          results.add(list);
          return;
        }

        while (sum + last > target )
            last = last - 1;

        int less = last - 1;
        if(!isFirst && less > 0 && less + last< target){
            List<Integer> copyList = new ArrayList<>(list);
            reduce(results,copyList,sum,less,target,false);
        }
        sum = sum + last;
        list.add(last);

        reduce(results,list,sum,last,target,false);

    }

    public static void main(String[] args){

        List<List<Integer>> resList = new ArrayList<>();
        int n = 4;
        NumberCombination nc = new NumberCombination();

        for(int i=1;i<n;i++) {
            List<Integer> l = new ArrayList<>();
            nc.reduce(resList,l,0,i,n,true);
        }

        for(List<Integer> mlist : resList ){
            for(Integer i: mlist){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }



}
