package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/2/13
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValidPanFormat {
    public static void main(String[] args) throws Exception{
    BufferedReader bufferedReader =new BufferedReader (new FileReader("validpanformat/in"));
    int n = Integer.parseInt(bufferedReader.readLine());

    for(int i=0;i<n;++i){
        String line = bufferedReader.readLine();
        //System.out.println(line);
        System.out.println(checkPan(line));


    }
}

    public static String checkPan(String line){
        Pattern p = Pattern.compile("[A-Z][A-Z][A-Z][A-Z][A-Z]\\d\\d\\d\\d[A-Z]");
        Matcher m = p.matcher(line);
        while(m.find()){
          return "YES";
        }
        return "NO";
    }

}