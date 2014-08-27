package com.hackerrank;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 6/10/13
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class KingdomConnectivity {

  int N,M;
  static int MOD = 1000000000;
  static boolean[] visited,visited2;
  static Stack<City> visitedCities = new Stack<City>();
  static City fc,lc;
  static Status s = new Status();
    public static void main(String[] args) throws Exception{
      Scanner in = new Scanner(new FileReader("kc/in"));

      int N = in.nextInt();
      int M = in.nextInt();

      City[] cities = new City[N+1];

      for(int i=1;i<=N;i++){
          City c = new City(i);
          cities[i]=c;
      }

       fc = cities[1];
       lc = cities[N];

      for(int i=0;i<M;i++){
          int from = in.nextInt();
          int to = in.nextInt();
          cities[from].neighbours.add(cities[to]);
      }

       int c = countPath(fc);
        if(s.infinity){
           System.out.println("INFINITE PATHS");
       }else{
           System.out.println(c);
       }
  }

    private static int countPath(City city) {

        if(city.pathCount!=0){
            return (city.pathCount);
        }

        if(city.visited){
            for(City c : visitedCities){
              boolean reachable = isReacheable(c,lc);
              if(reachable){
                  s.infinity = true;
                  //return -1;

              }
                if(c == city){
                    break;
                }
            }

            return 0;
        }

        city.visited = true;
        visitedCities.push(city);
        Set<City> neighbours = city.neighbours;

        int totalCount = 0;
        if(city==lc){
           totalCount=1;
        }
        for(City n : neighbours){
            totalCount = (totalCount + countPath(n)) % MOD;
        }

        visitedCities.pop();
        city.visited = false;
        city.pathCount = totalCount;

        return totalCount;




    }

    private static boolean isReacheable(City city, City to) {

        if(city==to){
           return true;
       }
       if(city.visited2){
           return false;
       }

        boolean result = city.reachable;

        city.visited2 = true;

       boolean anyReachable = false;
        for(City neighbour : city.neighbours){
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
 class Status{
     boolean infinity=false;

 }

 class City{
     int id;
     int pathCount;
     Set<City> neighbours;
     boolean visited;
     boolean visited2;
     boolean reachable;

     City(int id){
       this.id = id;
       pathCount = 0;
       neighbours = new HashSet<City>();
     }
 }