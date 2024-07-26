package com.yuva;

public class NumberPalindrome {
	public static void main(String[] args) {
		int num = 242;
		int copy = num;
		int rev = 0;
		while (num > 0) {
			int t = num % 10;
			rev = (rev * 10) + t;
			num = num / 10;
		}
		if (copy == rev) 
			System.out.println("palindrome");
		 else 
			System.out.println("Not palindrome");
		
	}
}
