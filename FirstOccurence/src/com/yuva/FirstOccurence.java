package com.yuva;

public class FirstOccurence {
	public static void main(String[] args) {
		String str = "hello world";
		char ch = 'o';
		int firstIndex = str.indexOf(ch);
		System.out.println("First occurrence of '" + ch + "': " + firstIndex);
	}
}
