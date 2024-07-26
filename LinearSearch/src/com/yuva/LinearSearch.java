//searching algorithm to check whether the element is present in the array
//finding location of element


package com.yuva;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int a[] = { 10, 5, 11, 55, 44, 23 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key : ");
		int key = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println("Found at " + i);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Element Not Found");
		}
	}
}
