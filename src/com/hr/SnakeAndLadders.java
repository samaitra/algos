package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 9/24/13
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class SnakeAndLadders {


    private static List<Movers> snakesAndLadders;

    public static void main (String[] args) throws Exception{


        //BufferedReader bufferedReader = new BufferedReader(new FileReader("in"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        int n = Integer.parseInt(bufferedReader.readLine());
        for(int j=0;j<n;j++){

        String[] numSnakeLadders = bufferedReader.readLine().split(",");

        int numLadders = Integer.parseInt(numSnakeLadders[0]);
        int numSnakes = Integer.parseInt(numSnakeLadders[1]);

        snakesAndLadders = new ArrayList<Movers>();

        String[] ladders = bufferedReader.readLine().split(" ");

        for(String s : ladders){

          String[] ladder = s.split(",");
          snakesAndLadders.add(new Movers(Integer.parseInt(ladder[0]), Integer.parseInt(ladder[1])));

        }

        String[] snakes = bufferedReader.readLine().split(" ");

        for(String s : snakes){
            String[] snake = s.split(",");
            snakesAndLadders.add(new Movers(Integer.parseInt(snake[0]), Integer.parseInt(snake[1])));

        }


        int[] moveMap = new int[101];

        for (Movers movers : snakesAndLadders)
            moveMap[movers.start] = movers.end;

        int[] minMove = new int[101];
        int[] dice = new int[101];
        int[]fromCell=new int[101];

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        boolean finished=false;
        while (!queue.isEmpty()&&!finished)
        {
            int cell = queue.poll();
            for (int i = 1; i <= 6; ++i)
            {
                int newCell = moveMap[cell + i] == 0 ? cell + i : moveMap[cell + i];
                if (minMove[newCell] == 0)
                {
                    minMove[newCell] = minMove[cell] + 1;
                    dice[newCell]=i;
                    fromCell[newCell]=cell;
                    queue.add(newCell);
                }
                if(newCell==100)
                {
                    finished=true;
                    break;
                }

            }

        }
        int cell=100;
        Stack<String> stack=new Stack<String>();
        int c=0;
        while(cell!=1)
        {
            stack.push("new cell "+cell);
            stack.push("dice throw "+dice[cell]);
            cell=fromCell[cell];
            c++;
        }
            System.out.println(c);

        //while(!stack.isEmpty())
          //  System.out.println(stack.pop());
    }
  }
}


class Movers
{

    public int start;

    public int end;

    public boolean goingUp;

    public Movers(int start, int end)
    {

        this.start = start;

        this.end = end;
    }
}
