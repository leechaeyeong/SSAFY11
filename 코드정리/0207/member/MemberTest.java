package member;

public class MemberTest {

	public static void main(String[] args) {
		Member m = new Member("홍길동",20,"id@email.com");
		Member m2 = new Member("홍길동",20,"id@email.com");
		if(m.equals(m2)) {
			System.out.println("내용 같다.");
		}
		System.out.println(m);//toString
	}

}
