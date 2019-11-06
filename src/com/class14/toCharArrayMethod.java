package com.class14;

public class toCharArrayMethod {

	public static void main(String[] args) {

		String str="Syntax";
		
		/*
		 * .toCharArray 
		 * this method converts this string to a new character array.
		 */
		
		str.toCharArray();
		System.out.println(str.toCharArray());
		
		char[] array= str.toCharArray();
		
		for(char i:array) {
			System.out.println(i);
		}

		char b='w';
		char c='a';
		System.out.println(b+c);
	}

}
