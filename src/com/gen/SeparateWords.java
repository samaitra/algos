package com.gen;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 15/08/13
 * Time: 12:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class SeparateWords {

    public static void main(String[] args){

      String sentence = "therearesomewords";
      String[] dictionary = { "the", "a", "i", "here", "so", "hid", "there", "are", "some", "word",
            "words", "hid", "hi", "hidden", "he", "here", "her", "rear",
            "me", "den" };
      Object[] words = getSeparatedWords(sentence,dictionary);
      for(Object word : words){
         System.out.println(word.toString());
      }

    }

   private static Object[] getSeparatedWords(String sentence, String[] dictionary) {

        Set<String> validWords = new HashSet<>();
        for(String validWord: dictionary){
            validWords.add(validWord);
        }

        Stack<String> words = new Stack<String>();
        if(isSeparable(sentence,validWords, 0, words)){
            return words.toArray();
        }
         return null;

    }

   private static boolean isSeparable(String sentence , Set<String> validWords,int startIndex, Stack<String> foundWords){
       if(startIndex == sentence.length()){
           return true;
       }
       boolean hasWord = false;
       for(int i=startIndex+1;i<=sentence.length();i++){
           String currentSubstring = sentence.substring(startIndex, i);
           if(validWords.contains(currentSubstring)){
               foundWords.push(currentSubstring);
               if(isSeparable(sentence, validWords, i, foundWords)){
                   hasWord = true;
                   break;
               }
               foundWords.pop();
           }
       }

       if(!hasWord)
           return false;

       return true;
   }



}
