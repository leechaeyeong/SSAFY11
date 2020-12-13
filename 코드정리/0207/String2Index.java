/*
 * 문자열(String)의 길이(length) 개념과 위치(index) 개념
 * - 길이(length) 개념 : 1에서 시작 (문자, 공백, 부호 모두 포함)
 * - 위치(index) 개념 : 0에서 시작, (length -1)에서 종료
 * - length : 문자열의 길이 구하기
 * - charAt : 특정 위치(index)의 문자 구하기
 * - indexOf : 특정 문자(문자열)의 처음 위치(index) 구하기
 * - lastIndexOf : 특정 문자(문자열)의 마지막 위치(index) 구하기
 */
public class String2Index {

	public static void main(String[] args) {
		String str1 = new String("nice to meet you, too.");
		System.out.println("str1 : " + str1);
		//length
		System.out.println("str1.length() : " + str1.length());
		//charAt
		System.out.println("str1.charAt(1) : " + str1.charAt(1));
		System.out.println("str1.charAt(str1.length() - 1) : "
							+ str1.charAt(str1.length() - 1));
		//indexOf
		System.out.println("str1.indexOf('o') : " + str1.indexOf('o'));
		//lastIndexOf
		System.out.println("str1.lastIndexOf('o') : " + str1.lastIndexOf('o'));
		//indexOf
		System.out.println("str1.indexOf('to') : " + str1.indexOf("to"));
		//lastIndexOf
		System.out.println("str1.lastIndexOf('to') : " + str1.lastIndexOf("to"));
	}

}
