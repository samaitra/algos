package com.careercup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saikat on 27/12/14.
 * If a=1, b=2, c=3,....z=26. Given a string, find all possible codes that string can generate.
 * Give a count as well as print the strings.

 For example:
 Input: "1123". You need to general all valid alphabet codes from this string.

 Output List
 aabc //a = 1, a = 1, b = 2, c = 3
 kbc // since k is 11, b = 2, c= 3
 alc // a = 1, l = 12, c = 3
 aaw // a= 1, a =1, w= 23
 kw // k = 11, w = 23
 */
public class PossibleCodes {

    Map<String,String> keyMap = new HashMap<>();
    List<String> myLocalList = new ArrayList<>();

    void init(){

        keyMap.put("1","a");
        keyMap.put("2","b");
        keyMap.put("3","c");
        keyMap.put("4","d");
        keyMap.put("5","e");
        keyMap.put("6","f");
        keyMap.put("7","g");
        keyMap.put("8","h");
        keyMap.put("9","i");
        keyMap.put("10","j");
        keyMap.put("11","k");
        keyMap.put("12","l");
        keyMap.put("13","m");
        keyMap.put("14","n");
        keyMap.put("15","o");
        keyMap.put("16","p");
        keyMap.put("17","q");
        keyMap.put("18","r");
        keyMap.put("19","s");
        keyMap.put("20","t");
        keyMap.put("21","u");
        keyMap.put("22","v");
        keyMap.put("23","w");
        keyMap.put("24","x");
        keyMap.put("25","y");
        keyMap.put("26","z");

    }

    List<String> get(String s){

     List<String> ret = new ArrayList<>();
     List<String> previousRet = new ArrayList<>();
     for(int i=0;i<s.length();i++) {
         List<String> tl1 = new ArrayList<>();
         List<String> tl2 = new ArrayList<>();

         if(i>=1) {
             String val = s.substring(i-1,i+1);

             int v = Integer.valueOf(val);
             if(v<=26 && v>=10) {
                 String c = keyMap.get(val);
                 tl1 = addCharToPrefix(previousRet, c);
             }
         }

         String val = s.substring(i,i+1);
         String c = keyMap.get(val);
         tl2 = addCharToPrefix(ret, c);

         previousRet = ret;
         tl1.addAll(tl2);
         ret = tl1;

         }
         return ret;
    }

    static List<String> addCharToPrefix(List<String> preRet , String c){
        List<String> ret  = new ArrayList<>();
        if(preRet.size()==0){
            ret.add(c);
        }

        for(String s : preRet){
            ret.add(s+c);
        }
        return ret;
    }
    public static void main(String args[]){
        PossibleCodes p = new PossibleCodes();
        p.init();

        p.get("123").stream().forEach(e->System.out.println(e));
    }
}
