

import java.util.Scanner;

public class Solution {
	static int n; // 추의 갯수
	static int[] weight; // 추들의 무게
	static int ans; // 추를 올려놓기 가능한 모든 경우의 수
	static boolean[] used; // 앞에 올려놓은 추 제외하고 놔볼때 사용할 배열
	
	static int[] facto; // factorial 미리 계산해서 1~9! 저장해두기
	static int[] pow; // 2의 거듭제곱 미리 계산해서 저장해두기
	static int totalWeight; // 모든 추의 무게 합산해서 현재 올려둔 추 빼고 나머지 얼만큼인지 보기
	
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
			totalWeight = 0; // 추의 총무게
			
			for (int i = 0; i < n; i++) {
				weight[i]=sc.nextInt();
				facto[i+1] = facto[i]*(i+1); // facto 설정
				pow[i+1] =pow[i]*2; // 거듭제곱
				totalWeight += weight[i]; // 추들의 총 무게 합
			}
			ans=0;
			perm(0,0,0,totalWeight);
			System.out.println("#"+tc+" "+ans);
			
		}//end of testcase
	}//end of main
	static void perm(int idx, int leftSum, int rightSum, int remain) {
		if(remain+rightSum <= leftSum) { // 남은 추를 다 오른쪽에 놔도 왼쪽보다 안무거움
			ans += facto[n-idx]*pow[n-idx];
			return;
		}
		if(idx==n) { // n개의 추를 다 놔봤다
			ans++; // 경우의 수 하나 증가
			return;
		}
		for (int i = 0; i < n; i++) {
			if(!used[i]) { // 미사용중인 i번째 추다 놔보자!
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
