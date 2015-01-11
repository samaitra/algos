package com.assignments;
import java.util.HashSet;
import java.util.Set;


public class Person {

	String name;
	long phone;
	String email;
	public String getRandomName() {
		// TODO Auto-generated method stub
		
		
		final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		final java.util.Random rand = new java.util.Random();

		// consider using a Map<String,Boolean> to say whether the identifier is being used or not 
		final Set<String> identifiers = new HashSet<String>();

		    StringBuilder builder = new StringBuilder();
		    while(builder.toString().length() == 0) {
		        int length = rand.nextInt(5)+5;
		        for(int i = 0; i < length; i++)
		            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
		        if(identifiers.contains(builder.toString()))
		            builder = new StringBuilder();
		     
		    }  
		    //System.out.println(builder.toString());
		    return builder.toString();
		}
	
	public String getRandomEmail() {

		final String lexicon = "abcdefghijklmnopqrst";

		final java.util.Random rand = new java.util.Random();

		// consider using a Map<String,Boolean> to say whether the identifier is being used or not 
		final Set<String> identifiers = new HashSet<String>();

		    StringBuilder builder = new StringBuilder();
		    while(builder.toString().length() == 0) {
		        int length = rand.nextInt(5)+5;
		        for(int i = 0; i < length; i++)
		            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
		        if(identifiers.contains(builder.toString()))
		            builder = new StringBuilder();
		     
		    }  
		    //System.out.println(builder.toString());
		    //System.out.println(builder.toString()+"@"+builder.toString()+".com"); 
		    return builder.toString()+"@"+builder.toString()+".com";
	}
	public long getRandomPhone() {
		// TODO Auto-generated method stub
		final String lexicon = "0123456789";

		final java.util.Random rand = new java.util.Random();

		// consider using a Map<String,Boolean> to say whether the identifier is being used or not 
		final Set<String> identifiers = new HashSet<String>();

		    StringBuilder builder = new StringBuilder();
		    while(builder.toString().length() == 0) {
		        int length = rand.nextInt(5)+8;
		        for(int i = 0; i < length; i++)
		            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
		        if(identifiers.contains(builder.toString()))
		            builder = new StringBuilder();
		     
		    }  
		    //System.out.println(Long.parseLong(builder.toString()));
		    return Long.parseLong(builder.toString());

	}
	public static void main(String[] args){
		
		Person p = new Person();
		for (int i=0;i<100;i++){
			p.getRandomPhone();
		}
	}
	
	
}
