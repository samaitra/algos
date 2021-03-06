package com.careercup;

import java.util.HashSet;


public class RandomWord {

    static HashSet<String> wordSet = new HashSet<>();

    public static void main(String[] args){

        populateWordSet();
        String str = "restated";
        System.out.print(checkword(str));



    }
    public static boolean checkword(String str){

        if(str.length()==1)
            return true;

        for(int i=0;i<str.length();i++){

            String first = str.substring(0,i);
            String last = str.substring(i+1);
            String word = first+last;

            if(isValidWord(word)){
                //System.out.println(word);
                if(checkword(word)){
                    return true;
                }else{
                    continue;
                }

            }


        }

        return false;
    }

    public static boolean isValidWord(String str){

        return wordSet.contains(str);
    }

    public static void populateWordSet(){

        wordSet.add("restate");
        wordSet.add("estate");
        wordSet.add("state");
        wordSet.add("stte");
        wordSet.add("stat");
        wordSet.add("sat");
        wordSet.add("at");
        wordSet.add("a");

    }
}
