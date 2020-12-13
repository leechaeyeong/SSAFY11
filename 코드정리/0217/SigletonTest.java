class Num {
	private static Num num = new Num();
	private static int number;//번호표
	private Num() {}
	public static Num getInstance() {
		return num;
	}
	public static int getNumber() {
		number++;
		return number;
	}
}
/*
 * Sigleton Design Pattern : 하나의 객체만 유지하고 싶을 때.
 * - 1. 객체를 private으로 생성.
 * - 2. 생성자를 private으로 막는다.
 * - 3. 접근 가능한 public 메소드를 정의한다.
*/
public class SigletonTest {
	public static void main(String[] args) {
		//Num n1 = new Num();//error - 생성자가 private.
		Num n2 = Num.getInstance();//번호 뽑는 기계 1.
		System.out.println(n2.getNumber());
		Num n3 = Num.getInstance();//번호 뽑는 기계 2.
		System.out.println(n3.getNumber());
		Num n4 = Num.getInstance();//번호 뽑는 기계 3.
		System.out.println(n4.getNumber());
		//번호 뽑는 기계가 아무리 많아도, 번호는 하나만 공유되어 증가된다.
	}
}
