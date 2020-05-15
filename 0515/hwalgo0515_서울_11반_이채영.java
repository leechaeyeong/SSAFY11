package baekjoon;

/** bfs 문제 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2636_치즈 {
	static class pair {
		int x;
		int y;

		public pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	static int r, c;
	static int[][] ch;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		ch = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ch[i][j] = sc.nextInt();
			}
		}
		//
		// 확인
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.print(ch[i][j]+" ");
//			}
//			System.out.println();
//		}

		int time = 0; // 걸린 시
		int last = 0; // 이전에 녹인 치즈의 갯수

		while (true) {
			// 외부공기만 따로 값을 바꿔줘야함! (안에 있는 0을 처리하면 안되기 때문)
			makeair();

			// 가장자리 치즈만 탐색해서 remove 큐에 넣기
			Queue<pair> remove = new LinkedList<pair>();
			int recnt = 0; // 현재 녹인 치즈 개수
			// 전체 탐색하지말고 bfs로 탐색하기 (아마 시간초과 날듯) ==> 시간초과 안남!
			for (int i = 1; i < r-1; i++) {
				for (int j = 1; j < c-1; j++) {
					if (ch[i][j] == 1) {
						boolean rech = false;
						for (int k = 0; k < dy.length; k++) {
							int xx = i + dx[k];
							int yy = j + dy[k];
							if (ch[xx][yy] == -1) {
								rech = true;
								break;
							}
						}
						if (rech) {
							remove.offer(new pair(i, j));
							recnt++; // 없어지는 치즈 개수
						}
					}
				}
			}

			// System.out.println("time : "+time+"/ recnt : "+recnt); // 출력확인
			time++;
			// 큐에 넣었던 값들을 모두 지우기
			while (!remove.isEmpty()) {
				pair out = remove.poll();
				ch[out.x][out.y] = -1;
			}
			if (recnt == 0) { // 탈출
				break;
			}
			// 이전에 지웠던 값을 기억하고 있어야하고
			last = recnt;
		}
		System.out.println(time - 1);
		System.out.println(last);

	}// end of main

	private static void makeair() { // bfs 개념 -> 덩어리 주변을 모두 -1로 바꾸기!

		boolean outvisit[][] = new boolean[r][c];
		outvisit[0][0] = true;

		Queue<pair> outxy = new LinkedList<>();
		outxy.offer(new pair(0, 0));

		while (!outxy.isEmpty()) {

			pair out = outxy.poll();
			ch[out.x][out.y] = -1;

			for (int i = 0; i < 4; i++) {
				int xx = out.x + dx[i];
				int yy = out.y + dy[i];

				if (xx >= 0 && xx < r && yy >= 0 && yy < c && ch[xx][yy] <= 0 && !outvisit[xx][yy]) {
					outxy.offer(new pair(xx, yy));
					outvisit[xx][yy] = true;
				}
			}
		}
	}
}// end of class
