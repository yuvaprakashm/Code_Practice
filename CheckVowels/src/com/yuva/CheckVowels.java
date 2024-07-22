package com.yuva;

public class CheckVowels {
	public static void main(String[] args) {
		String str = "Hello World";
		boolean hasVowels = str.matches(".*[aeiouAEIOU]*.");
		System.out.println(hasVowels);
	}
}
