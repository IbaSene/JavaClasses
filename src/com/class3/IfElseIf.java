package com.class3;

public class IfElseIf {

	public static void main(String [] args) {
		
		int num1=100;
		int num2=100;
		
		if (num1>num2) {
			System.out.println("Num1 is larger than num2");
		}else if (num1==num2) {
			System.out.println("Num1 is equal num2");
		} else {
			
			System.out.println("num1 is smaller than num2");
		}
		
		int day=10;
		
		if (day==1) {
			System.out.println("Today is monday. I have to go to work");
		}else if (day==2) {
			System.out.println("today is tuesday. I have SDLC class");
	 }else if (day==3) {
		System.out.println("today is wednesday. i have java review class");
	}else if (day==4) {
		System.out.println("today is thursday. I have SDLC Review class");
	}else if (day==5) {
		System.out.println("today is friday. weekendis here");
	}else if (day==6) {
		System.out.println("today is saturday. my favorite coding day");
		
	}else if (day==7) {
		System.out.println("I love spending sundays at Syntax");
		
	}else {
		System.out.println("I do not know this day");		
	 }
		
  }
}