package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: Saikat
 * Date: 7/14/13
 * Time: 7:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Encryption {

    public static void main(String[] args) throws Exception{

        //BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader (new FileReader("encryption/in"));

        String line = bufferedReader.readLine();
        int wordLength = line.length();
        double width = Math.floor(Math.sqrt(wordLength));
        double height = Math.ceil(Math.sqrt(wordLength));

        int sqreVal = (int) (width*height);

        if(sqreVal<wordLength){
            width = Math.ceil(Math.sqrt(wordLength));
        }

        //System.out.println("double width " + width);
        //System.out.println("double height " + height);

        int w = (int)width;
        int h = (int)height;
        //System.out.println("w "+w);
        //System.out.println("h "+h);

        String[][] newWord = new String[w][h];
        int c = 0;
        try{
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                newWord[i][j]=line.substring(c,c+1);
                c++;
            }
        }
        }catch (Exception e){

        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(newWord[j][i]!=null){
                System.out.print(newWord[j][i]);
                }
            }
            System.out.print(" ");
        }

    }
}
