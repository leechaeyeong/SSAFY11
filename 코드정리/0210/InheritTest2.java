class Parent2 {
  protected int method(int a, int b) {
    return 0;
  }
}
class Child2 extends Parent2 {
	public int method(int a, int b)  {//override
		return 0;
	}
	int method(int a, long b)  {//overload
		return 0;
	}
}
class Child3 extends Parent2 {
//	private int method(int a, int b)  {//error
//		return 0;
//	}
}
class Child4 extends Parent2 {
//	public byte method(int a, int b)  {//error
//		return 0;
//	}
}
public class InheritTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
