/*
 * final keyword : 최종 정의.
 * - final 변수 : 상수화 : 최초 대입 후에, 값 변경 불가.
 * - final 메소드 : override 불가.
 * - final class : 상속 불가.
 * - 상수(변하지 않는 수)의 naming rule : 모두 대문자, 단어가 이어질 때 _
 */
final class SuperB {}
//class ChildX extends SuperB {}//error//상속 불가
class SuperA {
	public void go() {}
	public final void go2() {}
}
class ChildZ extends SuperA {
	public void go() {System.out.println("override...");}
	//public final void go2() {}//error//override 불가
}
public class TmpFinal {

	public static void main(String[] args) {
		int intA = 7;
		intA = 999;
		final int FINAL_INT_A;
		FINAL_INT_A = 999;//최초 대입
		//FINAL_INT_A = 7;//error//값 변경 불가

	}

}
