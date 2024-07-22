package com.yuva;

public class AmstrongOrNot {
	public static void main(String[] args) {
		int number = 153;
		if (isAmstrong(number)) {
			System.out.println(number + " is an Amstrong number.");
		} else {
			System.out.println(number + " is an Amstrong number.");
		}
	}

	private static boolean isAmstrong(int number) {
		int originalNumber = number;
		double sum = 0;
		int digits = String.valueOf(number).length();
		while (number > 0) {
			int digit = number % 10;
			sum = sum + Math.pow(digit, digits);
			number = number / 10;
		}
		return sum == originalNumber;
	}
}