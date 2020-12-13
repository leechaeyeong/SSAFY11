
public class While1 {

	public static void main(String[] args) {

		int a = 2;//초기식
		while(a < 10) {//조건식
			int b = 1;
			while(b < 10) {
				System.out.println(a + "*" + b + "=" + (a * b));
				b++;
			}
			a++;//변경식
		}

	}

}
