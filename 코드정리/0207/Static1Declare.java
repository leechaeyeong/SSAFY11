/*
 * 자바에서 메모리를 확보하는 방법 : static, new.
 * - static 영역 : ClassLoader가 class를 메모리에 올릴때,
 *                static 선언 부분은 먼저 메모리를 할당함.
 * - new : 메모리에 객체를 올리라고 JVM에게 내리는 명령.
 * - static : ClassName.static변수명/static메소드명.
 * - non-static : new를 통해 생성된 객체참조변수.변수명/메소드명
 * - static 영역은 하나만 만들어져서 공유된다.
 */
public class Static1Declare {
	public int nonVar = 777;
	public static int sVar = 999;
	public void nonMethod() {}
	public static void staticMethod() {System.out.println("s~~~");}
	public static void main(String[] args) {
		Static1Declare.sVar = 12345;
		//Static1Declare.nonVar = 11111;//error
		Static1Declare.staticMethod();
		//Static1Declare.nonMethod();//error
		Static1Declare ddd = new Static1Declare();
		System.out.println(ddd.sVar);
		System.out.println(ddd.nonVar);
		ddd.nonMethod();
		ddd.staticMethod();
		Static1Declare ddd2 = new Static1Declare();
		ddd2.sVar = 98765;
		System.out.println("ddd2에서 sVar 변경 후 : "+ddd.sVar);
		//static 영역은 하나만 만들어져서 공유된다.
	}

}



