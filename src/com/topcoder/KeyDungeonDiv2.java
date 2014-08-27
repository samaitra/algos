package com.topcoder;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/12/13
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeyDungeonDiv2 {

  public int countDoors(int[] doorR, int[] doorG, int[] keys){
      int count=0;

      int numRed = keys[0];
      int numGreen = keys[1];
      int numWhite = keys[2];

      for(int i=0;i<doorR.length;i++){

          int numRedKeyHoles = doorR[i];
          int numGreenKeyHoles = doorG[i];
//          System.out.println("red holes "+numRedKeyHoles);
//          System.out.println("green holes "+numGreenKeyHoles);
//
//          System.out.println("red keys "+numRed);
//          System.out.println("green keys "+numGreen);
//          System.out.println("white keys "+numWhite);

         // boolean flag = false;
          if(numRedKeyHoles<=numRed && numGreenKeyHoles<=numGreen){
             // flag=true;
              count++;
          }else if(numRed==0 && numGreen==0){
              if((numRedKeyHoles+numGreenKeyHoles)<=numWhite){
                 // flag=true;
                  count++;
                  //System.out.println(count);
              }
          }else if(numRedKeyHoles>numRed && numGreenKeyHoles>numGreen){

              int tempRedWhite = numRedKeyHoles-numRed;
              int tempGreeenWhite = numGreenKeyHoles-numGreen;

            //  System.out.println("I am here");

              if(numRedKeyHoles<=(numRed+tempRedWhite) && numGreenKeyHoles<=(numGreen+tempGreeenWhite)&&(tempGreeenWhite+tempRedWhite)<=numWhite){
                  count++;
                //  System.out.println("I am here");
                 // System.exit(0);
              }


          }
          else if(numRedKeyHoles>numRed){
              if(numRedKeyHoles<=(numRed+numWhite) && numGreenKeyHoles<numGreen){
               //   flag=true;
                  count++;
              }
          }else if(numGreenKeyHoles>numGreen){
              if(numRedKeyHoles<=numRed && numGreenKeyHoles<=(numGreen+numWhite)){
                //  flag=true;
                  count++;
              }
          }

//          if(flag==false){
//              //System.exit(0);
//          }


      }
      return count;
  }

    public static void main(String[] args){
        int[] doorR = {41,44,41,57,58,74,84,100,58,2,43,32,82,97,44,13,35,98,96,81,43,77,18,51,27,
                27,39,39,45,82,59,20,28,93,6,39,64,78,28,85,17,56,3,68,4,0,36,80,41,77};
        int[] doorG = {67,15,53,36,88,29,26,57,68,99,97,27,51,70,3,49,65,75,35,92,66,0,23,96,38,86,
                98,31,26,75,30,2,92,78,100,99,38,26,85,74,77,15,16,48,100,88,55,93,99,54};
        int[] keys = {39,31,34};
        System.out.print(new KeyDungeonDiv2().countDoors(doorR,doorG,keys));

    }


}
