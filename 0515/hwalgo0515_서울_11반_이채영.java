package baekjoon;

/** bfs ���� */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2636_ġ�� {
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
		// Ȯ��
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.print(ch[i][j]+" ");
//			}
//			System.out.println();
//		}

		int time = 0; // �ɸ� ��
		int last = 0; // ������ ���� ġ���� ����

		while (true) {
			// �ܺΰ��⸸ ���� ���� �ٲ������! (�ȿ� �ִ� 0�� ó���ϸ� �ȵǱ� ����)
			makeair();

			// �����ڸ� ġ� Ž���ؼ� remove ť�� �ֱ�
			Queue<pair> remove = new LinkedList<pair>();
			int recnt = 0; // ���� ���� ġ�� ����
			// ��ü Ž���������� bfs�� Ž���ϱ� (�Ƹ� �ð��ʰ� ����) ==> �ð��ʰ� �ȳ�!
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
							recnt++; // �������� ġ�� ����
						}
					}
				}
			}

			// System.out.println("time : "+time+"/ recnt : "+recnt); // ���Ȯ��
			time++;
			// ť�� �־��� ������ ��� �����
			while (!remove.isEmpty()) {
				pair out = remove.poll();
				ch[out.x][out.y] = -1;
			}
			if (recnt == 0) { // Ż��
				break;
			}
			// ������ ������ ���� ����ϰ� �־���ϰ�
			last = recnt;
		}
		System.out.println(time - 1);
		System.out.println(last);

	}// end of main

	private static void makeair() { // bfs ���� -> ��� �ֺ��� ��� -1�� �ٲٱ�!

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
