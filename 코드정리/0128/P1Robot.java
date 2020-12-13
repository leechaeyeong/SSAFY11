import java.util.Scanner;

public class P1Robot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int arrSize = 0;
		char [][] arr = null;
		for(int tc=0; tc<testCase; tc++) {
			arrSize = scan.nextInt();
			arr = new char[arrSize][arrSize];
			//입력부
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					arr[a][b] = scan.next().charAt(0);
					//System.out.print(arr[a][b]);
				}//for b
				//System.out.println();
			}//for a
			//계산부
			int answer = 0;
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					if(arr[a][b] == 'A') {
						for(int c=b+1; c<arr[a].length; c++) {//오른쪽 검사
							if(arr[a][c] == 'S') {
								++answer;
							} else if(arr[a][c] == 'W' || arr[a][c] == 'A'
									|| arr[a][c] == 'B' || arr[a][c] == 'C') {
								break;
							}
						}//for c
					} else if(arr[a][b] == 'B') {
						for(int c=b+1; c<arr[a].length; c++) {//오른쪽 검사
							if(arr[a][c] == 'S') {
								++answer;
							} else if(arr[a][c] == 'W' || arr[a][c] == 'A'
									|| arr[a][c] == 'B' || arr[a][c] == 'C') {
								break;
							}
						}//for c
						for(int d=b-1; d>=0; d--) {//왼쪽 검사
							if(arr[a][d] == 'S') {
								++answer;
							} else if(arr[a][d] == 'W' || arr[a][d] == 'A'
									|| arr[a][d] == 'B' || arr[a][d] == 'C') {
								break;
							}
						}//for d
					} else if(arr[a][b] == 'C') {
						for(int c=b+1; c<arr[a].length; c++) {//오른쪽 검사
							if(arr[a][c] == 'S') {
								++answer;
							} else if(arr[a][c] == 'W' || arr[a][c] == 'A'
									|| arr[a][c] == 'B' || arr[a][c] == 'C') {
								break;
							}
						}//for c
						for(int d=b-1; d>=0; d--) {//왼쪽 검사
							if(arr[a][d] == 'S') {
								++answer;
							} else if(arr[a][d] == 'W' || arr[a][d] == 'A'
									|| arr[a][d] == 'B' || arr[a][d] == 'C') {
								break;
							}
						}//for d
						for(int up=a-1; up>=0; up--) {//위쪽 검사
							if(arr[up][b] == 'S') {
								++answer;
							} else if(arr[up][b] == 'W' || arr[up][b] == 'A'
									|| arr[up][b] == 'B' || arr[up][b] == 'C') {
								break;
							}
						}//for up
						for(int dn=a+1; dn<arr[a].length; dn++) {//위쪽 검사
							if(arr[dn][b] == 'S') {
								++answer;
							} else if(arr[dn][b] == 'W' || arr[dn][b] == 'A'
									|| arr[dn][b] == 'B' || arr[dn][b] == 'C') {
								break;
							}
						}//for up
					}
				}//for b
			}//for a
			System.out.println("#" + (tc+1) + " " + answer);
		}//for testCase

	}//main

}
