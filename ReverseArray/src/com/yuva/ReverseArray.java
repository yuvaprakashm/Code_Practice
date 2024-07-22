package com.yuva;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 30, 40, 50 };
		reverse(arr);
	}

	private static void reverse(Integer[] arr) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));

	}
}
