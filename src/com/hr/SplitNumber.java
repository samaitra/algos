package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: Saikat
 * Date: 7/14/13
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class SplitNumber {

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader =new BufferedReader (new FileReader("findaword/in"));
        int n = Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            String[] a = new String[3];
            if(!line.contains("-")){
              a = line.split("\\s");
            }else if(line.contains("-")){
              a = line.split("-");
            }
            System.out.print("CountryCode="+a[0]+",LocalAreaCode="+a[1]+",Number="+a[2]);
        }

    }
}