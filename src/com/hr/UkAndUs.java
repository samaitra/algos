package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/2/13
 * Time: 12:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class UkAndUs {

    public static void main(String[] args) throws Exception{
    BufferedReader bufferedReader =new BufferedReader (new FileReader("findhackerrank/in"));
    int n = Integer.parseInt(bufferedReader.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<n;++i){
        String line = bufferedReader.readLine();
        sb.append(line);

    }
    int t = Integer.parseInt(bufferedReader.readLine());
    for(int i=0;i<t;++i){

        String w = bufferedReader.readLine();
    }

}
}

