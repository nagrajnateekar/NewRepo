package com.demo;

public class IntegerSum {

	public static void main(String[] args) {
		
		int number=23445,rem,sum=0,sum1=0,rem1;
		 while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number =number/10;
			
		 } 
		 while(sum>0) {
			 rem1=sum%10;
			 sum1=sum1+rem1;
			 sum=sum/10;
		 }
	
		 System.out.println(sum1);
		
	} 

}
