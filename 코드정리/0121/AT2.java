
public class AT2 {

	public static void main(String[] args) {

		char ch2 = 'A';
		for(int y=1; y<=5; y++) {
			for(int x=5; x>=1; x--) {
				System.out.print(" ");
				if(y == x) break;
				System.out.print(" ");
			}
			for(int x=1; x<=5; x++) {
				System.out.print(ch2++);
				if(y == x) break;
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
