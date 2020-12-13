class StaticP {
	int intVar = 777;
	static int intVar2 = 111;
	public static void staticM() {System.out.println("부모 메소드");}
}
class StaticChild extends StaticP {
	int intVar = 999;//부모와 같은 이름의 변수 선언 가능. 오버라이드는 아님.
	static int intVar2 = 222;//static도 마찬가지. 서로 완전히 다른 변수가 됨.
	public static void staticM() {System.out.println("자식 메소드");}
	//static 메소드도 오버라이드 불가. 서로 완전히 다른 메소드가 됨.
}
public class Static3 {
	public static void main(String[] args) {
		StaticChild c = new StaticChild();
		System.out.println("자식 타입의 변수 : "+c.intVar);
		StaticP p = new StaticChild();
		System.out.println("부모 타입의 변수 : "+p.intVar);
		System.out.println("=======================");
		System.out.println("자식 타입의 변수 : "+c.intVar2);
		System.out.println("자식 타입의 변수 : "+p.intVar2);
		System.out.println("=======================");
		c.staticM();
		p.staticM();
	}

}
