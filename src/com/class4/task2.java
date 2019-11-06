package com.class4;
import java.util.Scanner;
public class task2 {

	
	//task 1
	public static void main(String[] args) {
	    Scanner keyboard=new Scanner (System.in);
	//	System.out.println("what amount do you need loaned?");
	//	 int loan=keyboard.nextInt();
       //    if (loan>=200000) {
        //	   System.out.println("im sorry no deal");
        	   
        //   }else {
        //	   System.out.println("we have a deal");
       //    }
	//}

//}

	    //task 2
	 //   System.out.println("what is your age?");
	//    int age=keyboard.nextInt();
	//    if (age>=18) {
	//    	System.out.println("we can give you a drivers license");
	//    }else if (age>=16) {
	//    	System.out.println("we can offer you learners permit");
	//    }else {
//	    	System.out.println("sorry your to young");
//	    }
	   
	    //task 3
	    System.out.println("what temprature is it in your city?");
	    int temp=keyboard.nextInt();
	    
	    Scanner temp1=new Scanner (System.in);
	    System.out.println("what temprature is it in fahrenheit");
	    
	    int entertemp=temp1.nextInt();
	    System.out.println("the temprature in the city of in celcius is "+ (temp-32) ); 
	    
	     
	    
	}
}