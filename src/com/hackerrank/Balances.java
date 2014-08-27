package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 6/15/13
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Balances {

    public static void main(String[] args) throws Exception{
    BufferedReader in = new BufferedReader(new FileReader("Balances_testcases/input01.txt"));

        int N  = Integer.parseInt(in.readLine());
        int count = 1;

        Balance balances[] = new Balance[N];
        for(int i=0;i<N;i++){
           balances[i] = new Balance(i);
        }
        int bid = 0;
        for(int i=0;i<(2*N);i++){

           // out.println("count "+ count);
            if(count%2!=0){
                //out.println("i am in left count "+count);
              String line = in.readLine();
              //System.out.println("line "+line);
              if(!(line.equals(""))){
                String input[] = line.split(" ");
                //out.println("input length "+input.length);
                int w = Integer.parseInt(input[0]);
                //if(Integer.parseInt(input[0])!=0){
                  Weight weight = new Weight(w);
                  //out.println("weight "+weight.value);
                  //out.println("i "+i);
                  balances[bid].left.add(weight);
                //}
                for(int j=1;j<input.length;j++){

                  int balanceId = Integer.parseInt(input[j]);
                  //System.out.println("balanceId "+balanceId);

                  balances[bid].left.add(balances[balanceId]);

                }
              }
            }

            else{
                //out.println("i am in right count "+count);
                String line = in.readLine();
                //System.out.println("line "+line);

                if(!(line.equals(""))){
                String input[] = line.split(" ");
                //out.println("input length "+input.length);
                int w = Integer.parseInt(input[0]);
                //if(Integer.parseInt(input[0])!=0){
                    Weight weight = new Weight(w);
                    balances[bid].right.add(weight);
                //}else if(Integer.parseInt(input[0])==0){
                   // Weight weight = new Weight(0)
                //}
                for(int j=1;j<input.length;j++){
                    int balanceId = Integer.parseInt(input[j]);
                    //out.println("balanceId  === "+ balanceId);
                    balances[bid].right.add(balances[balanceId]);

                }
                }


              bid++;
            }

            count++;
            //System.out.println("=====");
        }


        balanceTheBalances(balances);

    }

    private static void balanceTheBalances(Balance[] balances) {
        StringBuilder s = new StringBuilder();
        int n = balances.length;
        for(int i=(n-1);i>=0;i--){
          int leftWeight = 0;
          int rightWeight = 0;
            for(Object o : balances[i].left){
                String item = o.getClass().getName();
                //out.println(" balance "+i+ " left "+item);

                if(item.contains("Weight")){
                    Weight w = (Weight) o;
                    //out.println("Balance "+i+" left weight"+w.value);
                    leftWeight = leftWeight+w.value;
                    balances[i].value = balances[i].value+w.value;
                }
                else if(item.contains("Balance")){
                    Balance balance = (Balance) o;
                    //out.println("Balance "+i+" left balance"+balance.value);
                    leftWeight = leftWeight+balance.value;
                    balances[i].value = balances[i].value+balance.value;
                }
            }
            for(Object o : balances[i].right){
               String item = o.getClass().getName();
                //out.println(" balance "+i+ " right "+item);

                if(item.contains("Weight")){
                    Weight w = (Weight) o;
                    //out.println("Balance "+i+" right weight"+w.value);
                    rightWeight = rightWeight+w.value;
                    balances[i].value = balances[i].value+w.value;
                }
                else if(item.contains("Balance")){
                    Balance balance = (Balance) o;
                    //out.println("Balance "+i+" right weight"+balance.value);
                    rightWeight = rightWeight+balance.value;
                    balances[i].value = balances[i].value+balance.value;
                }

            }
            //System.out.println("Balance "+i);
            //System.out.println("leftWeight "+leftWeight);
            //System.out.println("rightWeight "+rightWeight);

            if(leftWeight==rightWeight){
                s.append(i+": "+0+" "+0+"\n");
            }
            else if(leftWeight>rightWeight){
                int w = leftWeight-rightWeight;
                s.append(i + ": " + 0 + " " + w + "\n");
                Weight weight = new Weight(w);
                balances[i].right.add(weight);
                balances[i].value = balances[i].value+w;
            }
            else if(rightWeight>leftWeight){
                int w = rightWeight-leftWeight;
                s.append(i + ": " + w + " " + 0 + "\n");
                Weight weight = new Weight(w);
                balances[i].left.add(weight);
                balances[i].value = balances[i].value+w;
            }





        }
        String[] lines = s.toString().split("\\n");
        for(int k=(lines.length-1);k>=0;k--){

            System.out.println(lines[k]);
        }
    }


}

class Balance{
    int id;
    Set left;
    Set right;
    int value;
    Balance(int id){
     this.id = id;
     this.left = new HashSet();
     this.right = new HashSet();
     value = 10;
    }
}
class Weight{
    int value;
    Weight(int value){
        this.value = value;
    }
}



