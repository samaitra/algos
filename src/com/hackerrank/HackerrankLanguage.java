package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/4/13
 * Time: 12:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class HackerrankLanguage {

    public static void main(String[] args) throws Exception{
        String str = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:" +
                "BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART:GROOVY:OBJECTIVEC";

        BufferedReader bufferedReader =new BufferedReader (new FileReader("hackerranklanguage/in"));
        int n = Integer.parseInt(bufferedReader.readLine());
        int c = 0;
        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            String[] lang = line.split("\\s");
            String language = lang[1];

            String[] hl = str.split(":");

            if(match(hl,language))
                System.out.println("VALID");
            else
                System.out.println("INVALID");




        }

    }
     public static boolean match(String[] a,String b){
        for(String li : a){
            //System.out.println("lix "+li);
            //System.out.println("bxx "+b);

            if(li.matches(b)){
                //System.out.println("lix "+li);
                //System.out.println("bxx "+b);
                return true;
            }
        }
         //System.out.println("------");
         return false;
     }
}
