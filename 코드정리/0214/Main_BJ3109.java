import java.io.BufferedReader;
//빵집
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_BJ3109 {
	static int[] dir = {-1, 0, 1};//윗방향을 먼저 탐색.
	static char[][] map;
	static int rowCnt, colCnt, answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strMapSize = br.readLine();
		StringTokenizer strToken = new StringTokenizer(strMapSize, " ");
		rowCnt = Integer.parseInt(strToken.nextToken());
		colCnt = Integer.parseInt(strToken.nextToken());
		map = new char [rowCnt][colCnt];
		for(int a=0; a<rowCnt; a++) {
			map[a] = br.readLine().toCharArray();;
		}//입력 완료.
		for (int a = 0; a < rowCnt; a++) {
			boolean tmpBool = dfs(a, 0);
			if (tmpBool) answer++;
		}
		System.out.println(answer);
	}//main
	private static boolean dfs(int rowNo, int colNo) {
		if (colNo == colCnt - 1) return true;//끝까지 도달이면 종료.

		for (int a = 0; a < dir.length; a++) {//오른쪽 상중하 탐색.
			int newRowNo = rowNo + dir[a];
			int newColNo = colNo + 1;
			if (newRowNo >= 0 && newColNo >= 0
					&& newRowNo < rowCnt && newColNo < colCnt
					&& map[newRowNo][newColNo] == '.') {//경계값 내부+평지,
				map[newRowNo][newColNo] = 'x';
				boolean result = dfs(newRowNo, newColNo);//또 탐색.
				if (result) return true;
			}
		}//for a
		return false;
	}//dfs

}//class
