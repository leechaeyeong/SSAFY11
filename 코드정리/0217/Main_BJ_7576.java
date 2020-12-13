import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Tomato {
	int row, col, day;

	public Tomato(int a, int b, int c) {
		this.row = a;
		this.col = b;
		this.day = c;
	}
}
public class Main_BJ_7576 {
	static int colSize;
	static int rowSize;
	static int MAX;
	static int[][] map, visited;
	static Queue<Tomato> queue;
	private static int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		colSize = scanner.nextInt();
		rowSize = scanner.nextInt();

		map = new int[rowSize][colSize];
		visited = new int[rowSize][colSize];
		queue = new LinkedList<>();

		for (int a = 0; a < rowSize; a++) {
			for (int b = 0; b < colSize; b++) {
				map[a][b] = scanner.nextInt();
				if (map[a][b] == 1) {
					visited[a][b] = 1;
					queue.add(new Tomato(a, b, 0));
				}
			}//for b
		}//for a
		scanner.close();

		bfs();

		for (int a = 0; a < rowSize; a++) {
			for (int b = 0; b < colSize; b++) {
				if (map[a][b] == 0 && visited[a][b] == 0) {
					System.out.println(-1);
					System.exit(0);
				}
			}//for b
		}//for a
		System.out.println(MAX);
	}//main

	public static Tomato bfs() {
		Tomato queTomato = null;
		while (!queue.isEmpty()) {
			queTomato = queue.poll();
			MAX = Math.max(MAX, queTomato.day);
			for (int d = 0; d < dirs.length; d++) {
				int newRow = queTomato.row + dirs[d][0];
				int newCol = queTomato.col + dirs[d][1];
				if (newRow>=0 && newCol>=0 && newRow<rowSize && newCol<colSize
						&& map[newRow][newCol] == 0 && visited[newRow][newCol] == 0) {
					visited[newRow][newCol] = 1;
					Tomato node = new Tomato(newRow, newCol, queTomato.day + 1);
					queue.add(node);
				}
			}//for d
		}//while
		return queTomato;
	}//bfs

}//class
