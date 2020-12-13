import java.util.Scanner;
import java.io.FileInputStream;

class Solution_1258 {
	static int size_arr;
	static int [][] arr;
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("C:/input.txt"));
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();
		for(int tc = 1; tc <= testCase; tc++) {

			size_arr = scan.nextInt();
			arr = new int [size_arr][size_arr];
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					arr[a][b] = scan.nextInt();
				}
			}
//			AlgoUtil.print(arr);
			int [][] answer = new int [20][];
			int answerCnt = 0;
			for(int a=0; a<arr.length; a++) {
				for(int b=0; b<arr[a].length; b++) {
					if(arr[a][b] != 0) {
						int [] tmpArr = new int [3];
						int garoCnt = 1;
						int seroCnt = 1;
						for(int c=b+1; c<size_arr; c++) {
							if(arr[a][c] == 0) break;
							++garoCnt;
							arr[a][c] = 0;
						}//for c
						for(int d=a+1; d<size_arr; d++) {
							if(arr[d][b] == 0) break;
							++seroCnt;
							arr[d][b] = 0;
						}//for d
						for(int e=a; e<a+seroCnt; e++) {
							for(int f=b; f<b+garoCnt; f++) {
								arr[e][f] = 0;
							}//for f
						}//for e
//						System.out.println("=============");
//						AlgoUtil.printTab(arr);
//						System.out.println("=============");
						tmpArr[0]=seroCnt;
						tmpArr[1]=garoCnt;
						tmpArr[2]=garoCnt*seroCnt;
						answer[answerCnt++] = tmpArr;
					}//if
				}//for b
			}//for a
			for(int g=0; g<answerCnt; g++) {
				for(int h=g+1; h<answerCnt; h++) {
					if(answer[g][2]>answer[h][2]
						|| (answer[g][2]==answer[h][2]
								&& answer[g][0]>answer[h][0])) {
						int [] sort = answer[g];
						answer[g] = answer[h];
						answer[h] = sort;
					}
				}
			}
			System.out.print("#"+tc+" "+answerCnt+" ");
			for(int g=0; g<answerCnt; g++) {
				System.out.print(answer[g][0]+" "+answer[g][1]+" ");
			}
			System.out.println();
		}//for tc
	}//main
}//class
/*
2
9
1 1 3 2 0 0 0 0 0
3 2 5 2 0 0 0 0 0
2 3 3 1 0 0 0 0 0
0 0 0 0 4 5 5 3 1
1 2 5 0 3 6 4 2 1
2 3 6 0 2 1 1 4 2
0 0 0 0 4 2 3 1 1
0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0
4
1 2 0 0
0 0 0 0
9 4 2 0
1 7 3 0
*/
