import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1863 {

	static int [] wiredStu;//wiredStudent
	static int [] visited;//visitedStudent
	static int [][] case_arr;
	static int answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int studentsCnt = Integer.parseInt(st.nextToken());
		int caseCnt = Integer.parseInt(st.nextToken());
		wiredStu = new int[studentsCnt + 1];//index 0 not use.
		visited = new int[studentsCnt + 1];//index 0 not use.
		case_arr = new int[caseCnt][2];
		for (int a = 0; a < caseCnt; a++) {
			st = new StringTokenizer(br.readLine(), " ");
			case_arr[a][0] = Integer.parseInt(st.nextToken().trim());
			case_arr[a][1] = Integer.parseInt(st.nextToken().trim());
		}
		//AlgoUtil.print(case_arr);
		for(int a = 0; a < case_arr.length; a++) {
			int sameStuNo1 = findSame(case_arr[a][0]);
			int sameStuNo2 = findSame(case_arr[a][1]);
			if (sameStuNo1 == sameStuNo2) continue;
			if (visited[sameStuNo1] > visited[sameStuNo2]) {
				wiredStu[sameStuNo2] = sameStuNo1;
			} else {
				wiredStu[sameStuNo1] = sameStuNo2;
				if (visited[sameStuNo1] == visited[sameStuNo2]) {
					visited[sameStuNo2]++;
				}
			}
			System.out.println("in data : "+case_arr[a][0]+", "+case_arr[a][1]);
			AlgoUtil.print(visited);
			AlgoUtil.print(wiredStu);
			System.out.println("==========");
		}
		for (int i = 1; i <= studentsCnt; i++) {
			if (wiredStu[i] == 0) answer++;
		}
		System.out.println(answer);
	}//main
	public static int findSame(int stuNo) {
		if(wiredStu[stuNo] == 0) {
			return stuNo;
		} else {
			wiredStu[stuNo] = findSame(wiredStu[stuNo]);
			return wiredStu[stuNo];
		}
	}

}
