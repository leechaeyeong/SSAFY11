import java.util.Scanner;

public class Main_560 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int min = 0;
		for(int i=0; i<10; i++) {
			int tmpInt = scan.nextInt();
			if(i == 0) {
				min = tmpInt;
			} else {
				if(min > tmpInt) {
					min = tmpInt;
				}
			}
		}//for
		System.out.println(min);
	}

}
