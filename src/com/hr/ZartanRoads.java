package com.hr;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 04/08/13
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class ZartanRoads {

    int N,M;
    static boolean[] visited,visited2;
    static Stack<Junction> visitedJunctions = new Stack<Junction>();
    static StatusMessage s = new StatusMessage();
    static Junction fc,lc;


    public static void main(String[] args) throws Exception{
        //Scanner in = new Scanner(new FileReader("zartanroads/in"));
        Scanner in = new Scanner(new InputStreamReader(System.in));

        int N = in.nextInt();
        int M = in.nextInt();

        Junction[] junctions = new Junction[N+1];

        for(int i=0;i<N;i++){
            Junction j = new Junction(i);
            junctions[i]=j;
        }


        for(int i=0;i<M;i++){
            int from = in.nextInt();
            int to = in.nextInt();

            junctions[from].neighbours.add(junctions[to]);
        }
        String msg = "YES";
        for(Junction j:junctions){
        fc = j;
        lc = j;
        int c = countPath(j);
        if(c<=1)
        {
            msg = "NO";
            break;
        }
        }
        System.out.println(msg);
    }

    private static int countPath(Junction junction) {

        if(junction.pathCount!=0){
            return (junction.pathCount);
        }

        if(junction.visited){
            for(Junction j : visitedJunctions){
                boolean reachable = isReacheable(j,j);
                if(reachable){
                    s.infinity = true;
                    //return -1;

                }
                if(j == j){
                    break;
                }
            }

            return 0;
        }

        junction.visited = true;
        visitedJunctions.push(junction);
        Set<Junction> neighbours = junction.neighbours;

        int totalCount = 0;
        if(junction==lc){
            totalCount=1;
        }
        for(Junction n : neighbours){
            totalCount = totalCount + countPath(n);
        }

        visitedJunctions.pop();
        junction.visited = false;
        junction.pathCount = totalCount;

        return totalCount;




    }

    private static boolean isReacheable(Junction city, Junction to) {

        if(city==to){
            return true;
        }
        if(city.visited2){
            return false;
        }

        boolean result = city.reachable;

        city.visited2 = true;

        boolean anyReachable = false;
        for(Junction neighbour : city.neighbours){
            boolean reachable = isReacheable(neighbour, to);

            if(reachable){
                anyReachable = true;
                break;
            }
        }

        city.visited2 = false;
        city.reachable = anyReachable?true:false;
        return anyReachable;
    }




}
class StatusMessage{
    boolean infinity=false;

}

class Junction{
    int id;
    int pathCount;
    Set<Junction> neighbours;
    boolean visited;
    boolean visited2;
    boolean reachable;

    Junction(int id){
        this.id = id;
        pathCount = 0;
        neighbours = new HashSet<Junction>();
    }


}
