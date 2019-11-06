package com.class10;

public class TastAnotherway {

	public static void main(String[] args) {

		String [] countries= {"Afghanistan","Australia","USA",};
		
		for(int i=0; i<countries.length; i++) {
			switch(countries[i]) {
			case"Afghanistan":
				System.out.println("Kabul");
				break;
			case"Australia":
				System.out.println("Canberra");
				break;
			case"USA":
				System.out.println("Washington D.C");
				break;
			}
		}
	}

}
