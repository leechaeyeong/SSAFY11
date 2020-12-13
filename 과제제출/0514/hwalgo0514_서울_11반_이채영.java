package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2468_안전영역 { // 다시 풀기
	static class pair{
		int x;
		int y;
		public pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
	static int n;
	static int[][] area;
	static boolean[][] visit;
	static int max=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		area = new int[n][n];
		
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area.length; j++) {
				area[i][j]=sc.nextInt();
				max = Math.max(area[i][j], max);
			}
		}
		// bfs || dfs
		int maxarea =0; // 안전한 최대 영역
		
		for (int k = 0; k < max; k++) { // 물의 높이 마다 찾기
			int karea =0; // 현재 최대 안전 영역
			visit = new boolean[n][n]; // 높이 마다 초기화
			// bfs
			for (int i = 0; i < area.length; i++) {
				for (int j = 0; j < area.length; j++) {
					if(!visit[i][j] && area[i][j] > k) {
						bfs(i,j,k);
						karea++;
					}
				}
			}
			maxarea = Math.max(karea, maxarea);
		}
		
		System.out.println(maxarea);
		
	}//end of main

	static Queue<pair> xy = new LinkedList<pair>();
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	private static void bfs(int i, int j, int k) {
		visit[i][j]=true;
		xy.offer(new pair(i,j));
		while(!xy.isEmpty()) {
			pair out = xy.poll();
			
			for (int l = 0; l < dy.length; l++) {
				int xx = out.x + dx[l];
				int yy = out.y + dy[l];
				
				if(xx>=0 && xx<n &&yy>=0 &&yy<n) {
					if(!visit[xx][yy] && area[xx][yy] >k) {
						xy.offer(new pair(xx,yy));
						visit[xx][yy]=true;
					}
				}
				
			}
		}
		
	}
}//end of class
