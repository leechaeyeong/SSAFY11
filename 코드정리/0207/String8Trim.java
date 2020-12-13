/*
 * 문자열(String) 공백 제거
 * - trim : 문자열의 맨 좌측과 맨 우측의 공백을 제거 (문자열 사이의 공백은 제거 불가)
 * - 저장하지 않은 trim 수행 값은 버려짐
 */
public class String8Trim {

	public static void main(String[] args) {
		String id = "       java119       ";
		String searchWord = "       java       top       ";
		System.out.println("id.trim() : " + "["+id.trim()+"]");
		System.out.println("searchWord.trim() : " + "["+searchWord.trim()+"]");
		String id2 = "java119";
		System.out.println("id.equals(id2) : " + id.equals(id2));
		System.out.println("id.trim().equals(id2) : " + id.trim().equals(id2));
		System.out.println("id : " + "["+id+"]");
		System.out.println("searchWord : " + "["+searchWord+"]");
		System.out.println("searchWord.replace(' ', '') : "
							+ searchWord.replace(" ", ""));
	}

}
