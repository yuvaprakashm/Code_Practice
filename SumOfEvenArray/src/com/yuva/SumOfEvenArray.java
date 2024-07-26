package com.yuva;

public class SumOfEvenArray {
	public static void main(String[] args) {
		int a[] = { 2, 5, 8, 6, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}

}
