package com.class4;

public class Recap {

	public static void main(String[] args) {

		int num = 23;
		num = 90;
		num -= 200;
        num -= 110;
        num += 220;
        
        
        if (num > 0) {
        	
        	System.out.println(num + "is a positive number");
        	
        }else if (num ==0) {
        	System.out.println("value of a num is " + num);
        }else {
        	System.out.println(num + "is a nuegative number");
        }
        
        
        
        int i =134;
        
        if (i%2==0) {
        	System.out.println(i+" is a even number");
        	}else {
        		System.out.println(i+ " is a even number");
        	}
        
        if (i%2!=0) {
        	System.out.println(i+" is an odd number");
        }else {
        	System.out.println(i+" is an even number");
        }
        
	}

}
