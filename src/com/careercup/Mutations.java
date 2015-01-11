package com.careercup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by saikat on 06/01/15.
 Given a hashmap M which is a mapping of characters to arrays of substitute characters,
 and an input string S, return an array of all possible mutations of S
 (where any character in S can be substituted with one of its substitutes in M, if it exists).

 What is the time complexity? What is the space complexity? Can you optimize either?

 Example input:
 M = { f: [F, 4], b: [B, 8] }
 S = fab

 Expected output:
 [fab, Fab, 4ab, faB, FaB, 4aB, fa8, Fa8, 4a8]
 */

public class Mutations {

    static List<String> ret = new ArrayList<>();
    static List<String> prevRet = new ArrayList<>();
    static boolean first = true;

    public void findAllMutations(HashMap<Character,List<Character>> map, String s) {

        char[] sarray = s.toCharArray();

        for(int i=0;i<sarray.length;i++) {

            //System.out.println("sarray[i] "+sarray[i]);
            List<Character> cList = new ArrayList<>();
            if (map.containsKey(sarray[i])){
                cList = map.get(sarray[i]);

            }
            cList.add(0,sarray[i]);


            for (Character listChar : cList) {
                //System.out.println("listChar "+listChar);
                addCharToList(listChar,s.length());

            }
        //break
        prevRet = ret;
        first = false;
        }



    }

    public void addCharToList(Character listChar,int len){
        List<String> temp = new ArrayList<>();
        if(first){
            ret.add(listChar.toString());
        }
        else{
            for(String s:prevRet){
                //System.out.println("s "+s);
                temp.add(s + listChar);
            }
            ret = temp;
        }


        for(String mytemp : temp){
            if(mytemp.length()==len)
                System.out.println(mytemp);
        }


    }

    public static void main(String[] args){

        List<Character> l1 = new ArrayList<>();
        l1.add('F');
        l1.add('4');

        List<Character> l2 = new ArrayList<>();
        l2.add('B');
        l2.add('8');

        HashMap<Character,List<Character>> map = new HashMap<>();
        map.put('f',l1);
        map.put('b',l2);
        new Mutations().findAllMutations(map,"fab");
    }
}









