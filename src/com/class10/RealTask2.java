package com.class10;

public class RealTask2 {

	public static void main(String[] args) {

			   int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
			   for (int i = 0; i < myNumbers.length; ++i) {
			     for(int j = 0; j < myNumbers[i].length; ++j) {
			       System.out.println(myNumbers[i][j]);
			     }
			   }
			   
			   char[] grades= {'a', 'b', 'c','d','e','f'};
			   
			   int a=2;
			   System.out.println(grades[4]);
			   System.out.println(grades[a]);
			   
			   a+=2;//2+2
			   System.out.println(grades[a]);
	          a--;//3
	          System.out.println(grades[a]);
	          System.out.println("----------------");
	          
	          for(int i=0; i<grades.length; i++){
	        	System.out.println(grades[i]);  
	
	          }
	          System.out.println("-----------------");
	          String[] animals= {"cat","dog","cow","snake","elephant"};
	          int size=animals.length;
	          
	          for(int i=0; i<size; i++) {
	        	  System.out.println(animals[i]+ " ");
	          }
	        
	}

	     }
