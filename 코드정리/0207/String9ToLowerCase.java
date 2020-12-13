/*
 * 문자열(String) 대소문자 변경
 * - toLowerCase : 모두 소문자로 변경
 * - toUpperCase : 모두 대문자로 변경
 * - 저장하지 않은 toLowerCase/toUpperCase 수행 값은 버려짐
 */
public class String9ToLowerCase {

	public static void main(String[] args) {
		String str1 = "Happy Birthday To You";
		System.out.println("str1.toLowerCase() : " + str1.toLowerCase());
		System.out.println("str1.toUpperCase() : " + str1.toUpperCase());
		System.out.println("str1 : " + str1);
	}

}
