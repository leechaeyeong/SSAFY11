import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(3,3);
		v.add("hi");
		System.out.println("size : "+v.size());
		System.out.println("capacity : "+v.capacity());
		v.add("hello");
		v.add("how are you");
		v.add("i am fine");
		System.out.println("size : "+v.size());
		System.out.println("capacity : "+v.capacity());
		v.add("thanks");//add
	}

}
