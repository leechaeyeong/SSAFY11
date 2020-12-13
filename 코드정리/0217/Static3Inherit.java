class StaticSuper {
	static int intVar = 111;
	public void nonStaticMethod() {System.out.println("super---non");}
	public static void staticMethod() {System.out.println("super---static");}
}
class StaticChild extends StaticSuper {
	static int intVar = 999;//부모와 따로 존재함.
	public void nonStaticMethod() {System.out.println("child---non");}
	public static void staticMethod() {System.out.println("child---static");}
	//ststic 메소드  override할 때는 static도 가져온다.
	//또 다른 ststic 메소드  만든 셈이 됨.
}
/*
 * ststic 메소드  override.
 * - override 불가.
 * - 부모의 ststic 영역과 자식의 static 영역이 모두 따로 존재함. 따로 호출해야 함.
 * - 부모ClassName.부모의ststic메소드, 자식ClassName.부모의ststic메소드.
 */
public class Static3Inherit {
	public static void main(String[] args) {
		StaticSuper s1 = new StaticChild();
		s1.nonStaticMethod();//override 적용.
		s1.staticMethod();//override 적용X.
		System.out.println(s1.intVar);
		StaticChild c1 = new StaticChild();
		c1.staticMethod();
		System.out.println(c1.intVar);
	}

}
