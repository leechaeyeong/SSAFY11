package com.ssafy.java;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[45];
		Random x = new Random();
		
		for(int i = 0; i < 45; i++) {
			a[i] = x.nextInt(45)+1;
			for(int j =0;j<i;j++) {
				
				if(a[i]==a[j])
					i--;
			}
		}
		
		for(int i = 0; i < 6
				
				; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
