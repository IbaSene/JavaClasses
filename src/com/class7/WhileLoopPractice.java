package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
// how to print numbers from 1 to 20
		int i = 1;

		while (i <= 20) {
			System.out.println(i);
			i++;
		}

		// i want to print numbers from 10 to 30 all in 1 line
		int y = 10;
		while (y <= 30) {
			System.out.println(y);
			y++;

			// how to print values 10 to 1;
			int a = 10;

			while (a >= 1) {
				System.out.println(a);
				a--;

			}
			// print values from 50 to 20
			int b = 50;
			while (b >= 20) {
				System.out.println(b);
				b--;

			}
			System.out.println("-----------------");
//i want to print all even numbers from 1 to 20 
			// 1 way- increment value by 2
			int z = 2;
			while (z <= 20) {
				System.out.println(z);
				z += 2;
			}

			// 2 way using modulus
			int q= 2;

			while (q<=20) {
				if (q%2==0) {
					System.out.println(q);
				}
				q++;
			}
			System.out.println("**********************************");
			//print only odd numbers from 50 to 100
			// print only even numbers from 100 to 1
			int f=49;
			while (f<=100) {
				System.out.println(".");
				f+=2;
				System.out.println(f);
			}
			System.out.println("*******************************************************");
			int w=1;
			while (w<=100) {
				System.out.println(".");
       w+=2;
       System.out.println(w);
			}
		}

	}

}
