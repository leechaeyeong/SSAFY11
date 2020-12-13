package test.imprt;

public class AccessData {
	public String puStr = new String("public string...");
	protected String proStr = new String("protected string...");
	String deStr = new String("default string...");
	private String priStr = new String("private string...");
	public static void main(String[] args) {
		//1.same class
		AccessData ad = new AccessData();
		System.out.println(ad.puStr);
		System.out.println(ad.proStr);
		System.out.println(ad.deStr);
		System.out.println(ad.priStr);
	}
}
