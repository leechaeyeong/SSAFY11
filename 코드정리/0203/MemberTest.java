
public class MemberTest {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name="펭수";
		//stu1.age=-1;//오류 데이터 입력
		stu1.setAge(-1);
		System.out.println(stu1.getAge());
		System.out.println(stu1.toString());
	}

}
