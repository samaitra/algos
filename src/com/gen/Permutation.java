package com.gen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/16/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Permutation {

    public static void main(String[] args){
        findPerm("abcsd");
    }

    private static void findPerm(String s){
        List<Character> characters = new ArrayList<Character>();
        for(Character c : s.toCharArray()){
            characters.add(c);
            findPerm(new ArrayList<>(),characters);
        }
    }

    private static void findPerm(List prefix,List suffix){


    }
}
