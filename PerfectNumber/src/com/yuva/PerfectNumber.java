package com.yuva;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				temp = temp + i;
			}
		}
		if(num == temp) {
			System.out.println(temp+" is a perfect number");
		}
		else
		{
			System.out.println(temp+" is not a perfect number");
		}
	}
}
