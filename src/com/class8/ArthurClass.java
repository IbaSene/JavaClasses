package com.class8;

public class ArthurClass {

	public static void main(String[] args) {

		//array2d class
		
		int [] [] array= {
				{1,2,3},
				{10,20,30}
				};
		System.out.println(array[1]);
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println(array[i][j]+ " ");
			}
			System.out.println();
			
		}
	}

}
