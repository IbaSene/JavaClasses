package com.class6;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {

		//break keyword breaks/exist the loop
		for (int i=0; i<10; i++) {
			if (i==7) {
				break;
			}
System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		//continue - it will skip current iteration
		
		for (int i=1; i<=5; i++) {
			
			if (i==3 || i==4) {
				continue;
				
			}
			System.out.println(i);
		}
		System.out.println("*******************");
	// i want to print nums from 1 to 20 except 5,6,7
		
		for (int a=1; a<=20; a++) {
			if (a==5 || a==6 || a==7) {
continue;		
			}
				System.out.println(a);
		
	}
		System.out.println("******************");
		
		for (int q=1; q<=50; q++) {
			if (q%3==0) {
				continue;
			}
			System.out.println("********************!!!!!");	
		}
		Scanner sc =new Scanner(System.in);
		String word;
		for(int c=1; c<=4; c++) {
			System.out.println("Do you want to apply for credit card?");
		 word=sc.nextLine();
		 if (word.contentEquals("yes")) {
			 break;
		 }
		}
	}

}
