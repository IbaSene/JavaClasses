package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
	 
		boolean b1=!true;
		boolean b2=!false;
		
		System.out.println(b1);
        System.out.println(b2);
	
     boolean traffic = false;
     
     if (!traffic) {
    	 System.out.println("On time");
     }else {
    	 System.out.println("Late");
     
     
     
     boolean isRain=false;
     if (!isRain) {
    	 
     
     System.out.println("Take an umbrella?");
	
     
       } else {
    	   System.out.println("do not take an umbrella");
       }
	}
     
     int num1 =10;
     int num2 =11;
     
     if (num1==num2) {
    	 System.out.println("Numbers are equal");
     }else {
    	 System.out.println("numbers are not equal");
    	 
     }
     if (!(num1==num2)) {
    	 System.out.println("numbers are NOT equal");
     } else {
    	 System.out.println("Numbers are equal");
     }
     
     String name="mary";
     String name2="anna";
     
     if (!(name.equals("mary") || name.equals("anna"))) {
    	 System.out.println("you are not my sister");
     }else {
    	 System.out.println("You are my sister");
     }
     
     
     
}
}