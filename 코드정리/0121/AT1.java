
public class AT1 {

	public static void main(String[] args) {

		char ch = 'A';
		for(int y=1; y<=5; y++) {
			for(int x=1; x<=5; x++) {
				System.out.print(ch++);
				if(y == x) break;
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
