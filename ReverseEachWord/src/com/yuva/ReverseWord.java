package com.yuva;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
public static void main(String[] args) {
	String str = "yuva prakash";
	String reversed = Arrays.stream(str.split(" "))
			.map(word -> new StringBuilder(word).reverse().toString())
			.collect(Collectors.joining(" "));
	System.out.println(reversed);
}
}
