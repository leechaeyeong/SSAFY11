
public class InnerClass4Local {
	private int number = 777;
	private static int number2 = 999;

	public void outerM(int aaa) {
		int bbb=111;
		class LocalInner {
			//bbb = 222;//error - LocalInner를 감싼 메소드의 변수는 상수로 인식.
			public void name() {
				System.out.println(aaa);
				System.out.println(bbb);
				System.out.println(number);
				System.out.println(number2);
			}
		}//class
		new LocalInner().name();
	}

	public static void main(String[] args) {
		InnerClass4Local out = new InnerClass4Local();
		out.outerM(789);

	}

}
