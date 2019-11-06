package com.class9;

public class Pattern {

	public static void main(String[] args) {

		
		//*****
		//*****
		//*****
		//*****

		for (int i=1; i<=4; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
 for (int i=0; i<10; i++) { //rows
	 for (int y=0; y<10; y++) { //Columns
		 System.out.print("*");
	 }
System.out.println();
 }
 System.out.println("-----------------------");
 //123456789
 //123456789
 //123456789
 //123456789
 //123456789
 //123456789
 for (int i=1; i<=6; i++) {
	 for (int j=1; j<=9; j++) {
		 System.out.print(j);
	 }
	 System.out.println();
 }
 System.out.println("------------------");
 //54321
 //54321
 //54321
 //54321
 //54321
 
 for (int i=5; i>=1; i--) {
	 for (int j=5; j>=1; j--) {
		 System.out.print(j);
	 }
	 System.out.println();
 }
 System.out.println("____________________________");
 /*55555
  * 44444
  *33333
  *22222
  *11111
  */
 for (int i=5; i>0; i--) {
	 for (int j=1; j<=5; j++ ) {
		 System.out.print(i);
	 }
	 System.out.println();
 }
 System.out.println("------------------");
 
 for(int i=1; i<=5; i++) {
	 for (int j=1; j<=i; j++) {
		 System.out.print("*");
	 }
	 System.out.println();
 }
 System.out.println("---------------------");
 
 for (int i=1; i<=9; i++) {
	 for (int j=1; j<=i; j++) {
		 System.out.print(j);
	 }
	 System.out.println();
 }
	}

}
