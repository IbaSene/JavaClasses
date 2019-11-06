package com.class11;

public class TwoArraysDemo2 {

	public static void main(String[] args) {

 		String [] [] names= {
 				{"Khan","yousuf","Alex","zynab"},
 				{"mohammad","ann","Naslyhan","weqas"},
 				{"Diago","Asif","Zubair","Shogofa"},

 		};
 		
 		
 		int lengthOfRows=names.length;
 		System.out.println(lengthOfRows);
 		
 		int lengthOfCols=names[1].length;
 		System.out.println(lengthOfCols);
	
	for(String getArrays[]: names) {
		for (String getName: getArrays) {
			System.out.println(getName+" ");
		}
		System.out.println();
	}
	}

}
