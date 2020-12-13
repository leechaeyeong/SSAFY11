package com.ssafy.java;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		
		int n = 0;
		
		while(true) {
			int r = (int) (Math.random() * 45) +1;
			
			boolean flag = true;

			if(n==0) {
				arr[n] = r;
				n++;
			}
			
			else if(n>0) {
				for(int i=0; i<n; i++) {
					if(arr[i] == r) {
						flag = false;
						break;
					}
				}
				if(flag == true) {
					arr[n] = r;
					n++;
				}			
			}
			
			if(n==6)
				break;
		}
		System.out.println("오늘의 행운의 숫자!!!");
		for(int i=0; i<6; i++)
			System.out.print(arr[i] + " ");
	}
}