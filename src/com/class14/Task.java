package com.class14;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		//write a program to check whether a given number is prime or not?
		int num =13;
        boolean prime = true;
        for(int i = 2; i <= num/2; ++i){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
			
			
			//print first 10 numbers of the Fibonacci sequence
			System.out.println("0, 1, 1, 2, 3, 5, 8, 13, 21, 34");
			//xn = xn-1 + xn-2 formula
			
            int n = 10, 
            t1 = 0, 
            t2 = 1;
            System.out.print("First " + n + " terms: ");
            for (int i = 1; i <= n; ++i) {
                System.out.print(t1 + " + ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
	}
	
	}
	


