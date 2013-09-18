package com.cc;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 18/09/13
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class AggregateNumber {

    public static void main(String[] args){

        String num1 = "112358";
        String num2 = "122436";
        String num3 = "1299111210";


        System.out.print(isAggregateNumber(num3));

    }
    public static boolean isAggregateNumber(String num){


        for(int i = 1;i<num.length()/2;i++){
          for(int j = 2;j<num.length()/2;j++){

              if(match(i,j,num)){
                  return true;
              }

          }
      }

     return false;
    }

    public static boolean match(int i,int j, String num){

        String first = num.substring(0,i);
        String second = num.substring(i,i*2);
        StringBuilder buffer = new StringBuilder(first);
        buffer.append(second);
        while (buffer.length()<num.length()){
            Integer x = Integer.parseInt(first)+Integer.parseInt(second);
            String third = x.toString();
            buffer.append(third);
            first = second;
            second = third;

        }

        System.out.println(buffer.toString());
        if(num.equals(buffer.toString()))
            return true;
        return false;

    }

}
