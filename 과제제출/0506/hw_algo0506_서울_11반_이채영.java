package baekjoon;

import java.util.Scanner;

public class Main_6987_¿ùµåÄÅ {
	static int[] win;
	static int[] draw;
	static int[] lose;
	static boolean pass;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 4;
		for (int tc = 1; tc <= T; tc++) {
			win = new int[6];
			draw = new int[6];
			lose = new int[6];
			pass = false;

			int wsum = 0;
			int dsum = 0;
			int lsum = 0;

			for (int i = 0; i < 6; i++) {
				wsum += win[i] = sc.nextInt();
				dsum += draw[i] = sc.nextInt();
				lsum += lose[i] = sc.nextInt();
			}
			//
			if (wsum + dsum + lsum != 30) {
				pass = false;
			} else {
				game(0);
			}

			if (pass)
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");

		} // end of testcase
	}// end of main

	static int[] t1 = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4 };
	static int[] t2 = { 1, 2, 3, 4, 5, 2, 3, 4, 5, 3, 4, 5, 4, 5, 5 };

	private static void game(int cnt) {
		if (cnt == 15) {
			pass = true;
			return;
		}
		
		int a = t1[cnt];
		int b = t2[cnt];

		if (win[a] > 0 && lose[b] > 0) {
			win[a]--;
			lose[b]--;

			game(cnt + 1);

			win[a]++;
			lose[b]++;
		}
		if (lose[a] > 0 && win[b] > 0) {
			lose[a]--;
			win[b]--;

			game(cnt + 1);

			lose[a]++;
			win[b]++;
		}
		if (draw[a] > 0 && draw[b] > 0) {
			draw[a]--;
			draw[b]--;

			game(cnt + 1);

			draw[a]++;
			draw[b]++;
		}

	}
}// end of class
