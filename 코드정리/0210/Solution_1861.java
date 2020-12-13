import java.util.Scanner;
import java.io.FileInputStream;

class Solution_1861 {

	static int [] sero = {-1,1,0,0};
	static int [] garo = {0,0,-1,1};
	static int size_arr;
	static int [][] arr;
	static int many, answer_no, answer_many;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("C:/input.txt"));
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int tc = 1; tc <= testCase; tc++) {

			answer_no = 1;
			answer_many = 1;
			size_arr = scan.nextInt();
			arr = new int [size_arr][size_arr];
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					arr[a][b] = scan.nextInt();
				}//for
			}//for
			//AlgoUtil.print(arr);//========================
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					many = 1;
					recur(a, b);
					if(many > answer_many
						|| (many == answer_many && answer_no > arr[a][b]) ) {
						answer_no = arr[a][b];
						answer_many = many;
					}
				}//for
			}//for
			System.out.println("#"+tc+" "+answer_no+" "+answer_many);

		}//for tc
	}//main

	public static void recur(int a, int b) {
		for(int c=0; c<sero.length; c++) {
			int newX = a+sero[c];
			int newY = b+garo[c];
			if(newX>=0 && newY>=0 && newX<size_arr && newY<size_arr
					&& arr[newX][newY] == arr[a][b] + 1) {
				many++;
				recur(newX, newY);
			}
		}
	}//recur

}//class
/*
2
2
1 2
3 4
3
9 3 4
6 1 5
7 8 2
*/
