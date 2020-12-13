import java.util.TreeSet;
class TreeSetTestObject implements Comparable<TreeSetTestObject> {
	Integer testNum;
	TreeSetTestObject(int i){ testNum = i; }
	@Override
	public int compareTo(TreeSetTestObject o) {
		return this.testNum.compareTo(o.testNum);
	}
	@Override
	public String toString() {
		return ""+testNum;
	}
}
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<TreeSetTestObject> ts3 = new TreeSet<TreeSetTestObject>();
		ts3.add(new TreeSetTestObject(555));ts3.add(new TreeSetTestObject(999));
		ts3.add(new TreeSetTestObject(111));ts3.add(new TreeSetTestObject(888));
		System.out.println(ts3);
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(555);ts1.add(999);ts1.add(111);ts1.add(222);ts1.add(888);
//		Integer tmp = 444;//참고
		System.out.println(ts1);
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("hi");ts2.add("hello");ts2.add("bye");ts2.add("go");
		System.out.println(ts2);
	}

}
