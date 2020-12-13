
public class Oper1 {
	//증감연산자 ++, -- : 자신의 값을 1 증가 또는 감소
	//전위 : 증감을 먼저 수행, 후위 : 증감을 마지막에 수행
	public static void main(String[] args) {
		int a = 7, b = 7;
		System.out.println(++a);
		System.out.println(b++);
		System.out.println(a);
		System.out.println(b);
		int c = 7, d = 7;
		System.out.println(++c * 3);
		System.out.println(d++ * 3);

	}

}
