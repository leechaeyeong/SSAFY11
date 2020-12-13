
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("nice to meet you");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		String str1 = "nice to meet you";
		str1.substring(6, 14);
		System.out.println(str1);
		str1 = str1.substring(6, 14);
		System.out.println(str1);
	}

}
