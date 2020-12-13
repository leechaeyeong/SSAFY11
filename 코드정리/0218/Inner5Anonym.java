import java.util.Arrays;
import java.util.Comparator;

class ComTest implements Comparable<ComTest> {
	Integer test;
	ComTest(int i){ test = i; }
	@Override
	public int compareTo(ComTest o) {
		// TODO Auto-generated method stub
		return this.test.compareTo(o.test);
	}
	@Override
	public String toString() {
		return ""+test;
	}
}
public class Inner5Anonym {

	public static void main(String[] args) {
		ComTest [] test = {new ComTest(555), new ComTest(111), new ComTest(333)};
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		Arrays.sort(test, new Comparator<ComTest>() {
			@Override
			public int compare(ComTest o1, ComTest o2) {
				return o2.test.compareTo(o1.test);
			}
		});
		System.out.println(Arrays.toString(test));
	}

}
