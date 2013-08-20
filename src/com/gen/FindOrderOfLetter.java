package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 20/08/13
 * Time: 5:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindOrderOfLetter {

    public static void main(String[] args){

        String[] words = {"car", "cat", "cbr", "deer", "egg", "god", "rabe", "race", "rat", "tar"};
        char[] letters = getOrderedLetter(words);
        if(letters==null){
            System.out.println( "NOT POSSIBLE");
        }else {
            for(char c : letters){
                System.out.println(c + ",");
            }
        }
    }

    private static char[] getOrderedLetter(String[] words) {


    }
}
