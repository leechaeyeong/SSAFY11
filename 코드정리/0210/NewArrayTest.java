
public class NewArrayTest {

	public static void main(String[] args) {
		Object arr4 = new double[3];
		//배열은 객체, Object는 모든 객체의 Super class.

		//int[][] arr3 = new int[3] {4,5,6};//error
		//int[][] arr3 = new int[3][] {4,5,6};//error
		//int[][] arr3 = new int[][] {4,5,6};//error
		int[] arr3 = new int[] {4,5,6};
		for(int a : arr3) {
			System.out.println(a);
		}
	}

}
