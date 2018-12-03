package com.gmail.kh;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		int f = 0;
		if (a < 16 && a > 4) {
			for (int i = 1; i <= a; i++) {
				f = f * i;
			}
			System.out.println(f);
		} else {
			System.out.println("Wrong number");
		}
	}
}
