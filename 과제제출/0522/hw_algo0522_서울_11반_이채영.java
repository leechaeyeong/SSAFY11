

import java.util.Scanner;

public class Solution {
	static int n; // ���� ����
	static int[] weight; // �ߵ��� ����
	static int ans; // �߸� �÷����� ������ ��� ����� ��
	static boolean[] used; // �տ� �÷����� �� �����ϰ� ������ ����� �迭
	
	static int[] facto; // factorial �̸� ����ؼ� 1~9! �����صα�
	static int[] pow; // 2�� �ŵ����� �̸� ����ؼ� �����صα�
	static int totalWeight; // ��� ���� ���� �ջ��ؼ� ���� �÷��� �� ���� ������ ��ŭ���� ����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			n=sc.nextInt();
			weight = new int[n];
			used = new boolean[n];
			facto=new int[n+1];
			pow = new int[n+1];
			
			facto[0] = facto[1]= pow[0]=1;
			totalWeight = 0; // ���� �ѹ���
			
			for (int i = 0; i < n; i++) {
				weight[i]=sc.nextInt();
				facto[i+1] = facto[i]*(i+1); // facto ����
				pow[i+1] =pow[i]*2; // �ŵ�����
				totalWeight += weight[i]; // �ߵ��� �� ���� ��
			}
			ans=0;
			perm(0,0,0,totalWeight);
			System.out.println("#"+tc+" "+ans);
			
		}//end of testcase
	}//end of main
	static void perm(int idx, int leftSum, int rightSum, int remain) {
		if(remain+rightSum <= leftSum) { // ���� �߸� �� �����ʿ� ���� ���ʺ��� �ȹ��ſ�
			ans += facto[n-idx]*pow[n-idx];
			return;
		}
		if(idx==n) { // n���� �߸� �� ���ô�
			ans++; // ����� �� �ϳ� ����
			return;
		}
		for (int i = 0; i < n; i++) {
			if(!used[i]) { // �̻������ i��° �ߴ� ������!
				used[i]=true; 
				perm(idx+1,leftSum+weight[i],rightSum, remain-weight[i]);
				if(rightSum+weight[i] <= leftSum) {
					perm(idx+1, leftSum, rightSum+weight[i], remain-weight[i]);
				}
				used[i]=false;
			}
		}
	}//end of perm
}//end of class
