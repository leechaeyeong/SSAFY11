package com.ssafy.java;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		int arr[] = new int[101];
		
		for(int i =0;i <10; i ++) {
			arr[i] = scan.nextInt();
		}*/
		
		int arr[] = {34,23,64,25,12,75,22,88,53,37};
		
		print(arr);
		total(arr);
		average(arr);
		minmun(arr);
	}
	
	public static void print(int arr[]) {
		for(int i =0;i <10; i ++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void total(int arr[]) {
		int sum = 0;
		for(int i =0;i <10; i ++) {
			sum += arr[i];
		}
		System.out.println("배열의 합 : "+sum);
	}
	
	public static void average(int arr[]) {
		int sum = 0;
		for(int i =0;i <10; i ++) {
			sum += arr[i];
		}
		System.out.println("배열의 평균 : "+sum/10);
	}
	
	public static void minmun(int arr[]) {
		int min = 10000;
		for(int i =0;i <10; i ++) {
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println("배열의 최소값 : "+min);
	}
}
