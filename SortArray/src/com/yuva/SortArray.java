package com.yuva;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		Integer[] array = {5, 2, 6, 9, 3, 7, 8};
//		Arrays.sort(array);
//		System.out.println("Sorted Array in ascending order :" +Arrays.toString(array));
//		
//		Arrays.sort(array, Collections.reverseOrder());
//		System.out.println("Sorted Array in decending order :" +Arrays.toString(array));
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array ");
		for(int num : array) {
			System.out.print(num + " ");
		}
		
	}
}
