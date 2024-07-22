package com.yuva;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "aaabbc";
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (output.indexOf(str.charAt(i)) == -1) {
				output = output + str.charAt(i);
			}
		}
		System.out.println(output);
	}
}
