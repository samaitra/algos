package com.dsalgo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/10/13
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class SnakeAndLadders {

    static List<Movers> snakeAndLadders;

    public static void main(String[] args){
        snakeAndLadders = new ArrayList<Movers>();
        snakeAndLadders.add(new Movers(9, 31));
        snakeAndLadders.add(new Movers(17, 7));

        int[] moveMap = new int[101];
        for(Movers m : snakeAndLadders)
            moveMap[m.start]=m.end;

        int[] minMove = new int[101];
        int[] dice = new int[101];
        int[] fromCell = new int[101];

        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(1);
        boolean fin = false;

        while (!q.isEmpty()&&!fin){

            int cell = q.poll();
            for(int i=0;i<6;i++){
                int newCell = moveMap[cell+i] == 0 ? cell + i : moveMap[cell+i];
                if(minMove[newCell]==0){
                    minMove[newCell] = minMove[cell]+1;
                    dice[newCell] = i;
                    fromCell[newCell] = cell;
                    q.add(newCell);
                }
                if(newCell == 100){
                    fin = true;
                    break;
                }

            }

        }

        int cell=100;
        Stack<String> stack=new Stack<String>();
        while(cell!=1)
        {
            stack.push("new cell "+cell);
            stack.push("dice throw "+dice[cell]);

            cell=fromCell[cell];
        }
        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }
}

class Movers{
  public int start;
  public int end;
  public boolean goingUp;

    public Movers(int start,int end){
        this.start = start;
        this.end = end;
    }
}