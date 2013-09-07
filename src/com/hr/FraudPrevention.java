package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/**
* Created with IntelliJ IDEA.
* User: saikat
* Date: 05/09/13
* Time: 2:23 PM
* To change this template use File | Settings | File Templates.
*/
public class FraudPrevention {


    public static void main(String[] args) throws Exception{

        List<String[]> orderList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("fraudprevention/in"));
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<n;i++){
            String line=bufferedReader.readLine();
            String[] orderDetailsArray = line.split(",");
            orderList.add(orderDetailsArray);
        }


        HashMap<String,Boolean> forders = getFraudOrders(orderList);

        List<Integer> orders = new ArrayList<>();

        for(String orderId : forders.keySet()){
            orders.add(Integer.parseInt(orderId));
        }

        Collections.sort(orders);
        int c=1;
        for(Integer i : orders){
            System.out.print(i);
            if(c!=forders.size()){
                System.out.print(",");
            }
            c++;
        }

    }


        private static HashMap<String,Boolean> getFraudOrders(List<String[]> orderList){

        HashMap<String,Boolean> forders = new HashMap<>();
        for(int i=0;i<orderList.size();i++){
            for(int j=1;j<orderList.size();j++){

                 String[] order1Array = orderList.get(i);
                 String[] order2Array = orderList.get(j);

                 String email1 = getFormattedEmail(order1Array[2]);
                 String email2 = getFormattedEmail(order2Array[2]);
                 String address1 = getFormattedAddress(order1Array[3]);
                 String address2 = getFormattedAddress(order2Array[3]);
                 String city1 = order1Array[4];
                 String city2 = order2Array[4];
                 String state1 = getFormattedState(order1Array[5]);
                 String state2 = getFormattedState(order2Array[5]);



                if(order1Array[1].equals(order2Array[1])
                         && email1.equals(email2)
                         && !order1Array[7].equals(order2Array[7])){


                     forders.put(order1Array[0], true);
                     forders.put(order2Array[0], true);

                 }

                if(address1.equals(address2) && city1.toUpperCase().equals(city2.toUpperCase()) && state1.equals(state2)
                        && order1Array[6].equals(order2Array[6])
                        && order1Array[1].equals(order2Array[1])
                        && !order1Array[7].equals(order2Array[7])){


                     forders.put(order1Array[0], true);
                     forders.put(order2Array[0], true);

                }

            }
        }
            return forders;
    }
    private static String getFormattedState(String state){
        state = state.toUpperCase();

        if(state.equals("IL") || state.equals("ILLINOIS")){
            state = "IL";
        }
        if(state.equals("CA") || state.equals("CALIFORNIA")){
            state = "CA";
        }
        if(state.equals("NY") || state.equals("NEW YORK")){
            state = "NY";
        }


        return state;

    }
    private static String getFormattedAddress(String address){
        address = address.toUpperCase();
        if(address.contains("ST.")){
            address = address.replace("ST.","STREET");
        }
        if(address.contains("RD.")){
            address = address.replace("RD.","ROAD");
        }
        return address;
    }


    private static String getFormattedEmail(String email1){
        email1 = email1.toUpperCase();
        String username = email1.substring(0,email1.indexOf("@"));
        String remainingEmail = email1.substring(email1.indexOf("@"));

        if(username.contains(".")){
        username = username.replaceAll("\\.","");
        email1 = username+remainingEmail;
        }

        if(username.contains("+")){
        int startIndex = email1.indexOf("+");
        int endIndex = email1.indexOf("@");
        String first = email1.substring(0,startIndex);
        String last = email1.substring(endIndex);
        email1 = first+last;

        }

        return email1;
    }

}



