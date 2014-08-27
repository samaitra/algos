package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/2/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class SayingHi {

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader =new BufferedReader (new FileReader("sayinghi/in"));
        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            Pattern p = Pattern.compile("^hi\\s(?!d)",Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(line);
            while(m.find()){
                System.out.println(line);
            }



        }
    }



}
