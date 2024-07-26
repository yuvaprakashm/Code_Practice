package com.yuva;

public class CheckPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		String reversed = "";
//		String reversed = new StringBuilder(str).reverse().toString();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		if (str.equals(reversed)) {
			System.out.println("The word -> " + str + " is Palindrome");
		} else {
			System.out.println("The word -> " + str + " Not a palindrome");
		}
	}
}
