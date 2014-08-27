package com.hackerrank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Saikat
 * Date: 7/14/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class HtmlLinks {
    public static void main(String[] args) throws Exception{

        //BufferedReader bufferedReader =new BufferedReader (new InputStreamReader(System.in));
        BufferedReader bufferedReader =new BufferedReader (new FileReader("htmllinks/in"));

        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            sb.append(line);

        }

        Pattern htmltag = Pattern.compile("<a\\b[^>]*href=\"[^>]*>(.*?)</a>");
        Pattern link = Pattern.compile("href=\"[^>]*\">");
        Pattern text = Pattern.compile(">\\w(.*?)<");

        Matcher tagmatch = htmltag.matcher(sb.toString());
        while (tagmatch.find()) {
            Matcher matcher = link.matcher(tagmatch.group());
            matcher.find();
            String l = matcher.group().replaceFirst("href=\"", "")
                    .replaceFirst("\">", "")
                    .replaceFirst("\"[\\s]?target=\"[a-zA-Z_0-9]*", "");
            if(l.contains("\"")){
            l = l.substring(0,l.indexOf("\""));
            }
            Matcher matcher1 = text.matcher(tagmatch.group());
            matcher1.find();
            String t = matcher1.group().toString();
            t = t.replace(">","");
            t = t.replace("<","");
            System.out.println(l+","+t);
        }
    }

}
