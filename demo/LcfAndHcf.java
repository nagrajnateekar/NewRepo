package com.demo;

public class LcfAndHcf {

	public static void main(String[] args) {
		
		int a=15;
		int b=25;
		int c=0;
		for(int i=1;i<=25;i++) {//here for condition we can take any one number from given one 
			if(a%i==0 && b%i==0) {
				c=i;
			}
		}
		System.out.println("The HCF of two numbers is:"+c);
		System.out.println("The LCF of two numbers is:"+(15*25)/c);
		

	}

}
