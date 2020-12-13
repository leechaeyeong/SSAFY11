/*
 * Static Initializer
 * - class load 시에 최초 1회성으로 돌아가는 코드를 배치할 수 있음.
 * - class load 시에 동작.
 * - 생성자는 객체 만들때만다 동작.
 * - Static Initializer는 class load 시에 최초 한번만 동작.
 */
class InitializerTest {
	static int a = 0;
	static {//Static Initializer
		System.out.println("static run~~~");
		a = 999;
	}
}
public class Static4Initializer {

	public static void main(String[] args) {
		InitializerTest it = new InitializerTest();
		System.out.println(it.a);
		InitializerTest it2 = new InitializerTest();
		InitializerTest it3 = new InitializerTest();
	}

}
