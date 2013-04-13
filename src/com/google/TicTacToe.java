package com.google;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 13/04/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class TicTacToe {

    public static void main(String[] args) throws Exception{

            BufferedReader bufferedReader = new BufferedReader(new FileReader("TicTacToe/A-large.in"));
            int n = Integer.parseInt(bufferedReader.readLine());

            BufferedWriter bw = new BufferedWriter(new FileWriter("TicTacToe/a.out"));
            //for(int k=0;k<n;k++){
            int k=0;
            char a[][] = new char[4][4];


            String line;
            int i=0;
            while((line=bufferedReader.readLine())!=null){

                if(!line.equals("")){

                    char[] chars = line.toCharArray();
                    for(int j=0;j<4;j++){

                        a[i][j]=chars[j];

                    }

                    i++;

                }else{
                    k=k+1;
                    i=0;
                    if(checkWon(a)=='X'){
                        System.out.println("Case #" + (k) + ": " + "X won");
                        bw.write("Case #"+(k)+": " + "X won" + "\n");
                        bw.flush();

                    }else if(checkWon(a)=='O'){
                        System.out.println("Case #" + (k) + ": " + "O won");
                        bw.write("Case #"+(k)+": " + "O won" + "\n");
                        bw.flush();
                    }else if(isGameDraw(a)){

                        System.out.println("Case #" + (k) + ": " + "Draw");
                        bw.write("Case #"+(k)+": " + "Draw" + "\n");
                        bw.flush();

                    }else{
                        System.out.println("Case #" + (k) + ": " + "Game has not completed");
                        bw.write("Case #"+(k)+": " + "Game has not completed" + "\n");
                        bw.flush();}
                }
            }


        //}

        bw.close();

    }

    public static char checkWon(char a[][]){
        char ch='a';

        // check rows
        for(int i=0;i<4;i++){
        int numX=0;
        int numO=0;
        int numT=0;
        for(int j=0;j<4;j++){

         if(a[i][j]=='X')
             numX=numX+1;
         else if(a[i][j]=='O')
             numO=numO+1;
         else if(a[i][j]=='T')
             numT=numT+1;


        }
        if(numX==4 || (numX==3&& numT==1)){
            return 'X';
        }else if(numO==4 || (numO==3&& numT==1)){
            return 'O';
        }
       }



      // check columns
        for(int j=0;j<4;j++){

        int numX=0;
        int numO=0;
        int numT=0;
        for(int i=0;i<4;i++){

            if(a[i][j]=='X')
                numX=numX+1;
            else if(a[i][j]=='O')
                numO=numO+1;
            else if(a[i][j]=='T')
                numT=numT+1;

        }

            if(numX==4 || (numX==3&& numT==1)){
                return 'X';
            }else if(numO==4 || (numO==3&& numT==1)){
                return 'O';
            }

        }

        // check diagonal 1
        int numX=0;
        int numO=0;
        int numT=0;

        for(int i=0;i<4;i++){

            for(int j=0;j<4;j++){

                if(i==j){
                    if(a[i][j]=='X')
                        numX=numX+1;
                    else if(a[i][j]=='O')
                        numO=numO+1;
                    else if(a[i][j]=='T')
                        numT=numT+1;

                }

            }


        }

        if(numX==4 || (numX==3&& numT==1)){
            return 'X';
        }else if(numO==4 || (numO==3&& numT==1)){
            return 'O';
        }


        // check diagonal 2
         numX=0;
         numO=0;
         numT=0;

        for(int i=0;i<4;i++){

            for(int j=0;j<4;j++){

                 if((i==0&&j==3)||(i==1&&j==2)||(i==2&&j==1)||(i==3&&j==0)){
                    if(a[i][j]=='X')
                        numX=numX+1;
                    else if(a[i][j]=='O')
                        numO=numO+1;
                    else if(a[i][j]=='T')
                        numT=numT+1;

                }

            }


        }

        if(numX==4 || (numX==3&& numT==1)){
            return 'X';
        }else if(numO==4 || (numO==3&& numT==1)){
            return 'O';
        }

        return ch;
    }

    public static boolean isGameDraw(char a[][]){

        for(int i=0;i<4;i++ ){
            for(int j=0;j<4;j++){
                if(a[i][j]=='.'){
                    return false;
                }
            }
        }

    return true;
    }


    }
