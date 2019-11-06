package com.class5;
import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		
		/*ask user to enter age
		 * if age is from 1 to 3 --> you are a baby
		 * if age from 3-5 --> you are a toddler
		 * if age from 5-12 --> you are a kid
		 * if age from 12-19 --> teenager
		 * if age >20 --> you are an adult
		 */
 System.out.println("what is your age?");
 Scanner sc=new Scanner(System.in);
 int age=20;
 if (age<3) {
	 System.out.println("you are a baby");
 }else if (age<=5) {
	 System.out.println("you are a toddler");
 }else if (age<=12) {
	 System.out.println("you are a kid");
 }else if (age<=19) {
	 System.out.println("you are a teenager");
 }else if (age>=20) {
	 System.out.println("you are an adult");
 }
 
	}

}
