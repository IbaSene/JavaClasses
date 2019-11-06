package com.class13;

public class Task11 {

	public static void main(String[] args) {

		
		String day="sunday";

		
			//System.out.println(day.charAt(5)+" "+day.charAt(4)+" "+ day.charAt(3)+" "+ day.charAt(2)+" "+ day.charAt(1)+" "+day.charAt(0));
		System.out.println(day.length());
		
		
		for(int i=day.length()-1; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
	
		System.out.println("   ");
		System.out.println("======================");

		String number= "hello";
		if (number.length()%2==0  ) {                          //same thing as the one bellow but a different wayish
			System.out.println("        "+number);
			
		}else {
			System.out.println(number);
		}
		String str1="Hello";
		int length=str1.length();
		int middle=str1.length()/2;
		
		
		System.out.println();
		if(str1.length()%2!=0&& str1.length()>=3) {
			System.out.println(str1.charAt(middle));
		}
}
}



