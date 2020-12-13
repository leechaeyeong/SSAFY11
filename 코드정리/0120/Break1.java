
public class Break1 {

	public static void main(String[] args) {

		for(int a=2; a<10; a++) {
			for(int b=1; b<10; b++) {
				if(b > 3) break;
				System.out.println(a + "*" + b + "=" + (a * b));
			}//for
		}//for

	}//main

}
