package com.hr;

import java.io.File;
import java.util.Scanner;


public class StringReduction {

	public static void main(String[] args) throws Exception{
	
		int n;
		File f = new File("./StringReduction/input01.txt");
		Scanner in = new Scanner(f);
		//Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(int i=0;i<n;i++){
			String s = in.next();

            int j=1;

                int num_a=0;
                int num_b=0;
                int num_c=0;
                int k=0;
                while(k<s.length()){
                    if(s.charAt(k)=='a')
                        num_a++;
                    else if (s.charAt(k)=='b')
                        num_b++;
                    else if (s.charAt(k)=='c')
                        num_c++;
                    k++;
                }
                int flag_two_zero=0;

                if(num_a==0)
                    flag_two_zero=flag_two_zero+1;
                if(num_b==0)
                    flag_two_zero=flag_two_zero+1;
                if(num_c==0)
                    flag_two_zero=flag_two_zero+1;
                if(flag_two_zero==2){
                    System.out.println(s.length());
                }else{
                if(num_a%2==0 && num_b%2==0 && num_c%2==0)
                    System.out.println(2);
                else if(num_a%2==1 && num_b%2==1 && num_c%2==1)
                    System.out.println(2);
                else
                    System.out.println(1);

                }

        }
    }
}