package com.class11;

public class task1 {

	public static void main(String[] args) {
		  
	String[] Cars = {"bmw", "jeep", "mustang", "kia", "toyota" , "lambo" };



		  for (int e=0; e<Cars.length; e++) {
		  	
		  	System.out.print(Cars[e]+ " ");
		  	
		  	
		    String [] cars= {"BMW", "mazda", "volvo","Ford","nissan","Tesla"};
	        for (int i=0; i<cars.length; i++) {
	            System.out.println(cars[i]);
	        }
	            System.out.println("--------------------");
		  }
		//  	Create an array on integers and calculate the sum of all elements in an array.
	
		  	int[] num = {1,2,3,4,5,6,7,8,9,};
		  	int sum=0;
		  	for(int j=0; j<num.length; j++) {
		  		sum = sum+num[j];
		  		
		  	}
		  		System.out.println(sum);
		  	System.out.println("-----------------");
		  	
		  	// 	Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
		  	
		  	String [] country= {"britan","usa","ukraine"};
		  	for (String c:country) {
		  		switch(c) {
		  		case "britan":
		  			System.out.println("london");
		  		break;
		  		case"usa":
		  		
		  			System.out.println("washington d.c.");
		  		break;
		  		case"ukraine":
		  			System.out.println("kyiv");
		  			break;
		  			default:
		  				System.out.println("Unknown");
		  		
		  		}
		  		
		  	}
	        }
		  }
	

	


