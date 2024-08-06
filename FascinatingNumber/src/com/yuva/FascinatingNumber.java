package com.yuva;

public class FascinatingNumber {
	public static void main(String[] args) {
		int num = 273, n2, n3; // 192 273 327
		n2 = num * 2;
		n3 = num * 3;

		String concatStr = num + "" + n2 + n3; //273546819
		boolean found = true;
		for (char c = '1'; c <= '9'; c++) {
			int count = 0;
			for (int i = 0; i < concatStr.length(); i++) {
				char ch = concatStr.charAt(i);
				if (ch == c) {
					count++;
				}
			}
			// If any digit is missing or repeated, set found to false
			if (count != 1) {
				found = false;
				break;
			}
		}
		if (found)
			System.out.println(num + " is a fascinating number.");
		else
			System.out.println(num + " is not a fascinating number.");
	}
}
