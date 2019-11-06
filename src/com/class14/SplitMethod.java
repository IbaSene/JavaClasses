package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/*
		 * .split() This method splits this string around matches of the given regular
		 * expression.
		 */
		
		//split the following string into array of strings/work
	
		String str = "Video provides a powerful way to help you prove your point.";

		String[] array = str.split("");

		for (int i = 0; i < array.length; i++) {
			System.out.println(i); 
			// counts how many words are in the str string , so if its just syso(i) then
	        // it will print the numbers but since its array[i] it prints the words.
		}
	}

}
