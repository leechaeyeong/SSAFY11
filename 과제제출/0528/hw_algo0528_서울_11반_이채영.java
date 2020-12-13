package swea;
/** dfs�� Ǯ���� ����ٰ� bfs ��� �� ������
 * �������� ����� ������ ��ġ�� �����ϴµ� �־ ��� �����ߴ� 
 * 2���������� 3���������� 3���������� �������� ���� �� ������ ����ٴ� ���� �˰� ��
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1953_Ż�ֹ��˰� {
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
			// �������� ���⿡ ���� 4��Ž�� �����Ϸ���
			// ��츦 ���� �����־����!
			// �������� 4������ �ش�Ǵ� ������ üũ�� ���ְ�
			// 1���� 1234 ����, 2���� 13����, �׷��� 1���� 2���� �����Ϸ���
			// 1�����⿡ 3���� �ִٸ� �̵�����, 2�����⿡ 4���� �ִٸ� �̵�����...

			// (r,c)�� �������� ���� ���� �ȵ�
			visit[r][c] = true;
			q.offer(new pair(r, c, 1));
			res++;
			// Ž���ϱ�
			go();

			System.out.println("#" + tc + " " + res);

		} // end of testcase
	}// end of main

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	private static void go() {

		// ���ᰡ���� �ͳ����� Ȯ���ϱ�,�� �����ؾ�����???
		// ��� ��츦 if������ ó���ؾ��ϳ�..? -> pipe �迭�����

		while (!q.isEmpty()) {
			// ���� ��ġ���� ���Ž���ؼ� ���ᰡ���ϸ� count�ϰ� �����ϱ�
			pair out = q.poll();

//			System.out.println();
//			System.out.println("ť out : (" + out.x + "," + out.y + ",time :" + out.time + ")");

			if (out.time >= l)
				break;
			
			int pnum = map[out.x][out.y];
			for (int i = 0; i < 4; i++) {

				boolean check = false; 
				for (int j = 0; j < pipe[pnum].length; j++) {
					if (pipe[pnum][j] == i) {
						// ������ �������� ���� ������ ������ �ִ�
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
							// next pipe�� ������ġ�� ����üũ
//							System.out.print(pipe[nnum][j] + ":" + i + "/");

							if (pipe[nnum][j] != i && pipe[nnum][j] % 2 == i % 2) {
								// �̵�����! => ���� ++

								visit[xx][yy] = true;
								res++;

								q.offer(new pair(xx, yy, out.time + 1));

//								System.out.println(" �� \n ���� ť ����");
//								System.out.println(q.toString());

								break;
							}
							// ť �����ŭ ���� ++ �ϱ�!
						}
					}
				}
			} // ���Ž��

		} // queue
	}
}// end of class
