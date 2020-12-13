package baekjoon;
/** 위상정렬 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2252_줄세우기 { //  다시풀기
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}// 입력 받을 배열 생성
		

		int[] cnt = new int[n+1]; // sec 갯수 세기
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int fir =Integer.parseInt(st.nextToken());
			int sec = Integer.parseInt(st.nextToken());
			
			list.get(fir).add(sec);
			cnt[sec]++; // 
			
		}
		// 입력 확인
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(i+"-");
//			for (int j = 0; j < list.get(i).size(); j++) {
//				System.out.print(list.get(i).get(j)+ " ");
//			}
//			System.out.println();
//		}
		// 큐에 넣기 (cnt가 0인 것)
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < cnt.length; i++) {
			if(cnt[i]==0)
				q.offer(i);
		}
		// 큐 확인
		//System.out.println("큐 : "+q);
		// 큐가 빌때 까지
		ArrayList<Integer> order = new ArrayList<Integer>(); // 결과 넣기
		while(!q.isEmpty()) {
			int out = q.poll();
			order.add(out);
			for (int i = 0; i < list.get(out).size(); i++) {
				int index = list.get(out).get(i);
				// 감소 시키고
				cnt[index]--;
				// 0이면 큐에 넣기
				if(cnt[index]==0) {
					q.offer(index);
				}
			}
		}
		// 출력
		//System.out.println("order : "+order);
		for (int i = 0; i < order.size(); i++) {
			System.out.print(order.get(i)+" ");
		}

	}// end of main
}// end of class
