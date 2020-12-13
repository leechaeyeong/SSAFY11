
public class WrapperString {

	public static void main(String[] args) {
		int a = 345;

		Integer in = new Integer(a);
		Integer in2 = a;

		a = in.intValue();
		a = in2;
		System.out.println(a);

		String st = in.toString();
		st = new Integer(a).toString();
		st = String.valueOf(a);
		st = a + "";
		System.out.println(st);

		Integer it = Integer.valueOf(st);
		Double db = Double.valueOf(st);
		System.out.println(it);
		System.out.println(db);

		int i = Integer.parseInt(st);
		double d = Double.parseDouble("34.5");
		System.out.println(i);
		System.out.println(d);
	}

}
