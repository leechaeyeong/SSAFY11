package test.pac;

import test.imprt.AccessData;

public class AccessTestDiffPackage {

	public static void main(String[] args) {
		//3. different package
		AccessData ad = new AccessData();
		System.out.println(ad.puStr);
		//System.out.println(ad.proStr);
		//System.out.println(ad.deStr);
		//protected+default : 같은 package 내부에서만 접근 가능. 다른 package에서는 접근 불가.
		//System.out.println(ad.priStr);
		//private : 같은 class 내부에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
