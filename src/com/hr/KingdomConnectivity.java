package com.hr;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 6/10/13
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class KingdomConnectivity {

  int N,M;
  int MOD = 1000000000;
  boolean[] visited,visited2;
  Stack<City> visitedCities = new Stack<City>();
  public static void main(String[] args) throws Exception{
      Scanner in = new Scanner(new FileReader("kc/in"));

      int N = in.nextInt();
      int M = in.nextInt();

      City[] cities = new City[N+1];

      for(int i=1;i<=N;i++){
          City c = new City(i);
          cities[i]=c;
      }

      City fc = cities[1];
      City lc = cities[N];

      for(int i=0;i<M;i++){
          int from = in.nextInt();
          int to = in.nextInt();
          cities[from].neighbours.add(cities[to]);
      }

       countPath(fc);

  }

    private static void countPath(City fc) {






    }

}
 class City{
     int id;
     int pathCount;
     Set<City> neighbours;
     City(int id){
       this.id = id;
       pathCount = 0;
       neighbours = new HashSet<City>();
     }
 }