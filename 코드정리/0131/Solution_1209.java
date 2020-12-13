import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution_1209 {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("C:/input.txt"));
		Scanner scan = new Scanner(System.in);
		int testCase = 10;
		for(int tc = 1; tc <= testCase; tc++) {

			int [][] arr = new int [100][100];
			int [] sumGaro = new int [100];
			int [] sumSero = new int [100];
			int abRight=0, abLeft=0, max=0;
			int tcNo = scan.nextInt();
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					arr[a][b] = scan.nextInt();
					sumGaro[a] = sumGaro[a] + arr[a][b];
					sumSero[b] = sumSero[b] + arr[a][b];
					if(a == b) abRight = abRight + arr[a][b];
					if(b == arr[a].length-1-a) {
						abLeft = abLeft + arr[a][b];
					}
				}//for
			}//for
			Arrays.sort(sumGaro);
			Arrays.sort(sumSero);
			max = sumGaro[99];
			if(sumSero[99] > max) max = sumSero[99];
			if(abRight > max) max = abRight;
			if(abLeft > max) max = abLeft;
			System.out.println("#"+tc+" "+max);

		}//for tc
	}//main
}//class
/*
4 4 3 2 1
2 2 1 6 5
3 5 4 6 7
4 2 5 9 7
8 1 9 5 6
*/