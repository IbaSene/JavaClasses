package com.class11;

public class task2 {

	public static void main(String[] args) {
	//	Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array
		int [] [] numbers= {
				{ 8 , 7 , 5 , 8 },
				{1 , 5 , 6 , 4  },
				{ 3 , 6 , 8 , 0  }
		};
				for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++ ) {
				System.out.print(numbers[i] [j]+ " ");
		}
			System.out.println(" ");
		}
				//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
				//Develop a program which will identify/print the even numbers only.
				int [] [] num= {
						{1,2,3,4},
						{1,2,3,4},
						{1,2,3,4}
						
				};
				for (int even[]:num) {
					for(int getEven:even) {
						if (getEven%2==0) {
						System.out.println(getEven+" ");
					}
						System.out.println(" ");
				}
					System.out.println("----------------------");
				}
					
					//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. 
					//Print the sum of all numbers.
					int [] [] numm= {
							{ 8 , 7 , 5 , 8 },
							{1 , 5 , 6 , 4  },
							{ 3 , 6 , 8 , 0  }
					};
					int sum=0;
					for(int i=0; i<numm.length; i++) {
						for (int j=0; j<numm[i].length; j++) {
							//System.out.println(numm[i][j]+ " ");
						sum=sum+numm[i][j];
						}
						System.out.println(sum);

					}


					System.out.println("The sum of all elements in the array is "+sum);

							
	}
}
