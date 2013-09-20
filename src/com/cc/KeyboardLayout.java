package com.cc;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 18/09/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeyboardLayout {

    static char [][] keyboard = new char[6][5];
    static int lastX = 0;
    static int lastY = 0;
    static boolean found = false;
    public static void main(String[] args){

        getWord("bc");


    }

    public static void getWord(String word){

        System.out.println(generateRemoteSequence(word));

    }

    static String generateRemoteSequence(String word){

        word = word.toLowerCase();

        StringBuffer sequence = new StringBuffer();

        int current_x = 0, current_y = 0;

        for (Character c : word.toCharArray()){

            int location =  c - 'a';

            int x = location%5;
            int y = location/5;

            char horizontal = current_x < x ? 'r':'l';
            char vertical = current_y < y ? 'd':'u';

            for (int i=0; i < Math.abs(current_x - x) ; i++){
                sequence.append(horizontal);
            }

            for (int i=0; i < Math.abs(current_y - y) ; i++){
                sequence.append(vertical);
            }

            sequence.append('!');

            current_x = x;
            current_y = y;

        }

        return sequence.toString();

    }



}
