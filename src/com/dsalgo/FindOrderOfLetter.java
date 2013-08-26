package com.dsalgo;

import java.util.HashMap;

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
                System.out.print(c + ",");
            }
        }
    }

    private static char[] getOrderedLetter(String[] words) {
        HashMap<Character,Integer> chars = new HashMap<Character,Integer>();
        for(String word : words){

            for(int i=0;i<word.length();i++){
              if(!chars.keySet().contains(word.charAt(i))){
                  chars.put(word.charAt(i),chars.size());
              }
            }


        }

        boolean[][] adjacencyList = new boolean[chars.size()][chars.size()];

        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                String prevWord = words[i];
                String nextWord = words[j];

                for(int k=0;k<Math.min(prevWord.length(),nextWord.length());k++){
                    char prevChar = prevWord.charAt(k);
                    char nextChar = nextWord.charAt(k);
                    if(prevChar!=nextChar){
                        adjacencyList[chars.get(prevChar)][chars.get(nextChar)] = true;
                        break;
                    }
                }
            }
        }

        char[] result = new char[chars.size()];
        int resultIndex = 0;
        while (!chars.isEmpty()){
            char lowChar = ' ';
            for(Character nextCharacter : chars.keySet()){
                int nextIndex = chars.get(nextCharacter);
                boolean lowest = true;
                for(Character prevCharacter : chars.keySet()){
                    int prevIndex = chars.get(prevCharacter);
                    if(adjacencyList[prevIndex][nextIndex]){
                        lowest = false;
                        break;
                    }
                }

                if(lowest){
                    lowChar = nextCharacter;
                    result[resultIndex++] = lowChar;
                    break;
                }

            }
            if(lowChar == ' '){
                return null;
            }else{
                chars.remove(lowChar);
                lowChar = ' ';
            }
        }
        return result;

    }
}
