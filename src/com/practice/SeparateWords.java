package com.practice;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 02/09/13
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class SeparateWords {

    static HashSet<String> dictionary = new HashSet<>();

    public static void main(String[] args){
    	String str = "jesslookedjustliketimherbrother";
        dictionary.add("looked");
        dictionary.add("just");
        dictionary.add("like");
        dictionary.add("her");
        dictionary.add("brother");

        ArrayList<String> words = new ArrayList<>();
        int notFoundStart = 0;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
               String word = str.substring(i,j);
               if(dictionary.contains(word)){

                   String name = str.substring(notFoundStart,i);
                   if(!dictionary.contains(name)){
                       //System.out.println("name "+name);
                       words.add(name);
                   }
                   words.add(word);
                   notFoundStart = j;
                   i=j;

               }
            }

        }
        
        for(String s:words){

            System.out.print(s+" ");

        }



    }
}
