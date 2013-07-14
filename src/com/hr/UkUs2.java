package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Saikat
 * Date: 7/14/13
 * Time: 2:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class UkUs2 {
    public static void main(String[] args) throws Exception{
        //BufferedReader bufferedReader =new BufferedReader (new InputStreamReader(System.in));
        BufferedReader bufferedReader =new BufferedReader (new FileReader("ukus2/in"));

        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            sb.append(line);

        }
        int t = Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<t;++i){

            String w = bufferedReader.readLine();
            String x = w.substring(0,(w.length()-3));
            Pattern p = Pattern.compile(x+"ou?r");
            Matcher m = p.matcher(sb.toString());
            int c = 0;
            while(m.find()){
                c++;
            }

            System.out.println(c);

        }

    }
}
