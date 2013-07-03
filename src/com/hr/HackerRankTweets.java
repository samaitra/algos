package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/3/13
 * Time: 11:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class HackerRankTweets {

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader =new BufferedReader (new FileReader("hackerranktweets/in"));
        int n = Integer.parseInt(bufferedReader.readLine());
        int c = 0;
        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            Pattern p = Pattern.compile("hackerrank",Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(line);
            while(m.find()){
                c++;
            }
        }
        System.out.println(c);
    }


}
