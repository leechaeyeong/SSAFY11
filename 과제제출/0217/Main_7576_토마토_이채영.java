package ssafy_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_7576_토마토 {
	public static int[][] tomato;
	public static int M;
	public static int N;
	public static int day = 0;

	// 큐 사용 하기..
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();

		tomato = new int[M][N];
		for (int i = 0; i < tomato.length; i++) {
			for (int j = 0; j < tomato[i].length; j++) {
				tomato[i][j] = scan.nextInt();
			}
		}

		Queue<Integer> xtom = new LinkedList<Integer>();
		Queue<Integer> ytom = new LinkedList<Integer>();
		Queue<Integer> day = new LinkedList<Integer>();

		for (int i = 0; i < tomato.length; i++) { // 첫 번째
			for (int j = 0; j < tomato[i].length; j++) {
				if (tomato[i][j] == 1) {
					xtom.offer(i);
					ytom.offer(j);
					day.offer(0);

				}
			}
		}
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		int dayres=0;
		while (!xtom.isEmpty()) {

			int x = xtom.poll();
			int y = ytom.poll();
			int d = day.poll();
			
			
			for (int k = 0; k < dy.length; k++) { // 사방 탐색
				if (x + dx[k] >= 0 && x + dx[k] < M && y + dy[k] >= 0 && y + dy[k] < N) {
					if (tomato[x + dx[k]][y + dy[k]] == 0) {
						tomato[x + dx[k]][y + dy[k]] = 1;
						xtom.offer(x + dx[k]);
						ytom.offer(y + dy[k]);
						
						day.offer(d+1);//??
						dayres = d+1;
					}
				}
			}
		}
		for (int i = 0; i < tomato.length; i++) {
			for (int j = 0; j < tomato[i].length; j++) {
				if(tomato[i][j]==0)
				{
					dayres=-1;
					
				}
			}
		}
		System.out.println(dayres);
//출력
//		for (int i = 0; i < tomato.length; i++) {
//			for (int j = 0; j < tomato[i].length; j++) {
//				System.out.print(tomato[i][j]+" ");
//			}
//			System.out.println();
//		}

	}// end of main
}// end of class
