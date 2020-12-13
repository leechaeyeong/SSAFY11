/*
 * 문자열 자르기
 * - substring : 툭정 위치(index)의 문자열만을 잘라 냄
 * - 저장하지 않은 substring 수행 값은 버려짐
 * - beginIdex와 endIndex를 넣으면, beginIdex 포함 + endIndex 불포함
 */
public class String6Substring {

	public static void main(String[] args) {
		String str1 = "nice to meet you";
		System.out.println("str1.substring(6) : " + str1.substring(6));
		System.out.println("str1 : " + str1);
		System.out.println("str1.substring(6, 14) : " + str1.substring(6, 14));
		//beginIdex 포함 + endIndex 불포함 : 6 ~ 13까지만 출력
	}

}
