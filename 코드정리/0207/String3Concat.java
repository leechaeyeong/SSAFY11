/*
 * 문자열(String) 이어 붙이기
 * - concat : 문자열 붙이기
 * - 저장하지 않은 concat 수행 값은 버려짐
 * - String은 Primitive Data Type처럼 편리하게 사용 가능(+ 연산 가능)
 */
public class String3Concat {

	public static void main(String[] args) {
		String str1 = new String("서울 ");
		String str2 = new String("특별시 ");
		System.out.println("str1.concat(str2) : " + str1.concat(str2));
		System.out.println("str2.concat(str1) : " + str2.concat(str1));
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		String str3 = str1.concat(str2);
		System.out.println("str3 : " + str3);
		System.out.println("+ 연산 사용 : "+"서울"+" "+"특별시"+" "+"강남구");
	}

}
