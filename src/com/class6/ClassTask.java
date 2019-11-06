package com.class6;
import java.util.Scanner; 
public class ClassTask {

	public static void main(String[] args) {

		Scanner Scan=new Scanner(System.in);
		System.out.println("Write the month you were born");
		String month=Scan.nextLine();
		String Season;

		
		
		if (month.contentEquals("january") || month.contentEquals("febuary") || month.contentEquals("December")) {
			Season="Winter";
		}
		else if (month.contentEquals("March")  || month.contentEquals("April") || month.contentEquals("May")) {
			
			Season=" spring";
			
		}else if (month.contentEquals("june")  || month.contentEquals("july") || month.contentEquals("august")) {
			
			Season="summer";
		}else if (month.contentEquals("september")  || month.contentEquals("october") || month.contentEquals("november")) {
			
			Season=" Fall";
		}else {
			month = "unknown";
		}
		System.out.println("you were born in " + Season);
		System.out.println(month);
	}

}
