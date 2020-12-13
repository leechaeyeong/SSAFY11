package com.java.first;

import java.util.Scanner;

public class Compute {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		System.out.println("곱="+(firstNum * secondNum));
		System.out.println("몫="+(firstNum / secondNum));

	}

}
