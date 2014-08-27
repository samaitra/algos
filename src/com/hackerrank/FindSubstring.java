package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/4/13
 * Time: 1:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindSubstring {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader =new BufferedReader (new FileReader("findaword/in"));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            sb.append(line);

        }
        int t = Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<t;++i){

            String x = bufferedReader.readLine();
            int c = 0;
                Pattern p = Pattern.compile("\\w"+x+"\\w",Pattern.CASE_INSENSITIVE);
                Matcher m = p.matcher(sb.toString());
                while(m.find()){

                    c=c+1;
                }
            System.out.println(c);
        }

    }


}
