
public class Var2 {

	public static void main(String[] args) {
		byte b1 = -128;
		byte b2 = 127;
		System.out.println(b1);
		System.out.println(b2);
		byte b3 = (byte) 128;//demotion, ������ casting
		byte b4 = (byte) -129;
		System.out.println(b3);
		System.out.println(b4);
		int i = b2;//auto casting, promotion, ������ casting
		System.out.println(i);
	}

}
