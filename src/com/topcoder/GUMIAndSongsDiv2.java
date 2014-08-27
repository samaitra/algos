package com.topcoder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/12/13
 * Time: 9:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class GUMIAndSongsDiv2 {

    public int maxSongs(int[] duration, int[] tone, int T){
        int maxSongs=0;
        ArrayList<Integer> songs = new ArrayList<>();
        for(int i=0;i<duration.length;i++){
          songs.add(duration[i]);
        }

        for(int i=0;i<duration.length;i++){

           // int index = songs.getMinSong(songs);
        }


        return maxSongs;
    }
    //public int getMinSong(ArrayList<Integer>)
}
