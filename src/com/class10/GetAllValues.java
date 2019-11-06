package com.class10;

public class GetAllValues {

	public static void main(String[] args) {

//		String[] animals= {"cat","dog","cow","snake","elephant"};
//		//i want to print all values from an array
//		//when value is dog --> i love dogs
//		
//		for (int i=0; i<animals.length; i++) {
//	if(animals[i].contentEquals("dog")) {
//		System.out.println("I love dogs");
//	}else {
//		System.out.println(animals[i]);
//	}
//			System.out.println(animals[i]);
//		}
//		
		String[] countries= {"Afghanistan","Australia","USA",};
		
		for (int i=0; i<countries.length; i++) {
		
			
			
			if(countries[i].contentEquals("Australia")) {
				System.out.println("Canberra");
			
			}else if(countries[i].contentEquals("Afghanistan")){
			System.out.println("Kabul");
			
			}else if(countries[i].contentEquals("USA")){
					System.out.println("i have no clue");
			
			}else {
				System.out.println("This country does not exist");
			}
		}
	}

}
