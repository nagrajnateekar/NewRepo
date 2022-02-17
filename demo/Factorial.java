package com.demo;

public class Factorial {

	public static void main(String[] args) {
		//1*2*3*4*5*6=720
		int number=6;
		int fact=1;
		for(int i=1;i<=6;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of 6 is:"+fact);

	}

}
