package com.yuva;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "Clint Eastwood";
		String str2 = "Old West action";

		if (areAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}

	private static boolean areAnagram(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		if (str1.length() != str2.length()) {
			return false;
		}
		
		return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
	}
}

/**
	Listen and Silent
	
	Triangle and Integral
	
	Dormitory and Dirty room
	
	The eyes and They see
	
	The Morse Code and Here come dots
	
	Clint Eastwood and Old West action
	
	Schoolmaster and The classroom
	
	Astronomer and Moon starer
	
	A decimal point and I’m a dot in place
	
	Conversation and Voices rant on

**/