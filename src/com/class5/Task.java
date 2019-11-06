package com.class5;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		int day=9;
		if (day==1 || day==2 || day==3 || day==4  || day==5 ) {
			System.out.println("it is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("indvalid day");
		}

		
		
		System.out.println("Enter your height");
		
		 Scanner height=new Scanner (System.in);
		 int val = height.nextInt();
		if (val<5) {
			System.out.println("you are short");
		}else if (val<=5) {
			System.out.println("you are a medium ");
		}else if (val>=6) {
			System.out.println("you are talll");
		}else {
			System.out.println("this is abnormal");
		}
		
	}

}
