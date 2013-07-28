package com.en;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 28/07/13
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class WordFrequency {

    public static void main(String[] args) throws Exception{

        //BufferedReader br = new BufferedReader(new FileReader("wordfreq/in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String,Integer> wordsMap = new HashMap<>();
        for(int i=0;i<N;i++){
            String word = br.readLine();
            Integer count = wordsMap.get(word);
            if(count == null){
             wordsMap.put(word,1);
            }else{
                wordsMap.put(word,count+1);
            }

        }

        ValueComparator bvc =  new ValueComparator(wordsMap);
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(bvc);
        sorted_map.putAll(wordsMap);

        int k = Integer.parseInt(br.readLine());

        Set<String> wordsSet = sorted_map.keySet();
        int c=1;
        for(String s : wordsSet){
            System.out.println(s);
            if(c==k){
                break;
            }
            c++;
        }


    }
}
class ValueComparator implements Comparator<String> {

    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(String a, String b) {
        if (base.get(a) > base.get(b)) {
            return -1;
        } else if(base.get(a)==base.get(b)){
          return a.compareTo(b);
        }
        else {
            return 1;
        }
    }
}