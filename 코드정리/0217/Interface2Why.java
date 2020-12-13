import java.util.Arrays;

class SortTest implements Comparable<SortTest> {
	int sortVar;
	SortTest(int a){
		sortVar = a;
	}
	@Override
	public String toString() {
		return ""+sortVar;
	}
	@Override
	public int compareTo(SortTest o) {
		return this.sortVar - o.sortVar;
	}
}
public class Interface2Why {
	public static void main(String[] args) {
		SortTest [] arr = {new SortTest(999),new SortTest(7),new SortTest(123)};
		Arrays.sort(arr);
		//Arrays.sort를 사용하고 싶으면, Comparable의 compareTo를 구현해 와라! - 구현 강제
		System.out.println(Arrays.toString(arr));
	}

}
