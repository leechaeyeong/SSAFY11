package swea;
/** dfs로 풀려고 각잡다가 bfs 라는 걸 깨달음
 * 파이프의 방향과 구멍의 위치를 설정하는데 있어서 계속 삽질했다 
 * 2번파이프와 3번파이프를 3번파이프를 기준으로 비교할 때 오류가 생겼다는 것을 알게 됨
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1953_탈주범검거 {
	static int n, m, r, c, l;
	static int[][] map;
	static boolean[][] visit;
	static int res;

	static int[][] pipe = { { 0 }, { 0, 1, 2, 3 }, { 0, 2 }, { 1, 3 }, { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 } };
	static Queue<pair> q;

	static class pair {
		int x;
		int y;
		int time;

		public pair(int x, int y, int time) {
			super();
			this.x = x;
			this.y = y;
			this.time = time;
		}

		@Override
		public String toString() {
			return "[x=" + x + ", y=" + y + ", time=" + time + "]";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			r = sc.nextInt();
			c = sc.nextInt();
			l = sc.nextInt();

			map = new int[n][m];
			visit = new boolean[n][m];
			q = new LinkedList<pair>();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			res = 0;
			//
			// 파이프의 방향에 따라서 4방탐색 쉽게하려면
			// 경우를 새로 맞춰주어야함!
			// 내생각엔 4방향중 해당되는 방향을 체크만 해주고
			// 1번은 1234 가능, 2번은 13가능, 그래서 1번과 2번이 가능하려면
			// 1번방향에 3번이 있다면 이동가능, 2번방향에 4번이 있다면 이동가능...

			// (r,c)에 파이프가 없을 경우는 안됨
			visit[r][c] = true;
			q.offer(new pair(r, c, 1));
			res++;
			// 탐색하기
			go();

			System.out.println("#" + tc + " " + res);

		} // end of testcase
	}// end of main

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	private static void go() {

		// 연결가능한 터널인지 확인하기,를 어케해야하지???
		// 모든 경우를 if문으로 처리해야하나..? -> pipe 배열만들기

		while (!q.isEmpty()) {
			// 현재 위치기준 사방탐색해서 연결가능하면 count하고 진행하기
			pair out = q.poll();

//			System.out.println();
//			System.out.println("큐 out : (" + out.x + "," + out.y + ",time :" + out.time + ")");

			if (out.time >= l)
				break;
			
			int pnum = map[out.x][out.y];
			for (int i = 0; i < 4; i++) {

				boolean check = false; 
				for (int j = 0; j < pipe[pnum].length; j++) {
					if (pipe[pnum][j] == i) {
						// 파이프 연결방향과 같은 파이프 구멍이 있다
						check = true;
						break;
					}
				}
				
				int xx = out.x + dx[i];
				int yy = out.y + dy[i];

				if (xx >= 0 && xx < n && yy >= 0 && yy < m && !visit[xx][yy] && map[xx][yy] != 0) {

					int nnum = map[xx][yy];
					if (check) {
						for (int j = 0; j < pipe[nnum].length; j++) {
							// next pipe와 현재위치의 방향체크
//							System.out.print(pipe[nnum][j] + ":" + i + "/");

							if (pipe[nnum][j] != i && pipe[nnum][j] % 2 == i % 2) {
								// 이동가능! => 영역 ++

								visit[xx][yy] = true;
								res++;

								q.offer(new pair(xx, yy, out.time + 1));

//								System.out.println(" 들어감 \n 현재 큐 내용");
//								System.out.println(q.toString());

								break;
							}
							// 큐 사이즈만큼 돌면 ++ 하기!
						}
					}
				}
			} // 사방탐색

		} // queue
	}
}// end of class
