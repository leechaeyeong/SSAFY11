
public class Array9Directions {
//directions : 사방탐색, 팔방탐색에 위치값을 적용하는 개념
	public static void main(String[] args) {
		int arr [][] = { {1,2,3}
						,{4,5,6}
						,{7,8,9}};
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1-1][1]);
//		System.out.println(arr[1+1][1]);
//		System.out.println(arr[1][1-1]);
//		System.out.println(arr[1][1+1]);
		//int [] pointY = {-1,1,0,0};
		//int [] pointX = {0,0,-1,1};
		//String [] pointStr = {"상 : ","하 : ","좌 : ","우 : "};
		String [] pointStr = {"상전 : ","상 : ","상후 : "
				,"하전 : ","하 : ","하후 : ","좌 : ","우 : "};
		int [] pointY = {-1,-1,-1, 1,1,1, 0,0};
		int [] pointX = {-1,0,1,  -1,0,1, -1,1};
//		System.out.println(arr[1+pointY[0]][1+pointX[0]]);
//		System.out.println(arr[1+pointY[1]][1+pointX[1]]);
//		System.out.println(arr[1+pointY[2]][1+pointX[2]]);
//		System.out.println(arr[1+pointY[3]][1+pointX[3]]);
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.println("현재 위치 : " + arr[a][b]);
				int y = 0, x=0;
				for(int c=0; c<pointX.length; c++){
					y = a + pointY[c];
					x = a + pointX[c];
					if(y<0 || x<0
						|| y>=arr.length || x>=arr.length)continue;
					System.out.println(pointStr[c] + arr[y][x]);
				}//for
			}//for
		}//for
	}//main

}
