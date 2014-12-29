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

    static List<Integer> l = new ArrayList<>();
    static List<List<Integer>> resList = new ArrayList<>();

    void reduce(List<Integer> l){



    }

    public static void main(String[] args){

        NumberCombination n = new NumberCombination();
        System.out.print("l ");
        for(int i : l){
            System.out.print(i+" ");
        }

        n.reduce(l);

        for(List<Integer> mlist : resList ){
            for(Integer i: mlist){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }



}
