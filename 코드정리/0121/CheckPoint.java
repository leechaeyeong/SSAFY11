package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int tall = scan.nextInt();
		int weight = scan.nextInt();
		int overWeight = weight + 100 - tall;
		System.out.println("비만수치는 "+overWeight+"입니다.");
		if(overWeight > 0) {
			System.out.println("당신은 비만이군요.");
		}

	}

}
