package com.class12;

public class StringMinipulationDemo {

	public static void main(String[] args) {

		String str=new String();
		
		//there are two ways to create string objects
		
		//1
		
		//String Literal
		String name="Jhon";
		System.out.println(name);

System.out.println(name.length());
		
		//2
		//Creating String with new key word
		String name1=new String("John1");
		
		
		/*this method returns the length of this string.
		 * the length is equal to the number
		 * of 16- bit unicode characters in the string.
		 */
		int name1Len=name.length();
		System.out.println(name1Len);
		System.out.println("The length of name1Len is ="+ name1Len);
		
		String str1="Hellow world";
		System.out.println("Before:: "+str1);
		str1= str1.toLowerCase();
		System.out.println("After:: "+str1);
		
		//.equals()
		String str2="Hello world";
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		//.equalsIgnoreCase();
       //toUpperCase();
		//this method does not care for capitalization 
		//and compare the content only
		System.out.println(str1.equalsIgnoreCase(str2));	
	
	/*
	 * toUppercase();
	 *this method converts all of the characters 
	 *in this string to uppercase
	 */
	
	String str3="mohammad";
	System.out.println("Before:: " +str3);
	str3=str3.toUpperCase();
	System.out.println("After:: "+str3);
	}

}
