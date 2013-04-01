package com.hr;

import javax.swing.tree.TreeModel;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


class Balances{


public static void main(String[] argv) throws Exception{

	Scanner in = new Scanner(new FileReader(new File("balances/input00.txt")));

    int n = in.nextInt();
    System.out.println("n "+n);


}
}