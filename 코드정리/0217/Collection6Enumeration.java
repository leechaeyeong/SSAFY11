import java.util.Enumeration;
import java.util.Vector;

public class Collection6Enumeration {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,3);
		v.add("hi");
		v.add("hello");
		v.add("how are you");
		v.add("i am fine");
		v.add("thanks");//add
		Enumeration<String> enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}
