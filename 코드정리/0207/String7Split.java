/*
 * 문자열(String) 자르기
 * - split : 특정 문자를 기준으로, 문자열을 잘라서, 문자열의 배열로 만듬
 */
public class String7Split {

	public static void main(String[] args) {
		String str1 = "nice to meet you";
		String strArr [] = str1.split(" ");//현 예제에서 자르는 기준은 공백
		System.out.println("strArr.length : " + strArr.length);
		System.out.println("strArr[0] : " + strArr[0]);
		System.out.println("strArr[1] : " + strArr[1]);
		System.out.println("strArr[2] : " + strArr[2]);
		System.out.println("strArr[3] : " + strArr[3]);
	}

}
