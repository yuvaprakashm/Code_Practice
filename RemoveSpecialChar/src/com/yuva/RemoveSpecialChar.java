package com.yuva;

public class RemoveSpecialChar {
	public static void main(String[] args) {
		String str = "@He#llo$Wor*l!d";
		//a - z 97 to 122 ASCII value
		//A - Z 65 to 90 ASCII value
		char[] ch  = str.toCharArray();//{'$','H'....}
		String temp = "";
		for(char c : ch) {
			int m = c;
			if((m>=97 && m<=122) || (m>=65 && m<=90)) {
				char c1 = (char)m;//H,e,l,l....
				temp = temp + c1;
			}
		}
		System.out.println(temp);
	}
}
