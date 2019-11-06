package com.class13;

public class RegularExpression2 {

	public static void main(String[] args) {
String str="Today is our java class";

System.out.println(str.replace(" ", ""));
System.out.println(str.replaceAll("\\s",""));
		
String doc="Video provides a powerful way to help you"
+"prove your point.when you click online video,"
+"you can paste in the embed code for the Video you"
+"want to add. You can also type a keyword to search"
+"online for the video that best fits your document.";
doc=doc.toLowerCase();                               //when video is lowercase then  audio gets printed if its uppercase then video gets printed
System.out.println(doc.toLowerCase().replace("video","Audio"));
System.out.println(doc.replaceAll("powerful(.*)", "")); //  (.*)  means that everything after gets deleted




	}

}
