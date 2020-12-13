import java.net.InterfaceAddress;

/*
 * inner class : class 내부의 class
 * - instance inner class : 멤버 자리에 위치.
 * - static inner class : static으로 선언된 inner class. non-static 접근 불가.
 * - local inner class : 메소드 내부에 있음. 이너 클래스를 감싼 메소드가 호출 받았을 때만 메모리에 존재.
 * - anonymous inner class : 참조 변수가 없음. 일회용.
 */
public class InnerClass1OverView {
	//instance inner class
	public class InnerA {}
	protected class InnerB{}
	class InnerC{}
	private class InnerD{}
	abstract class InnerE {}
	interface InnerF {}
	interface InnerG {}
	public class InnerH extends InnerE implements InnerF, InnerG {}
	//static inner class
	static class InnerI {}
	//local inner class
	public void localMethod() {
		class InnerK {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//protected class AAA{}//error






