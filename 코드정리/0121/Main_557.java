import java.util.Scanner;

public class Main_557 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String [] strArr = str.split(" ");
		for(int i=0; i<strArr.length-1; i++) {
			if((i+1)%3 == 1) {
				System.out.print(strArr[i]);
			}
		}
/*		System.out.print(strArr[0]);
		System.out.print(" ");
		System.out.print(strArr[3]);
		System.out.print(" ");
		System.out.print(strArr[6]);*/
	}

}
