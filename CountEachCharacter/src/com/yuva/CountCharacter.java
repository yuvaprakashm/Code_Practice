package com.yuva;

public class CountCharacter {
public static void main(String[] args) {
	String str = "yuva prakash";
	for(int i=0; i < str.length(); i++) {
		int count = 0;
		for(int j=0; j < str.length(); j++) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
		}
		System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
	}
}
}
