package first;

public class AccessCallSameFolder {

	public static void main(String[] args) {
		AccessModifierTest amt = new AccessModifierTest();
		System.out.println(amt.publicInt);
		System.out.println(amt.protectedInt);
		System.out.println(amt.defaultInt);
		//System.out.println(amt.privateInt);
		//private은 <선언된 class> 밖에서는 인식이 안됨.
		System.out.println(amt.toString());
	}

}
