package com.class7;

import java.util.Scanner;
public class ScannerAndLoop {

	public static void main(String[] args) {
/*ask user to enter name 5 times
 * and our output should be "good afternoon __ " */
		Scanner sc=new Scanner(System.in);
		
		int i=5;
		while (i<=5) {
			
			System.out.println("Please enter your name");
			String name=sc.nextLine();
			System.out.println("Good afternoon "+ name);
			i++;
		}
		
		
		
	}

}
