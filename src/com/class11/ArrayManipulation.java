package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {

		String[] actualname = { "john,", "Smith", "Alex", "Tanaz", };

		String[] Expectedname = { "john,", "Smith", "Alex", "Tanaz", };
		Arrays.parallelSort(actualname);
		System.out.println(Arrays.deepToString(actualname));
		Arrays.parallelSort(Expectedname);

		String actual = Arrays.toString(actualname);
		String expected = Arrays.deepToString(Expectedname);

		System.out.println(actual.equals(expected));

		String firstName1 = "zom";
		String firstName2 = "ali";

		String firstName3 = "ali";
		String firstName4 = "zom";

		String actl = firstName1 + firstName2;
		String expt = firstName3 + firstName4;
		System.out.println(actl);
		System.out.println(expt);
		
		
 int[] numbers= {123,34,15,66,99};

for(int i:numbers) {
    System.out.print(i+"");
}

System.out.println();
System.out.println("*******");


Arrays.sort(numbers);
for(int i:numbers) {
    System.out.print(i+" ");
}
	}

}
