class SuperParent {
	String testStr = "super test...";
	public SuperParent() {
		System.out.println("super super super...");
	}
	public SuperParent(String message) {
		System.out.println("super message : " + message);
	}
	void print() {
		System.out.println("parent : " + testStr);
	}
}
class SuperChild extends SuperParent {
	String testStr = "===>child test...";
	public SuperChild() {
		//super();
		super("부모 생성자를 불렀어요.!!!");
		System.out.println("run child constructor...");
		//super();//error - 부모 생성자 호출은 반드시 생성자 {} 첫줄에서.!!!
	}
	//부모타입에서 선언한 변수를 자식에서도 선언할 수 있다. 다만, 호출 우선순위는 없다.
	void print() {
		super.print();//부모 메소드 호출.
		System.out.println("child : " + super.testStr);//부모 변수 호출.
		System.out.println("child : " + testStr);
	}
}
/*
 * super : 부모 객체를 반환.(부모 객체에 접근 가능한 통로 역할.)
 * - 변수/메소드 호출 : super.변수, super.메소드.
 * - 생성자 호출 : super() : 생성자 안에서 super() 사용하면 부모의 생성자를 호출함.
 */
public class SuperKeyword {

	public static void main(String[] args) {
		//SuperChild c1 = new SuperChild();
		//System.out.println(c1.testStr);
		SuperParent p1 = new SuperChild();
		//System.out.println(p1.testStr);
		//p1.print();
	}

}
