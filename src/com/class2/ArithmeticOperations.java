package com.class2;

public class ArithmeticOperations {
/*
 * declare 2 variables and initialize them
 * perform addition, subtraction, multiplication and division
 */
	
	
	public static void main(String [] args) {
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		
		System.out.println(num1+num2);   //30
		System.out.println(num1-num2);   //10
		System.out.println(num1*num2);   //200
		System.out.println(num1/num2);   //2
		
		// how can we print value of num1 and num 2 together
		
		System.out.println(num1+num2);
		
		
		int sum=num1+num2; // Then it would make the sum 30
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		// the addition of 2 numbers is __
		System.out.println("Adding "+sum );
		System.out.println("Subtracted "+sub );
		System.out.println("Multiplied "+mult );
		System.out.println("Divided "+div );

		//String Adding="The sum is ";
		//String Subtract="The minus is ";
		//String Multiply="The multiplication is ";
		//String Divide="The division is ";

	}
	
}
