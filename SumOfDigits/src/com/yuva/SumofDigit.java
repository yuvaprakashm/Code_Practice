package com.yuva;

public class SumofDigit {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while(num != 0) {
			sum = sum + num % 10;   // Extract last digit
			num = num / 10;  //remove last digit
		}
		System.out.println(sum);
	}
}
