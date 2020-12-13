import java.util.Scanner;

public class P4Jump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase=0, arrSzY=0, arrSzX=0, cntPlayer=0;
		testCase = scan.nextInt();
		for(int tc=0; tc<testCase; tc++) {
			arrSzY = scan.nextInt()+1;
			arrSzX = scan.nextInt()+1;
			cntPlayer = scan.nextInt();
			int [][] arr = new int[arrSzY][arrSzX];
			int [][] player = new int[cntPlayer][3];
			//숫자판 입력
			for(int a=1; a<arrSzY; a++) {
				for(int b=1; b<arrSzX; b++) {
					arr[a][b] = scan.nextInt();
				}
			}//for
			//플레이어 정보 입력
			for(int c=0; c<player.length; c++) {
				for(int d=0; d<player[c].length; d++) {
					player[c][d] = scan.nextInt();
					//System.out.println("player[c][d] : " + player[c][d]);
				}
			}//for
			//함정 입력
			int cntHam = scan.nextInt();
			int hamY = 0, hamX = 0;
			for(int e=0; e<cntHam; e++) {
				hamY = scan.nextInt();
				hamX = scan.nextInt();
				arr[hamY][hamX] = 0;
			}//for
			//확인용
			for(int a=1; a<arrSzY; a++) {
				for(int b=1; b<arrSzX; b++) {
					System.out.print(arr[a][b] + " ");
				}
				System.out.println();
			}//for
			for(int c=0; c<player.length; c++) {
				for(int d=0; d<player[c].length; d++) {
					System.out.print(player[c][d] + " ");
				}
				System.out.println();
			}//for
			System.out.println("confirm end =======");
			//확인용 end
			int y=0, x=0, times=0, reward = 0;
			for(int c=0; c<player.length; c++) {
				reward = reward - 1000;
				y=player[c][0];
				x=player[c][1];
				times=player[c][2];
				int where = 0, howmuch = 0;
				for(int g=0; g<times; g++) {
					if(arr[y][x] == 0) break;
					where = arr[y][x] / 10;
					howmuch = arr[y][x] % 10;
					if(where == 4) {//up
						y = y - howmuch;
					} else if(where == 2) {//down
						y = y + howmuch;
					} else if(where == 1) {//right
						x = x + howmuch;
					} else if(where == 3) {//left
						x = x - howmuch;
					}
					if(y<1 || x<1 || y>arrSzY || x>arrSzX
							|| arr[y][x] == 0) {//fail
						break;
					} else if(g == times-1) {//상금 계산
						reward = reward + (arr[y][x] * 100);
						//System.out.println("player1 win : " + arr[y][x] * 100);
					}
				}// for g
			}//for c
			System.out.println("#"+(tc+1)+" "+reward);
		}//for tc
	}//main

}
