/*
 * String 선언
 * - String : 문자열을 객체로 다룰 수 있도록 java에서 제공한 class
 * - 문자열은 객체이므로 new 사용
 * - String은 Primitive Data Type처럼 편리하게 사용 가능(new 생략 가능)
 */
public class String1Declare {

	public static void main(String[] args) {
		char charVar1 = 'A';//문자
		//char charVar2 = 'AB';//문자는 반드시 한 글자//error
		//char charVar3 = "A";//문자는 반드시 작은 따옴표 사용//error
		String str1;
		str1 = new String("A");//문자열은 큰 따옴표 사용
		String str2 = new String("hi");//문자열은 객체이므로 new 사용
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		String str3 = "hello";//동시에 선언과 초기화
		String str4;
		str4 = "how are you";//선언과 초기화를 분리
		str4 = "nice to meet you";//언제든지 변수의 값을 변경 가능
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
	}

}
