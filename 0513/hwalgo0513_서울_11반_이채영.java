package baekjoon;
/** �������� */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2252_�ټ���� { //  �ٽ�Ǯ��
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}// �Է� ���� �迭 ����
		

		int[] cnt = new int[n+1]; // sec ���� ����
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int fir =Integer.parseInt(st.nextToken());
			int sec = Integer.parseInt(st.nextToken());
			
			list.get(fir).add(sec);
			cnt[sec]++; // 
			
		}
		// �Է� Ȯ��
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(i+"-");
//			for (int j = 0; j < list.get(i).size(); j++) {
//				System.out.print(list.get(i).get(j)+ " ");
//			}
//			System.out.println();
//		}
		// ť�� �ֱ� (cnt�� 0�� ��)
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < cnt.length; i++) {
			if(cnt[i]==0)
				q.offer(i);
		}
		// ť Ȯ��
		//System.out.println("ť : "+q);
		// ť�� ���� ����
		ArrayList<Integer> order = new ArrayList<Integer>(); // ��� �ֱ�
		while(!q.isEmpty()) {
			int out = q.poll();
			order.add(out);
			for (int i = 0; i < list.get(out).size(); i++) {
				int index = list.get(out).get(i);
				// ���� ��Ű��
				cnt[index]--;
				// 0�̸� ť�� �ֱ�
				if(cnt[index]==0) {
					q.offer(index);
				}
			}
		}
		// ���
		//System.out.println("order : "+order);
		for (int i = 0; i < order.size(); i++) {
			System.out.print(order.get(i)+" ");
		}

	}// end of main
}// end of class
