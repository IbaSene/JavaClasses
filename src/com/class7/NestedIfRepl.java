package com.class7;

import java.util.Scanner;

public class NestedIfRepl {

	public static void main(String[] args) {
	     
	    //Initialize an object for Scanner class, condition is if object is greater than 400 create a nested if condition to see if object is less than or equal to 600. 
		//If object is less than or equal to 600 have output say "don't calculate commission", if object is greater than or equal to 600 then have output say "Value is too large". For anything
		//less than the value of 400 in the first condition please print "calculate commission".

      		Scanner sc=new Scanner(System.in);
int num;
System.out.println("Please enter a number");
 num=sc.nextInt();
 
 if(num>400){
   
   System.out.println("calculate commission");
   
         if(num<=600){
     System.out.println("don't calculate commission");
     
}else{
     
   }
}else{
    
           if (num>=600){
     System.out.println("Value is too large");
     
}else{
     
     
   }
 }
 
 
}
}