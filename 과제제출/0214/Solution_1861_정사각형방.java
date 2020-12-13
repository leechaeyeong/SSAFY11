import java.util.Scanner;

class Solution_1861_정사각형방 {
	//사방탐색
	static int [] dx = {-1,1,0,0};
	static int [] dy = {0,0,-1,1};
	
	static int [][]  room;
	static int num;

	public static void main(String args[]) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int tc = 0; tc < T; tc++) 
		{
			
			int N = scan.nextInt();
			room = new int [N][N];
			
			for(int i=0; i < room.length; i++) {
				for(int j=0; j < room[i].length; j++) {
					 room[i][j] = scan.nextInt();
				}
			}
			
			//
			int sroom = 1;
			int count = 1;
			for(int i=0; i < room.length; i++) 
			{
				for(int j=0; j< room[i].length; j++) 
				{
					num = 1;
					find(i, j, N);
					if(num > count || (num == count && sroom>room[i][j]) ) 
					{
						sroom =  room[i][j];
						count = num;
					}
				}
			}
			System.out.println("#"+(tc+1)+" "+sroom+" "+count);
		}//end of testcase
	}//end of main
	
	public static void find(int a, int b, int n) 
	{
		for(int i=0; i < dx.length; i++) 
		{
			int x = a + dx[i];
			int y = b + dy[i];
			
			if(x < n && y < n && x >=0 && y >=0 &&  room[x][y] ==room[a][b]+1) 
			{
				find(x, y, n);
				num++;
				
			}
		}
	}//end of find
	
}//end of class
