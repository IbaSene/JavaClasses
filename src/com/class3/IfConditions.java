package com.class3;

public class IfConditions {
 public static void main (String [] args) {
	 
	 int a=90;
	 int b=300;
	 
	 if (a>b) {
		 System.out.println("a is larger than b");
		
	 }else {
	 System.out.println("a is smaller than b");
 }

	 int expectedHours=15;
	 int actualHours=2;
	 
	 if (expectedHours>actualHours) {
		 System.out.println("you will succeed");
		 
	 }else {
		 System.out.println("please study more");
		 
	 }
	 
	 double teaPrice=4.99;
	 double allowedPrice=3.99;
	 
	 
	 //if price is more that i can afford i will not buy
	 //if orice is less or matches what i can afford then i will buy tea
	 if (allowedPrice<=teaPrice) {
		 System.out.println("i will buy tea");
		 System.out.println("and i will enjoy my tea");
	 }else {
		 System.out.println("I cannot afford , I need to study more");
		 System.out.println("i will go back to study more");
	 }
	 System.out.println("i keep writing some code");
	 System.out.println("I keep writing more code");
 }
}