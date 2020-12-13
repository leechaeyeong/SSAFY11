import java.util.Scanner;

public class Main_558 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int [] iArr = new int [100];
		int roomNo = 0;
		for(int i=0; i<iArr.length; i++) {
			int tmpInt = scan.nextInt();
			if(tmpInt != 0) {
				iArr[roomNo] = tmpInt;
				roomNo++;
			} else {
				break;
			}
		}
		for(int z=roomNo-1; z>=0; z--) {
			System.out.print(iArr[z] + " ");
		}

	}

}
