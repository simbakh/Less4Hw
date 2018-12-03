package com.gmail.kh;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a width");
		int w = sc.nextInt();
		int h = 5;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (j % 2 != 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}
}
