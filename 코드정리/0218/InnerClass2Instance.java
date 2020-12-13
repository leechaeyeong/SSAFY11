/*
 * instance inner class
 * - static 선언이 불가.
 */
public class InnerClass2Instance {//outer class
	private int number = 777;
	private static int number2 = 999;

	public class InstanceInner {//inner class
		//static int innerNumber2 = 111;//error
		int innerNumber = 555;
		public void innerM() {
			System.out.println("outer 변수 : "+number);
			System.out.println("outer 변수 : "+number2);
		}
		//public static void name() {}//error
	}

	public static void main(String[] args) {
		InnerClass2Instance ic2 = new InnerClass2Instance();
		InnerClass2Instance.InstanceInner ic2inner
			= ic2.new InstanceInner();
		ic2inner.innerM();
		System.out.println(ic2inner.innerNumber);
	}

}



