package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 28/08/13
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerArrayAdd1 {

    public static void main(String[] args){
        int[] a = {9,9};
        int[] b = add(a);
        for(int i=0;i<b.length;i++){

            if(i==0){
                System.out.print("{");
            }

            System.out.print(b[i]);

            if(i!=(b.length-1)){
              System.out.print(", ");
            }
            if(i==(b.length-1)){
                System.out.print("}");
            }

        }
    }
    public static int[] add(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length;i++){
           sb.append(a[i]);
        }

        String s = sb.toString();
        int num = Integer.parseInt(s);
        num = num+1;
        s = String.valueOf(num);
        //System.out.println(s);

        int[] b = new int[s.length()];
        for(int i=0;i<s.length();i++){
            b[i] = Integer.parseInt(s.substring(i,i+1));
        }

        return b;
    }
}
