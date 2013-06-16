package com.hr;

import java.io.FileReader;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 6/16/13
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoinOnTheTable {
    public static void main(String[] args)throws Exception{

    Scanner in = new Scanner(new FileReader("coin/in"));
    int n = in.nextInt();
    int m = in.nextInt();
    int k = in.nextInt();

    char[][] table = new char[n][m];

    for(int i=0;i<n;i++){
        String line = in.next();
        char[] chars = line.toCharArray();
        for(int j=0;j<m;j++){
            table[i][j] = chars[j];
        }
    }
   out.println(table[1][1]);




}
}
