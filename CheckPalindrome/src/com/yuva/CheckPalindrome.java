package com.yuva;

public class CheckPalindrome {	
	public static void main(String[] args) {
		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();
		boolean isPalindrome = str.equals(reversed);
		System.out.println(str + " is a palindrome: " + isPalindrome);
	}
}	
 