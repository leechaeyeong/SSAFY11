/*
 * static 영역은 하나만 만들어져서 공유된다.
 * instance에 종속되어 있지 않다.
 */
class OnlyOne {
	int intVar;
	static int staticIntVar;
	public OnlyOne() {
		System.out.println("intVar : "+intVar+", staticIntVar : "+staticIntVar);
		intVar++;
		staticIntVar++;
	}
}
public class Static2OnlyOne {
	public static void main(String[] args) {
		OnlyOne oo = new OnlyOne();
		System.out.println(oo.intVar + " : " + oo.staticIntVar);
		OnlyOne oo2 = new OnlyOne();
		System.out.println(oo2.intVar + " : " + oo2.staticIntVar);
		OnlyOne oo3 = new OnlyOne();
		System.out.println(oo3.intVar + " : " + oo3.staticIntVar);
	}

}
