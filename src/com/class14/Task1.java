package com.class14;

public class Task1 {

	public static void main(String[] args) {

		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	
		String str="     Today is java class!!!!!";
		System.out.println(str.trim().replaceAll(" "," "));
	
	System.out.println("============");

 //Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.

	String b="et;km292490gj24!#%#Rbwrgwr";
	String c=b.replaceAll("^A-Z", "");
	System.out.println(c);
	char [] array=c.toCharArray();
	System.out.println(array.length);
	
	System.out.println("==================");

	//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
	
	String g="Is it saturday? Is it raining? Do we have a Java Class today?";
	String[] array2 = g.split(" ");

	for (int f = 12; f < array2.length; f++) {
		System.out.println(f); 
	}
	}

}
