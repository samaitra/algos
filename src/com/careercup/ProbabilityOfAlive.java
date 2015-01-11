package com.careercup;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 15/09/13
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProbabilityOfAlive {

    public static void main(String[] args){

        System.out.print(probabilityOfAlive(0,0,1));
    }


    static double probabilityOfAlive(int x, int y, int n){

        if(x<0||x>(n-1)||y<0||y>(n-1)||n<1){
            return 0.0;
        }
        return probabilityOfAlive(x,y,n,n,new HashMap<String,Double>());
    }
    static double probabilityOfAlive(int x,int y, int n, int step, HashMap<String,Double> map){

        if(0==step)
            return 1.0;


        String key = "";
        {
            StringBuffer sb = new StringBuffer();
            sb.append(x+",");
            sb.append(y+",");
            sb.append(step+".");
            key = sb.toString();
        }

        if(map.containsKey(key))
            return map.get(key);

        double probability = 0.0;

        if(x>0)
            probability += 0.25 * probabilityOfAlive(x-1,y,n,step-1,map);
        if(x<(n-1))
            probability += 0.25 * probabilityOfAlive(x+1,y,n,step-1,map);
        if(y>0)
            probability += 0.25 * probabilityOfAlive(x,y-1,n,step-1,map);
        if(y<(n-1))
            probability += 0.25 * probabilityOfAlive(x,y+1,n,step-1,map);


        map.put(key,probability);
        return probability;

    }

}
