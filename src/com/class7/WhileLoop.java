package com.class7;

public class WhileLoop {

	public static void main(String[] args) {

		int time=8;
		
		if (time<12) {
			System.out.println("Good morning");
		}
		System.out.println("------------------------");
		while (time<12) {
			System.out.println("Good Morning");
		time++;
		
		}
		
		
		
		
		int i=1;
		
		while(i<5) {
			System.out.println("good afternoon");
			i++;
		}
		System.out.println("Outside of while loop");
	}

}
