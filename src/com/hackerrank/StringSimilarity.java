package com.hackerrank;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class StringSimilarity {

    public static void main(String args[]) throws Exception{

    Scanner in = new Scanner(new FileReader(new File("./StringSimilarity/input00.txt")));

    int n = in.nextInt();
    System.out.println("n "+n);

        for(int k=0;k<n;k++){

            String str = in.next();

            int c=0;
            char[] charArray = str.toCharArray();
            int len = str.length();
            System.out.println(str);
            for(int i=0;i<len;i++){

                for(int j=i;j<len;j++){
                    System.out.println("charArray[j-i] "+charArray[j-i]);
                    System.out.println("charArray[j] "+charArray[j]);

                    if(charArray[j-i]==charArray[j]){
                        c++;
                    } else{
                        break;
                    }

                    System.out.println("loop completes =============== " +i);
                }


            }
            System.out.println(c);
        }
    }


}
