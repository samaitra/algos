package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Saikat
 * Date: 7/14/13
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class HtmlTags {

    public static void main(String[] args) throws Exception{

        //BufferedReader bufferedReader =new BufferedReader (new InputStreamReader(System.in));
    BufferedReader bufferedReader =new BufferedReader (new FileReader("htmltags/in"));

    int n = Integer.parseInt(bufferedReader.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<n;++i){
        String line = bufferedReader.readLine();
        sb.append(line);

    }
        HashSet<String> tagSet = new HashSet<String>();
        Pattern p = Pattern.compile("</\\w+>");
        Matcher m = p.matcher(sb.toString());
        while(m.find()){
         String tag = m.group();
         tag = tag.replace("</","");
         tag = tag.replace(">","");
         tagSet.add(tag);
        }
        ArrayList<String> aList = new ArrayList<String>();
        for(String s : tagSet){
          aList.add(s);
        }
        Collections.sort(aList);
        String line = "";
        for(String s : aList){
          line=line+s+";";
        }
        System.out.print(line.substring(0,line.length()-1));

}
}