/*
 * interface : 특별한 class.
 * - abstract method로만 이루어진 class.
 * - 일반 메소드 선언 불가.
 * - class 대신에 interface 선언 사용.
 * - 상수 선언만 가능. (일반 변수 선언 불가.)
 * - instance 생성 불가.
 * - 사용 이유 : 구현 강제.
 * - 장점 : 다중 상속 구현.
 */
public interface Interface1Declare {
	int normalMemVar = 777;//final 없어도 상수.
	static int normalSMemVar = 999;//final 없어도 상수.
	final int SAGAK = 4;
	public void name();//abstract 없어도 모두 abstract.
	//public void nomalM() {}//error
}
