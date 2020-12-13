import java.util.HashSet;
/*
 * Set : index 개념이 없음. 순서 없음.
 * - add : 특정 위치에 값을 삽입 못함.
 * - remove : 특정 위치에 값을 삭제 못함.
 */
public class Collection4Set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("hi");
		set.add("hello");
		set.add("how are you");
		set.add("i am fine");
		set.add("thanks");//add
		System.out.println("set : "+set);
		System.out.println("set.size() : "+set.size());
		HashSet<String> set2 = (HashSet<String>) set.clone();//clone
		System.out.println("set2.contains : "+set2.contains("hello"));
		set2.remove("hello");
		System.out.println("set2 : "+set2);
		set2.clear();
		System.out.println("set2.isEmpty : "+set2.isEmpty());
	}

}



