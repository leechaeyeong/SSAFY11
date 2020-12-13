class Inter implements Interface1Declare {
	@Override
	public void name() {}
}

public class Interface1Test {

	public static void main(String[] args) {
		Inter i = new Inter();
		//i.normalMemVar = 123;//error - interface 내부 변수는 모두 상수.
		//i.normalSMemVar = 123;//error - interface 내부 변수는 모두 상수.
		//i.SAGAK = 123;//error - interface 내부 변수는 모두 상수.
		//Interface1Declare i1d = new Interface1Declare();//error - 객체 생성 불가.

	}

}
