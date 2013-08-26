package com.dsalgo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/21/13
 * Time: 12:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class HashTest {

    public static void main(String[] args){

        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        charMap.put('a',charMap.size());
        charMap.put('b', charMap.size());
        charMap.put('c',charMap.size());

        for(Map.Entry<Character,Integer> mapEntry:charMap.entrySet()){
            System.out.println(mapEntry.getKey()+" => "+mapEntry.getValue()+" Index "+charMap.get(mapEntry.getKey()));
        }

        charMap.remove('b');
        System.out.println("================================");
        for(Map.Entry<Character,Integer> mapEntry:charMap.entrySet()){
            System.out.println(mapEntry.getKey()+" => "+mapEntry.getValue()+" Index "+charMap.get(mapEntry.getKey()));
        }
    }
}
