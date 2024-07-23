package com.yuva;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		// array must be sorted order
		int a[] = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key element :");
		int key = sc.nextInt();
		int lb = 0;
		int ub = a.length - 1;
		int flag = 0;
		while (lb <= ub) {
			int mid = (lb + ub) / 2;
			if (a[mid] == key) {
				System.out.println("Found At " + mid);
				flag = 1;
				break;
			} else if (a[mid] < key) {
				lb = mid + 1;
			} else {
				ub = mid - 1;
			}
		}
		if (flag == 0) {
			System.out.println("Element not found");
		}
	}
}
