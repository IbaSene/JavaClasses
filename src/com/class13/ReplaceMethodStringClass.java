package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {

		/*.replace()
		 * This method returns a new string resulting
		 * from replacing all occurrences of oldChar
		 *  in this string with newChar
		 */
		
		
		String str="Hello Dear Dan, how are you, How you been?";
		System.out.println(str.replace('n', 'z'));
		System.out.println("==================");
		System.out.println(str.replace("Dan","Ben" ));
	System.out.println(str.replaceFirst("Dan","Ali"));
	
	
	}

}
