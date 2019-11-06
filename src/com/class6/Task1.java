package com.class6;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
  /*ask user to enter boolean value for sale
   * is no sale --> i am not shopping
   * if sale --> check the price of the item
   * based on the amount we will have to calculate the price after discount
   * if price < 20 --> apply 10%
   * if between 20-100 --> 20%
   * if between 100-500--> 30%
   * anything --> 50% 
   * 
   *  after discount __ the price of the item reduce from __ to __
   */
		
	Scanner sc= new Scanner (System.in);	
		boolean sale = sc.hasNextBoolean();
		
		int price =45;
		int price2 =0;
		int discount= 0;
		if (!sale) {
			System.out.println("i am not shopping");
			
		}else {
			if (price <20) {
				discount = 10;
				price2 = price - (price*10/100);
			}else if (price >=20&& price <100) {
				price2 = price - (price*20/100);
				discount = 20;
			}else if (price >=100 && price <500) {
				price2 = price - (price*30/100);
				discount = 30;
		} else {
			discount = 50;
			price2= price -(price*50/100);
		}
		System.out.println("After discount %" + discount + "the price of the item reduce total");
	}
	}
}
