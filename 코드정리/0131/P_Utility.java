
public class P_Utility {

	public static int changeXY(int direct, int pointX, int pointY, int howMany) {
		if(direct == 4) {//��
			pointX = pointX - howMany;
			return pointX;
		} else if(direct == 2) {//��
			pointX = pointX + howMany;
			return pointX;
		} else if(direct == 3) {//��
			pointY = pointY - howMany;
			return pointY;
		} else if(direct == 1) {//��
			pointY = pointY + howMany;
			return pointY;
		}
		return -1;
	}

	public static void print(char [][] arr) {
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}//for a
	}//print

	public static void print(int [][] arr) {
		for(int a=0; a<arr.length; a++) {
			for(int b=0; b<arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}//for a
	}//print

}
