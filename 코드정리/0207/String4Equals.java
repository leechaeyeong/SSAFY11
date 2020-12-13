/*
 * 문자열(String) 비교
 * - compareTo(대소문자 구분하여 비교), compareToIgnoreCase(대소문자 구분 없이 비교)
 * - equals(대소문자 구분하여 비교), equalsIgnoreCase(대소문자 구분 없이 비교)
 * - 주로 equals 사용
 * - 주의!!! 객체 비교 시에 비교 연산자(==) 사용 금지!!!
 */
public class String4Equals {

	public static void main(String[] args) {
		String str1 = "nice to meet you";
		String str2 = "NICE TO MEET YOU";
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equalsIgnoreCase(str2) : "
							+ str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
	}

}
