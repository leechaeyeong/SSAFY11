/*
 * pass by value : 데이터를 전달 할 때, data value를 복사하여 전달.
 * - primitive data type.
 * pass by reference : 데이터를 전달 할 때, 주소 value를 복사하여 전달.
 * - reference data type.
 */
class RefObj {
	String str = "first string...";
}
public class PassBy {

	public static void main(String[] args) {
		RefObj obj1 = new RefObj();
		System.out.println(obj1.str);
		passByRef(obj1);
		System.out.println(obj1.str);
		int i = 777;
		passByVal(i);
		System.out.println(i);
		i = passByVal2(i);
		System.out.println(i);
	}
	public static void passByRef(RefObj obj) {
		obj.str = "string by passByRef...";
	}
	public static void passByVal(int a) {
		a = 9999999;
	}
	public static int passByVal2(int a) {
		a = 999999;
		return a;
	}
}
