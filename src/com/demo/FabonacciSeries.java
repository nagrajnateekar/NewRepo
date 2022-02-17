package com.demo;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int num1=1;
		int num2=1;
		int sum=0;
		System.out.print(num1+","+num2+",");
		for(int i=1;i<7;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(num2+",");
		}
		

	}

}
