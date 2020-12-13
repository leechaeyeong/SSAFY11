package member;

public class MemberMgrTest {

	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		mgr.add(new Member("ȫ�浿", 16, "no@no.com"));
		mgr.add(new MainMember("����ġ", 16, "no2@no2.com"));
		
		Member m = mgr.getMember("ȫ�浿");
		if(m != null) {
			System.out.println(m);
		}
	}

}
