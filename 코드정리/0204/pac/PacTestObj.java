package test.pac;
/*
 * package : java파일과 class파일의 폴더 위치를 지정하는 문법.
 * - 상위폴더에서 하위폴더 순으로 . 을 통해 접근하는 개념.
 * 예) test.pac : test 폴더 밑의 pac 폴더가 현재 자바 파일과 클래스 파일의 위치임을 표시.
 * - 하나의 파일에는 하나의 package 선언만이 가능.
 * - 일반적으로 소문자로 표현.
 * - 컴파일 : javacv -d . PacTestObj.java
 */

public class PacTestObj {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void print() {
		System.out.println("PacTestObj : "+message);
	}
}




