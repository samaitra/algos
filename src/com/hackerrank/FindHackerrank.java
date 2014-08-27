package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/1/13
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindHackerrank {

    public static void main(String[] args) throws Exception{
        //Scanner in = new Scanner(System.in);
        BufferedReader bufferedReader =new BufferedReader (new FileReader("findhackerrank/in"));
        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<n;++i){
            boolean flag = false;
            String msg = "-1";
            String line = bufferedReader.readLine();
            //System.out.println(line);

            Pattern p = Pattern.compile("^hackerrank");
            Matcher m = p.matcher(line);
            while(m.find()){
                flag = true;
                msg = "1";
            }

            p = Pattern.compile("hackerrank$");
            m = p.matcher(line);
            while(m.find()){
                if(flag){
                    msg = "0";
                }else{
                msg = "2";
                }
            }

            System.out.println(msg);


        }

    }

}
