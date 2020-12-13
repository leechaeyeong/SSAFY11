package second;

import first.AccessModifierTest;

public class AcessCallInherit extends AccessModifierTest {

	public static void main(String[] args) {
		AcessCallInherit aci = new AcessCallInherit();
		System.out.println(aci.protectedInt);
		//System.out.println(aci.defaultInt);
		//System.out.println(aci.privateInt);
		//default와 private은 상속해도 인식이 안됨.
	}

}
