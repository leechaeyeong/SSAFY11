
public class Student {
	String name;//이름
	String studentNumber;//학번
	private int age;//나이
	String phoneNumber;//전화번호
	//Encapsulation : 소스 코드 hiding(부정 입럭 방지 목적)
	// - 변수를 private 처리
	// - 변수에 set 메소드(data setting)와  get 메소드(data 사용)를 제공
	public void setAge(int inData) {
		if(inData > 0) {
			age = inData;
		}
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "이름 : "+name
				+" 학번 : "+studentNumber
				+" 나이 : "+age
				+" 전화번호 : "+phoneNumber;
	}
}
