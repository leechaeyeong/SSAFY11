/*
 * 문자열 수정
 * - replace : 특정 문자 또는 문자열을 교체함
 * - 저장하지 않은 replace 수행 값은 버려짐
 */
public class String5Replace {

	public static void main(String[] args) {
		String str1 = "nice to meet you";
		System.out.println("str1.replace('o', 'A') : " + str1.replace('o', 'A'));
		System.out.println("str1 : " + str1);
		System.out.println("str1.replace('you', 'U~~') : "
							+ str1.replace("you", "U~~"));
		System.out.println(str1.replace("e", "E"));
		System.out.println(str1.replaceAll("e", "E"));
		System.out.println(str1.replaceFirst("e", "E"));
	}

}
