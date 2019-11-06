package com.class12;

public class StringMinipulationDemo2 {

	public static void main(String[] args) {
		
		/*
		 * .contains();
		 */
	String sentence="it was raining";
	String sen="raining";
	System.err.println(sentence.contains(sentence));
	
	System.out.println("was");
	//Create two Strings and initaialize them with some value.
	//implement the following methods on those strings.
	
    /*
     * sen.length();
     * sen.equals();
     * sen.contains(s);
     * sen.toUpperCase();
     * sen.toLowerCase();
     * sen.equalsIgnoreCase(anotherString);
     */
    System.out.println("-----------------------------");
	String s1="as";
			String s2="a";
	System.out.println(s1.length());
	System.out.println(s2.length());

	System.out.println(s1.equals(s2));
    System.out.println(s2.equalsIgnoreCase(s2));

	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());

	System.out.println(s1.contains(s2));
	System.out.println((s1.toLowerCase()).contains(s2.toLowerCase()));

	
	}

}
