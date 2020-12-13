/*
 * final : 최종 정의
 * - final 변수 : 상수
 *   상수의 변수명 선언 규칙 : 모두 대문자 + 단어이어질 때 _ 사용.
 * - 메소드 : 오버라이드 불가.
 * - class : 상속 불가.
 */
final class FinalP {}
//class FinalChild extends FinalP {}//error
class FinalP2{
	public final void finalM() {}
}
class FinalChild2 extends FinalP2 {
	//public final void finalM() {}//error
	//public void finalM() {}//error
	//public int finalM() {return 0;}//error
	public void finalM(int a) {}
}
public class FinalTest {
	final double CIRCLE_RATIO = 3.14;//선언과 대입 동시에.
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		//ft.CIRCLE_RATIO = 44.44;//error - 상수는 값 변경 불가.
		final int TEST_INT;
		TEST_INT = 777;
		//TEST_INT = 999;//error - 상수는 한번만 대입 가능.

	}

}
