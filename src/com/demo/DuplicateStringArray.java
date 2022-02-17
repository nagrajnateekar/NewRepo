package com.demo;

public class DuplicateStringArray {

	public static void main(String[] args) {
		
		String s[]= {"aa","bb","cc","aa","cc","dd","bb"};
		System.out.println("Duplicate strings are:");
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j]) {
					System.out.print(s[i]+" ");
				}
			}
		}

	}

}
