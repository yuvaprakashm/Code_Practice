package com.yuva;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 12345;
		int reverse = 0;

		while (num != 0) {
			int digit = num % 10; //Extract the last digit
			reverse = reverse * 10 + digit;
			num = num / 10;  //Remove the last digit

		}
		System.out.println(reverse);
	}
}
