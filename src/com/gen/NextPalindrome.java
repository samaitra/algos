package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 08/08/13
 * Time: 1:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class NextPalindrome {

        public static void main(String args[]){

            int n = 1234567;
            String in = String.valueOf(n);

            if(in.length()%2==0){

            //even case
            String left = in.substring(0,in.length()/2);
            String right = in.substring(in.length()/2,in.length());

            int leftReverse = Integer.parseInt(new StringBuffer(left).reverse().toString());
            int rightVal = Integer.parseInt(right);
            if(leftReverse>rightVal){
                String pal = left+String.valueOf(leftReverse);
                System.out.print("palindrome "+pal);
            }else{
                left = String.valueOf(Integer.parseInt(left)+1);
                String tempLeft = left;
                String pal = left+(new StringBuffer(tempLeft).reverse().toString());
                System.out.print("palindrome "+pal);
            }

            }else{
                 //odd case
                 String left = in.substring(0,in.length()/2);
                 String middle = in.substring(in.length()/2,(in.length()/2)+1);
                 String right = in.substring((in.length()/2)+1,in.length());

                int leftReverse = Integer.parseInt(new StringBuffer(left).reverse().toString());
                int rightVal = Integer.parseInt(right);
                if(leftReverse>rightVal){
                    String pal = left+middle+String.valueOf(leftReverse);
                    System.out.print("palindrome "+pal);
                }else{
                    left = String.valueOf(Integer.parseInt(left+middle)+1);
                    String tempLeft = left;
                    String pal = left+(new StringBuffer(tempLeft).reverse().toString());
                    System.out.print("palindrome "+pal);

                }




        }


        }

}
