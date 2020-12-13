
public class InnerClass3Static {//outer class
	private int number = 777;
	private static int number2 = 999;

	public static class InstanceInner {//inner class
		static int innerNumber2 = 111;
		int innerNumber = 555;
		public void innerM() {
			//System.out.println("outer 변수 : "+number);//error
			System.out.println("outer 변수 : "+number2);
		}
		public static void name() {System.out.println("inner static method...");}
	}

	public static void main(String[] args) {
		InnerClass3Static.InstanceInner.name();
		System.out.println(InnerClass3Static.InstanceInner.innerNumber2);
		InnerClass3Static.InstanceInner inner = new InnerClass3Static.InstanceInner();
		inner.innerM();
	}

}
