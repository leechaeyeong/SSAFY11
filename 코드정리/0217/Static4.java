/*
 * Static Initializer
 * - class load 시에 최초 1회성으로 돌아가는 코드를 배치할 수 있음.
 * - class load 시에 동작.
 * - 생성자는 객체 만들때마다 동작.
 * - Static Initializer는 class load 시에 최초 한번만 동작.
 */
public class Static4 {
	{
		int aaa = 777;//지역변수
	}//영역 선언이 가능.
	int bbb = 888;
	static int memVar = 999;
	static {
		System.out.println("static 영역 정의...");
		//System.out.println(aaa);//error
		//System.out.println(bbb);//error - bbb는 메모리를 받지 못함.
		System.out.println(memVar);
		//static area는 static 선언된 멤버 변수와 멤버 메소드만 접근 가능.
	}
	public static void main(String[] args) {
		Static4 s4;//객체 생성 안했으나, class load 되며 실행됨.

	}

}
