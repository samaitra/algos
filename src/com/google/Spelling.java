package com.google;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 02/04/13
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Spelling {
    static HashMap<Character,String> charMap;
    public static void main(String[] args) throws Exception{



        BufferedReader b = new BufferedReader(new FileReader("Spelling/C-large-practice.in"));
        charMap = new HashMap<Character,String>();
        charMap.put('a',"2");
        charMap.put('b',"22");
        charMap.put('c',"222");
        charMap.put('d',"3");
        charMap.put('e',"33");
        charMap.put('f',"333");
        charMap.put('g',"4");
        charMap.put('h',"44");
        charMap.put('i',"444");
        charMap.put('j',"5");
        charMap.put('k',"55");
        charMap.put('l',"555");
        charMap.put('m',"6");
        charMap.put('n',"66");
        charMap.put('o',"666");
        charMap.put('p',"7");
        charMap.put('q',"77");
        charMap.put('r',"777");
        charMap.put('s',"7777");
        charMap.put('t',"8");
        charMap.put('u',"88");
        charMap.put('v',"888");
        charMap.put('w',"9");
        charMap.put('x',"99");
        charMap.put('y',"999");
        charMap.put('z', "9999");
        charMap.put(' ',"0");
        charMap.put('P'," ");







        int n = Integer.parseInt(b.readLine());
        BufferedWriter bw = new BufferedWriter(new FileWriter("Spelling/a.out"));
        for(int k=0;k<n;k++){
            String line = b.readLine();
            char[] chars = line.toCharArray();
            int len = chars.length;
            StringBuilder s = new StringBuilder();
            for(int i=0;i<len;i++){

                if(i>0 && checkMapping(chars[i-1],chars[i])){
                 s.append(charMap.get('P'));
                 s.append(charMap.get(chars[i]));
                }else{
                    s.append(charMap.get(chars[i]));
                }
            }



            System.out.println("Case #"+(k+1)+": "+s);
            bw.write("Case #"+(k+1)+": "+s+"\n");
            bw.flush();
        }
        bw.close();

    }
    public static boolean checkMapping(char a,char b){


        String s1 = charMap.get(a);
        String s2 = charMap.get(b);
        s1 = s1.substring(0,1);
        s2 = s2.substring(0,1);

        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }

}
