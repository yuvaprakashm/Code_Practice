package com.yuva;

public class CheckVowels {
	public static void main(String[] args) {
		String str = "sky";
 
		if(str.matches(".*[aeiouAEIOU].*")) 
		{
			System.out.println("The word -> " + str + "  -- contains vowels");
		}
		else 
		{
				System.out.println("The word -> " + str + " --  not contains vowels");	
		}
	}

}