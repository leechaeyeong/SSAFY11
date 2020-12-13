

public class Var3StringEquals {

	public static void main(String[] args) {
		String s1 = new String("hi");
		String s2 = new String("hi");
		System.out.println(s1 == s2);
		System.out.println(s1 != s2);
		System.out.println(s1.equals(s2));
	}

}
