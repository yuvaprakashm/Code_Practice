package com.yuva;

public class PangramString {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		allLetter(str);
	}

	private static void allLetter(String str) {
		 str = str.toLowerCase();
		 boolean allLetterPresent = true;
		 for(char ch = 'a';ch <= 'z';ch++) {
			 if(!str.contains(String.valueOf(ch))) {
				 allLetterPresent = false;
				 break;
			 }
		 }
		if(allLetterPresent)
			System.out.println("The given sentence is --> '" + str + "' : is pangram");

		else
			System.out.println("The given sentence is --> '" + str + "' : is not a pangram");
	}
}
