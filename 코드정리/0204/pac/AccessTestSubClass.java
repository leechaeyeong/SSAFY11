package test.pac;

import test.imprt.AccessData;

public class AccessTestSubClass extends AccessData {

	public static void main(String[] args) {
		//4. sub class
		AccessTestSubClass ad = new AccessTestSubClass();
		System.out.println(ad.puStr);
		//public : 접근 제한이 없음.
		System.out.println(ad.proStr);
		//protected : 상속을 받은 class 내부에서 접근 가능.
		//System.out.println(ad.deStr);
		//protected+default : 같은 package 내부에서만 접근 가능. 다른 package에서는 접근 불가.
		//System.out.println(ad.priStr);
		//private : 같은 class 내부에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
