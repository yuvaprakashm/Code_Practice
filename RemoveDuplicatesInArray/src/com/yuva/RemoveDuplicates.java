package com.yuva;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 2, 1, 3, 5 };
//		LinkedHashSet<Integer> set = new LinkedHashSet<>();
//		for (int num : array) {
//			set.add(num);
//		}
//		Iterator<Integer> itr = set.iterator();
//		while (itr.hasNext()) {
//			System.out.print(itr.next());
//		}
		HashSet<Integer> seen = new HashSet<>();
		System.out.println("Duplicate elements :");
		for (int num : array) {
			if (!seen.add(num)) {
				System.out.print(num);
			}
		}
	}
}
