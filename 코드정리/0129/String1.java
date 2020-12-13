
public class String1 {

	public static void main(String[] args) {
		String str = new String("nice to meet you ~~~");
		String str2 = new String("NICE TO MEET YOU ~~~");
		System.out.println("length : " + str.length());
		System.out.println("charAt : " + str.charAt(0));
		System.out.println("indexOf : " + str.indexOf("o mee"));
		System.out.println("lastIndexOf : " + str.lastIndexOf("e"));
		System.out.println("equals : " + str.equals(str2));
		System.out.println("equalsIgnoreCase : " + str.equalsIgnoreCase(str2));
		System.out.println("toUpperCase : " + str.toUpperCase());
		System.out.println("toLowerCase : " + str.toLowerCase());
		System.out.println("concat : " + str.concat(str2));
		System.out.println("+ : " + str+str2);
		System.out.println("str : " + str);
		System.out.println("compareTo : " + "A".compareTo("a"));
		//replace, replaceAll, subString, split, trim
	}//main
	public static boolean eqTest(String s1, String s2) {
		//equals test
		boolean rtb = true;
		if(s1.length() != s2.length()) {
			return !rtb;
		}
		for(int i=0; i<s1.length(); i++) {
			for(int k=0; k<s2.length(); k++) {
				if(s1.charAt(i) != s2.charAt(k)) {
					rtb = false;
					break;
				}
			}
		}//for
		return rtb;
	}

}
