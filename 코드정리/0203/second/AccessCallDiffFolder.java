package second;

import first.AccessModifierTest;

public class AccessCallDiffFolder {

	public static void main(String[] args) {
		AccessModifierTest amt = new AccessModifierTest();
		System.out.println(amt.publicInt);
		//System.out.println(amt.protectedInt);
		//System.out.println(amt.defaultInt);
		//protected, default는 다른 package(폴더)에서는 인식이 안됨.
		//System.out.println(amt.privateInt);
		//private은 <선언된 class> 밖에서는 인식이 안됨.
		System.out.println(amt.toString());
		//toString은 public.
	}

}
