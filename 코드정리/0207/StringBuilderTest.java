
public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("StringBuilder");
		str.append("AAA");
		System.out.println("append('AAA') = "+str);

		str.insert(0,"BBB");
		System.out.println("insert(0,'BBB') = "+str);

		str.setCharAt(0,'X');
		System.out.println("setCharAt(0,'X') = "+str);

		str.reverse();
		System.out.println("reverse() = "+str);

		str.setLength(30);
		System.out.println("setLength(30) = "+str);
	}

}
