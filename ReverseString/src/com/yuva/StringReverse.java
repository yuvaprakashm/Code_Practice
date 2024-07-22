package com.yuva;

public class StringReverse {
	public static void main(String[] args) {
		String str = "yuva";
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
	}
}
