package com.yuva;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		Integer[] array = {5, 2, 6, 9, 3, 7, 8};
		Arrays.sort(array);
		System.out.println("Sorted Array in ascending order :" +Arrays.toString(array));
		
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Sorted Array in decending order :" +Arrays.toString(array));
		
	}
}
