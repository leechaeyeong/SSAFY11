import java.util.Scanner;

public class Main_552 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int inData = scan.nextInt();
		int inData = 3;

		for(int i=0; i<inData; i++) {

			for(int k=2; k>=0; k--) {
				System.out.print(" ");
				if(i == k) break;
			}

			for(int k=1; k<=5; k++) {
				System.out.print("*");
				if((i*2+1) == k) break;
			}
			System.out.println();
		}

		for(int i=0; i<inData; i++) {

			for(int k=0; k<=2; k++) {
				System.out.print(" ");
				if(i == k) break;
			}

			for(int k=5; k>=1; k--) {
				System.out.print("*");
				if((i*2+1) == k) break;
			}
			System.out.println();
		}

	}//main

}
