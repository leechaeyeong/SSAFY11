
public class Oper5 {

	public static void main(String[] args) {
		//short circuit logic
		//�� �� �� ���� ���� ����� ��ü ��� ���� �Ǹ�, ���� ���� ������� ����.
		String s = null;
		//System.out.println(s.length());
		if(s != null && s.length() > 0) {
			System.out.println("hi");
		}
		System.out.println("end");
		if(s == null || s.length() <= 0) {
			System.out.println("null");
		}
		System.out.println("end");
	}

}
