package com.class12;

public class StringMinipulationDemo3 {

	public static void main(String[] args) {
	
		/*
		 * this method checks whether a String is empty or not.
		 * this method returns thrue if the given string
		 * is empty, else it returns false.
		 */
		String str="ff";
		System.out.println("Is this string empty= "+str.isEmpty());
		String str2="hello";
		System.out.println("is this string empty= "+str2.isEmpty());
		System.out.println();
		
	//    if (!str.isEmpty()) {
	//	System.out.println("This is not empty");
    //    }else{
	//	System.err.println("This is empty String");
		
		String sentence="Each day has a promise to brighten up the day,\nbut first you must";
				System.out.println(sentence);

				String str3="Hello";
		        String str4="World";
		        String str5="People";
		        
		        System.out.println(str4+" "+str3+str5);
		        
		        System.out.println(str3+" ".concat(" "+str4).concat(str5));
System.out.println("*******************");
/*
 * this method returns a copy of the string,
 * with leading and trailing whitespace omitted.
 */
String str6="How are you?";
System.out.println(str6.trim());
System.out.println("*************");
/*
 * This method returns the character located at the strings specified index
 * the string indexes start from zero
 */
String str7="We might be done early today";
System.out.println(str7.charAt(3));

System.out.println("**************************");
/*
 * This method returns the index within this string of the first occurrence of the specified character or -1
 * if the character does not occur.
 */
String str8="We might not be done early";
System.out.println(str8.indexOf('m'));
System.out.println(str8.indexOf('e',4));
	}

}
