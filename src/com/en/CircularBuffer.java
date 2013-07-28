package com.en;

import java.io.*;
//import java.nio.Buffer;
//import java.nio.CharBuffer;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 27/07/13
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CircularBuffer {

    public static void main(String[] args) throws Exception{

        //BufferedReader br = new BufferedReader(new FileReader("circularbuffer/in"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String l = null;
        ArrayList<String> cbl = new ArrayList<>();

        while((l = br.readLine())!=null){
            char cmd = l.charAt(0);
            if(cmd == 'A'){
                int n = Integer.parseInt(l.substring(2, l.length()));
                //System.out.println("n "+n);
                int pos = 0;
                for(int i=0;i<n;i++){
                    if(cbl.size()!=N){
                    String str = br.readLine();
                    cbl.add(str);
                    }else{
                        String str = br.readLine();
                        cbl.add(pos,str);
                        pos++;
                    }
                }
            }else if(cmd == 'R'){
                //for(String s : cbl){
                //    System.out.println(s);
                //}
                int n = Integer.parseInt(l.substring(2,l.length()));
                //System.out.println("remove n "+ n);
                for(int i=0;i<n;i++){
                    //System.out.println("remove i "+i);
                    cbl.remove(0);
                }
            }else if(cmd == 'L'){
                for(String s : cbl){
                    System.out.println(s);
                }
            }else if(cmd == 'Q'){
                System.exit(0);
            }

        }
    }

}
