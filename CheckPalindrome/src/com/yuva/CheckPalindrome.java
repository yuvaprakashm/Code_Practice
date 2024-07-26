package com.yuva;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();

		if (str.equals(reversed)) {
			System.out.println("The word -> " + str + " is Palindrome");
		} else {
			System.out.println("The word -> " + str + " Not a palindrome");
		}
	}
}
