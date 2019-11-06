package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {

		int [] nums=new int[5];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
//to find # of elements we use .length
		System.out.println(nums.length);
		System.out.println(nums [0]);
		                  //0       1        2          3
		String[] array= {"Winter", "Fall", "Summer","Spring"};
		//i was born in summer
		System.out.println("i was born in " +array[2]);
	   int arraySize=array.length;
	   System.out.println(arraySize);
	}

}
