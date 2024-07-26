package com.yuva;

public class StringReverse {
	public static void main(String[] args) {
		String str = "yuva";
		String reverse = "";
//		String reverse = new StringBuilder(str).reverse().toString();
		for(int i = 0;i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		System.out.println(reverse);
	}
}
