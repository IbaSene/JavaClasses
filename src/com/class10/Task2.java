package com.class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		   int sumEven=0;
		    int sumOdd=0;
		    System.out.println("enter start point ");
		   Scanner sc=new Scanner(System.in);
			int input1=sc.nextInt();
		    System.out.println("enter end point");
		    int input2=sc.nextInt();
		    
		    for(int i =input1; i<=input2; i++) {
		        if(i%2==0) {
		            sumEven=sumEven+i;
		        }else { // assuming first number > second number
		            sumOdd=sumOdd+i;
		        }
		    }
		    System.out.println("sumof even numbers = "+sumEven);
		    System.out.println("sum of odd numbers = "+ sumOdd);

	}

}
