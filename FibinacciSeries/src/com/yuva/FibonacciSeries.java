package com.yuva;

public class FibonacciSeries {
	public static void main(String[] args) {
		int count = 10;
		int a = 0;
		int b = 1;

		System.out.print(a);
		System.out.print(" " + b);

		for (int i = 2; i < count; i++) {

			int c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}
	}
}
