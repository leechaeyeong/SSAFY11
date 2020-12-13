/*
 * abstract class
 * - instance 생성이 안된다는 점을 제외하고, 일반 class와 다른 바 없음.
 * - 정상적인 변수와 메소드 선언이 모두 가능.
 * - 상속도 가능.
 * - 사용 이유 : 구현 강제.
 */
abstract class AbsExam {
	int normalMemVar = 777;
	static int normalSMemVar = 999;
	final int SAGAK = 4;
	public void nomalMethod() {}
	public abstract void name();
}
/*
 * 미완성 class 상속 받은 class도 미완성 class가 되므로,
 * 상속받은 class는 미완성 메소드를 오버라이드 해야 함.
 */
class AbsExamChild extends AbsExam {
	@Override
	public void name() {}
}
public class Abstract2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
